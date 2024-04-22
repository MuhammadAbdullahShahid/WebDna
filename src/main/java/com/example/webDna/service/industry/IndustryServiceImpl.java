package com.example.webDna.service.industry;

import com.example.webDna.entity.entities.industry.Industry;
import com.example.webDna.entity.vo.industry.IndustryVo;
import com.example.webDna.repository.IndustryRepository;
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
public class IndustryServiceImpl implements IndustryService {

    @Autowired
    IndustryRepository industryRepository;
    @Autowired
    ModelMapper modelMapper;

    @Override
    public Response getIndustry(Integer pageNumber,Integer pageSize,Response response) {

        Page<Industry> industry= null;

        try{

            Pageable p = PageRequest.of(pageNumber,pageSize);
            industry = industryRepository.findAll(p);
            List<Industry> industryList = industry.getContent();

            if(industryList.size()>0){
                List<IndustryVo> industryVos = new ArrayList<>();

                for(Industry industries: industryList){
                    industryVos.add(toVo(industries));
                }

                response.setResponse(WebDnaResponse.SUCCESS);
                response.setData("Data",industryVos);
            }else {
                response.setCode("400");
                response.setMessage("No record found");
                return response;
            }


        }catch (Exception e){
            e.printStackTrace();
            response.setResponse(WebDnaResponse.FAILED);
        }

        return null;
    }

    @Override
    public Response saveIndustry(IndustryVo industryVo,Response response) {

        Industry industry= null;
        try{
            if(industryVo!=null && industryVo.getId()==null){
                industry= new Industry();

                industry.setName(industryVo.getName());
                industry = industryRepository.save(industry);

                if(industry.getId()!=null){
                    IndustryVo industryVo1=toVo(industry);

                    response.setResponse(WebDnaResponse.SUCCESS);
                    response.setData("Data",industryVo1);
                }else {
                    response.setCode("400");
                    response.setMessage("Industry not saved");
                }
            }


        }catch (Exception e){
            e.printStackTrace();
            response.setResponse(WebDnaResponse.FAILED);
        }

        return response;
    }

    @Override
    public Response updateIndustry(Response response, IndustryVo industryVo) {

        Optional<Industry> optionalIndustry=null;
        try{
            optionalIndustry = industryRepository.findById(industryVo.getId());
            if(optionalIndustry.isPresent()){
                Industry industry= optionalIndustry.get();

                industry.setName(industryVo.getName());
                industry = industryRepository.save(industry);
                if(industry!=null){

                    IndustryVo industryVo1= toVo(industry);
                    response.setResponse(WebDnaResponse.SUCCESS);
                    response.setData("Data",industryVo1);
                }else {
                    response.setCode("400");
                    response.setMessage("Industry not saved");
                }
            }

        }catch (Exception e){
            e.printStackTrace();
            response.setResponse(WebDnaResponse.FAILED);
        }

        return response;
    }

    @Override
    public Response deleteIndustry(Response response, Long id) {

        Optional<Industry> industry= null;
        try {
            industry = industryRepository.findById(id);
            if(industry.isPresent()) {
                industryRepository.deleteById(industry.get().getId());

                response.setResponse(WebDnaResponse.SUCCESS);
            }
        }catch (Exception e){
            e.printStackTrace();
            response.setResponse(WebDnaResponse.FAILED);
        }

        return response;
    }


    public Industry toEntity(IndustryVo industryVo){
        return modelMapper.map(industryVo,Industry.class);
    }

    public IndustryVo toVo(Industry industry){
        return modelMapper.map(industry,IndustryVo.class);
    }
}
