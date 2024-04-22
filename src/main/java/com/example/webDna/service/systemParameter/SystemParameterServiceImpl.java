package com.example.webDna.service.systemParameter;

import com.example.webDna.entity.entities.systemParameter.SystemParameter;
import com.example.webDna.entity.vo.systemParameter.SystemParameterVo;
import com.example.webDna.repository.SystemParameterRepository;
import com.example.webDna.util.response.Response;
import com.example.webDna.util.response.WebDnaResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SystemParameterServiceImpl implements SystemParameterService{

    @Autowired
    ModelMapper modelMapper;
    @Autowired
    SystemParameterRepository systemParameterRepository;


    @Override
    public Response saveSystemParameters(SystemParameterVo systemParameterVo, Response response) {

        SystemParameter systemParameter= null;
        try{
            if(systemParameterVo!=null && systemParameterVo.getId()==null){
                systemParameter = new SystemParameter();

                systemParameter.setActive(systemParameterVo.getActive());
                systemParameter.setName(systemParameterVo.getName());
                systemParameter.setType(systemParameterVo.getType());
                systemParameter.setValue(systemParameterVo.getValue());

                systemParameter = systemParameterRepository.save(systemParameter);

                if(systemParameter.getId()!=null){
                    SystemParameterVo systemParameterVo1 = toVo(systemParameter);
                    response.setResponse(WebDnaResponse.SUCCESS);
                    response.setData("Data",systemParameterVo1);
                }else{
                    response.setCode("400");
                    response.setMessage("Record not saved");
                }
            }

        }catch (Exception e){
            e.printStackTrace();
            response.setResponse(WebDnaResponse.FAILED);
        }

        return response;
    }

    @Override
    public Response updateSystemParameters(SystemParameterVo systemParameterVo, Response response) {

        Optional<SystemParameter> optionalSystemParameter= null;

        try{
            optionalSystemParameter = systemParameterRepository.findById(systemParameterVo.getId());

            SystemParameter systemParameter = optionalSystemParameter.get();

            systemParameter.setValue(systemParameterVo.getValue());
            systemParameter.setType(systemParameterVo.getType());
            systemParameter.setName(systemParameterVo.getName());
            systemParameter.setActive(systemParameterVo.getActive());

            systemParameter = systemParameterRepository.save(systemParameter);

            if(systemParameter!=null){
                SystemParameterVo systemParameterVo1 = toVo(systemParameter);
                response.setResponse(WebDnaResponse.SUCCESS);
                response.setData("Data",systemParameterVo1);

            }

        }catch (Exception e ){
            e.printStackTrace();
            response.setResponse(WebDnaResponse.FAILED);
        }

        return response;
    }

    @Override
    public Response getSystemParameter(Integer pageNumber,Integer pageSize,Response response) {
        Page<SystemParameter> systemParameter= null;

        try{

            Pageable p = PageRequest.of(pageNumber,pageSize);
            systemParameter  = systemParameterRepository.findAll(p);
            List<SystemParameter> systemParameterList =  systemParameter.getContent();


            if(systemParameterList!=null && systemParameterList.size()>0) {
                List<SystemParameterVo> systemParameterVo = new ArrayList<>();
                for (SystemParameter systemParam : systemParameterList) {
                    systemParameterVo.add(toVo(systemParam) );
                }

                response.setResponse(WebDnaResponse.SUCCESS);
                response.setData("Data",systemParameterVo);
            }else {
                response.setCode("400");
                response.setMessage("No record found");
            }


        }catch (Exception e){
            e.printStackTrace();
            response.setResponse(WebDnaResponse.FAILED);
        }

        return response;
    }

    @Override
    public Response deleteSystemParameter(Long id,Response response) {

       Optional<SystemParameter> systemParameter= null;
        try{
            systemParameter = systemParameterRepository.findById(id);
            if(systemParameter!=null){

                systemParameterRepository.deleteById(systemParameter.get().getId());

                response.setResponse(WebDnaResponse.SUCCESS);
                response.setMessage("Record successfully delete");
            }
        }catch (Exception e){
            e.printStackTrace();
            response.setResponse(WebDnaResponse.FAILED);
        }

        return null;
    }


    public SystemParameter toEntity(SystemParameterVo systemParameterVo){
        return modelMapper.map(systemParameterVo,SystemParameter.class);
    }

    public SystemParameterVo toVo(SystemParameter systemParameter){
        return modelMapper.map(systemParameter,SystemParameterVo.class);
    }
}
