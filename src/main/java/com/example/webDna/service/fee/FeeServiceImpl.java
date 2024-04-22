package com.example.webDna.service.fee;

import com.example.webDna.entity.entities.agency.Agency;
import com.example.webDna.entity.entities.fee.Fee;
import com.example.webDna.entity.vo.agency.AgencyVo;
import com.example.webDna.entity.vo.fee.FeeVo;
import com.example.webDna.repository.FeeRepository;
import com.example.webDna.util.response.Response;
import com.example.webDna.util.response.WebDnaResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FeeServiceImpl implements FeeService{

    @Autowired
    ModelMapper modelMapper;
    @Autowired
    FeeRepository feeRepository;



    @Override
    public Response saveFee(FeeVo feeVo, Response response) {
        Fee fee=null;
        try{
            if((feeVo != null) && (feeVo.getId() == null)){

                fee = new Fee();
                fee.setDescription(feeVo.getDescription());
                fee.setName(feeVo.getName());
                fee.setFeeAmount(feeVo.getFeeAmount());

                fee = feeRepository.save(fee);

                if(fee.getId()!=null){
                    FeeVo feeVo1= toVo(fee);
                    response.setResponse(WebDnaResponse.SUCCESS);
                    response.setData("Data",feeVo1);

                }
            }

        }catch (Exception e){
            e.printStackTrace();
            response.setResponse(WebDnaResponse.FAILED);
        }

        return response;
    }

    @Override
    public Response updateFee(FeeVo feeVo, Response response) {

        Optional<Fee> optionalFee= null;
        try{

            if(feeVo !=null && feeVo.getId()!=null) {
                optionalFee = feeRepository.findById(feeVo.getId());

                if (optionalFee.isPresent()) {
                    Fee fee = optionalFee.get();

                    fee.setFeeAmount(feeVo.getFeeAmount());
                    fee.setName(feeVo.getName());
                    fee.setDescription(feeVo.getDescription());

                    fee = feeRepository.save(fee);

                    if (fee != null) {
                        FeeVo feeVo1= toVo(fee);


                        response.setResponse(WebDnaResponse.SUCCESS);
                        response.setData("Data", feeVo1);

                    }
                }else {
                    response.setCode("400");
                    response.setMessage("Fee not found");
                    return response;

                }
            }
        }catch (Exception e){
            e.printStackTrace();
            response.setResponse(WebDnaResponse.FAILED);
        }

        return null;
    }


    @Override
    public Response deleteFee(Long id,Response response) {
        Optional<Fee> feeOptional;
        //  Response response = new Response();
        try{
            feeOptional= feeRepository.findById(id);
            if(feeOptional.isEmpty()){
                response.setCode("400");
                response.setMessage("No record found");
                return response;
            }

            else {
                feeRepository.deleteById(id);

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
    public Response getFee(Integer pageNumber,Integer pageSize, Response response) {

        Page<Fee> fee= null;

        try{
            Pageable p = PageRequest.of(pageNumber,pageSize);
            fee = feeRepository.findAll(p);

            List<Fee> feeList = fee.getContent();

            if(feeList.size()>0 && feeList!=null) {
                List<FeeVo> feeVos = new ArrayList<>();

                for (Fee fees : feeList) {
                    feeVos.add(toVo(fees));
                }

                response.setResponse(WebDnaResponse.SUCCESS);
                response.setData("Data", feeVos);
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


    public FeeVo toVo(Fee fee){
        return modelMapper.map(fee,FeeVo.class);
    }

    public Fee toEntity(FeeVo feeVo){
        return modelMapper.map(feeVo,Fee.class);
    }



}
