package com.example.webDna.service.agency;

import com.example.webDna.entity.entities.agency.Agency;
import com.example.webDna.entity.entities.user.User;
import com.example.webDna.entity.vo.agency.AgencyVo;
import com.example.webDna.entity.vo.userVo.UserVo;
import com.example.webDna.repository.AgencyRepository;
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
public class AgencyServiceImpl implements AgencyService{

    @Autowired
    ModelMapper modelMapper;
    @Autowired
    public AgencyRepository agencyRepository;


    @Override
    public Response saveAgency(AgencyVo agencyVo, Response response) {
        Optional<Agency> optionalAgency;

        try{
//            optionalAgency= agencyRepository.findById(agencyVo.getId());
//            if(optionalAgency.isPresent()){
//                response.setCode("400");
//                response.setMessage("Record already present");
//                return response;
//            }

            if(agencyVo!=null && agencyVo.getId()==null){
                Agency agency1 = new Agency();
                agency1.setEmail(agencyVo.getEmail());
                agency1.setName(agencyVo.getName());
                agency1.setPhoneNo(agencyVo.getPhoneNo());
                agency1.setIsActive(agencyVo.getIsActive());

                agency1 = agencyRepository.save(agency1);
                if (agency1.getId() != null) {
                    AgencyVo agencyVo1 = toVo(agency1);

                    response.setResponse(WebDnaResponse.SUCCESS);
                    response.setData("Data", agencyVo1);
                }

            }
        }catch (Exception e){
            e.printStackTrace();
            response.setCode("500");
            response.setResponse(WebDnaResponse.FAILED);
        }


        return response;
    }

    public Response updateAgency(AgencyVo agencyVo,Response response){

        Optional<Agency> optionalAgency;

        try{
            if(agencyVo.getId()!=null){

                optionalAgency = agencyRepository.findById(agencyVo.getId());
                if(optionalAgency.isPresent()) {

                    Agency agency = optionalAgency.get(); // Get the Agency object from the Optional
                    agency.setEmail(agencyVo.getEmail()); // Set the email value
                    agency.setName(agencyVo.getName());
                    agency.setPhoneNo(agencyVo.getPhoneNo());
                    agency.setIsActive(agencyVo.getIsActive());
                    agency =  agencyRepository.save(agency);


                    if (agency.getId() != null) {
                        AgencyVo agencyVo1 = toVo(agency);

                        response.setResponse(WebDnaResponse.SUCCESS);
                        response.setData("Data", agencyVo1);
                    }
                }else {
                    response.setCode("400");
                    response.setMessage("Agency not found");
                    return response;

                }
            }} catch(Exception e){
            e.printStackTrace();
            response.setResponse(WebDnaResponse.FAILED);

                }
        return response;
    }

    @Override
    public Response deleteAgencyById(Long id,Response response) {
        Optional<Agency> agencyOptional;
      //  Response response = new Response();
        try{
            agencyOptional= agencyRepository.findById(id);
            if(agencyOptional.isEmpty()){
                response.setCode("400");
                response.setMessage("No record found");
                return response;
            }

            else {
                agencyRepository.deleteById(id);

                response.setResponse(WebDnaResponse.SUCCESS);
                response.setMessage("User deleted successfully");
            }
        }catch (Exception e ){
            e.printStackTrace();
            response.setResponse(WebDnaResponse.FAILED);
        }


        return null;
    }

    @Override
    public Response getAgency(Integer pageNumber,Integer pageSize,Response response) {
        Page<Agency> agency= null;

        try{
            Pageable p = PageRequest.of(pageNumber,pageSize);
             agency = agencyRepository.findAll(p);

            List<Agency> agencyList = agency.getContent();

            if(agencyList.size()>0 && agencyList!=null){

                List<AgencyVo> agencyVos = new ArrayList<>();
                for (Agency agencies: agencyList){

                    agencyVos.add(toVo(agencies));

                }

                response.setResponse(WebDnaResponse.SUCCESS);
                response.setData("data", agencyVos);
                response.setMessage("Succes");
            }else {
                response.setCode("400");
                response.setMessage("No records found");
                return response;
            }



        }catch (Exception e){
            e.printStackTrace();
            response.setResponse(WebDnaResponse.FAILED);
        }

        return null;
    }

    public Agency toEntity(AgencyVo agencyVo) {
        return modelMapper.map(agencyVo, Agency.class);
    }

    public AgencyVo toVo(Agency agency){
        return  modelMapper.map(agency,AgencyVo.class);
    }
}
