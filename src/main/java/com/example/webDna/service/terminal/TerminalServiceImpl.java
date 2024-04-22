package com.example.webDna.service.terminal;

import com.example.webDna.entity.entities.agency.Agency;
import com.example.webDna.entity.entities.city.City;
import com.example.webDna.entity.entities.industry.Industry;
import com.example.webDna.entity.entities.terminal.Terminal;
import com.example.webDna.entity.vo.terminal.TerminalVo;
import com.example.webDna.repository.TerminalRepository;
import com.example.webDna.util.response.Response;
import com.example.webDna.util.response.WebDnaResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TerminalServiceImpl implements TerminalService{

    @Autowired
    ModelMapper modelMapper;
    @Autowired
    TerminalRepository terminalRepository;


    @Override
    public Response saveTerminal(TerminalVo terminalVo, Response response) {
        Terminal terminal= null;
        try{
            if(terminalVo !=null && terminalVo.getId() ==null){
                terminal = new Terminal();

                terminal.setAcquiredBy(terminalVo.getAcquiredBy());
                terminal.setAccountTitle(terminalVo.getAccountTitle());
                terminal.setApplicableChargeValue(terminalVo.getApplicableChargeValue());

                terminal.setBankName(terminalVo.getBankName());
                terminal.setChannel(terminalVo.getChannel());
                terminal.setLegalBusinessName(terminalVo.getLegalBusinessName());
                terminal.setBrandName(terminalVo.getBrandName());
                terminal.setOwnerName(terminalVo.getOwnerName());
                terminal.setOwnerContact(terminalVo.getOwnerContact());
                terminal.setOwnerEmail(terminalVo.getOwnerEmail());
                terminal.setBusinessStatus(terminalVo.getBusinessStatus());
                terminal.setBusinessEmail(terminalVo.getBusinessEmail());
                terminal.setBusinessType(terminalVo.getBusinessType());
                terminal.setMarketScope(terminalVo.getMarketScope());
                terminal.setBusinessAddress1(terminalVo.getBusinessAddress1());
                terminal.setBusinessAddress2(terminalVo.getBusinessAddress2());
                terminal.setBusinessAddress3(terminalVo.getBusinessAddress3());
                terminal.setNoOfOutlets(terminalVo.getNoOfOutlets());
                terminal.setBusinessStartDate(terminalVo.getBusinessStartDate());
                terminal.setNtnNo(terminalVo.getNtnNo());
                terminal.setBusinessContactPerson(terminalVo.getBusinessContactPerson());
                terminal.setContact(terminalVo.getContact());
                terminal.setEmail(terminalVo.getEmail());
                terminal.setDesignation(terminalVo.getDesignation());
                terminal.setBusinessIndustry(terminalVo.getBusinessIndustry());
                terminal.setNoOfCheckouts(terminalVo.getNoOfOutlets());
                terminal.setNoOfAvailablePos(terminalVo.getNoOfAvailablePos());
                terminal.setPerDayCardTransaction(terminalVo.getPerDayCardTransaction());
                terminal.setPerDayCardVolume(terminalVo.getPerDayCardVolume());
                terminal.setAverageTransactionSizeOnCard(terminalVo.getAverageTransactionSizeOnCard());
                terminal.setNoOfCtmsRequired(terminalVo.getNoOfCtmsRequired());
                terminal.setExpectedDailyTransactions(terminalVo.getExpectedDailyTransactions());
                terminal.setBankName(terminalVo.getBankName());
                terminal.setIbanAccountNumber(terminalVo.getIbanAccountNumber());
                terminal.setAccountTitle(terminalVo.getAccountTitle());
                terminal.setBankImd(terminalVo.getBankImd());
                terminal.setBestAvailableInternetService(terminalVo.getBestAvailableInternetService());
                terminal.setAvailableInternetServices(terminalVo.getAvailableInternetServices());
                terminal.setDocsSubmitted(terminalVo.getDocsSubmitted());
                terminal.setDateOfEmployment(terminalVo.getDateOfEmployment());
                terminal.setSecurityDeposit(terminalVo.getSecurityDeposit());
                terminal.setPosSerial(terminalVo.getPosSerial());
                terminal.setPosStartDate(terminalVo.getPosStartDate());
                terminal.setTid(terminalVo.getTid());
                terminal.setRbsChannelCode(terminalVo.getRbsChannelCode());
                terminal.setRbsMerchantCategoryCode(terminalVo.getRbsMerchantCategoryCode());
                terminal.setRbsSequentialCode(terminalVo.getRbsSequentialCode());
                terminal.setMachineId(terminalVo.getMachineId());
                terminal.setMerchantId(terminalVo.getMerchantId());
                terminal.setTaxZone(terminalVo.getTaxZone());
                terminal.setStatus(terminalVo.getStatus());
                terminal.setStatusDate(terminalVo.getStatusDate());
                terminal.setMovementReference(terminalVo.getMovementReference());
                terminal.setChargesSchema(terminalVo.getChargesSchema());
                terminal.setApplicableChargeValue(terminalVo.getApplicableChargeValue());
                terminal.setChargesFloor(terminalVo.getChargesFloor());
                terminal.setDailySettlementVoucher(terminalVo.getDailySettlementVoucher());

                terminal = terminalRepository.save(terminal);
                if(terminal != null){
                    TerminalVo terminalVo1 = toVo(terminal);

                    response.setResponse(WebDnaResponse.SUCCESS);
                    response.setData("Data",terminalVo1);
                }else{
                    response.setCode("400");
                    response.setMessage("Record not saved");
                }

            }

        }catch(Exception e){
            e.printStackTrace();
            response.setResponse(WebDnaResponse.FAILED);
        }

        return response;
    }

    @Override
    public Response updateTerminal(TerminalVo terminalVo, Response response) {
        Optional<Terminal> terminalOptional= null;
        try{
            if(terminalVo !=null && terminalVo.getId()!= null){
                terminalOptional = terminalRepository.findById(terminalVo.getId());
               if(terminalOptional.isPresent()) {
                   Terminal terminal = terminalOptional.get();


                   terminal.setAcquiredBy(terminalVo.getAcquiredBy());
                   terminal.setAccountTitle(terminalVo.getAccountTitle());
                   terminal.setApplicableChargeValue(terminalVo.getApplicableChargeValue());

                   terminal.setBankName(terminalVo.getBankName());
                   terminal.setChannel(terminalVo.getChannel());
                   terminal.setLegalBusinessName(terminalVo.getLegalBusinessName());
                   terminal.setBrandName(terminalVo.getBrandName());
                   terminal.setOwnerName(terminalVo.getOwnerName());
                   terminal.setOwnerContact(terminalVo.getOwnerContact());
                   terminal.setOwnerEmail(terminalVo.getOwnerEmail());
                   terminal.setBusinessStatus(terminalVo.getBusinessStatus());
                   terminal.setBusinessEmail(terminalVo.getBusinessEmail());
                   terminal.setBusinessType(terminalVo.getBusinessType());
                   terminal.setMarketScope(terminalVo.getMarketScope());
                   terminal.setBusinessAddress1(terminalVo.getBusinessAddress1());
                   terminal.setBusinessAddress2(terminalVo.getBusinessAddress2());
                   terminal.setBusinessAddress3(terminalVo.getBusinessAddress3());
                   terminal.setNoOfOutlets(terminalVo.getNoOfOutlets());
                   terminal.setBusinessStartDate(terminalVo.getBusinessStartDate());
                   terminal.setNtnNo(terminalVo.getNtnNo());
                   terminal.setBusinessContactPerson(terminalVo.getBusinessContactPerson());
                   terminal.setContact(terminalVo.getContact());
                   terminal.setEmail(terminalVo.getEmail());
                   terminal.setDesignation(terminalVo.getDesignation());
                   terminal.setBusinessIndustry(terminalVo.getBusinessIndustry());
                   terminal.setNoOfCheckouts(terminalVo.getNoOfOutlets());
                   terminal.setNoOfAvailablePos(terminalVo.getNoOfAvailablePos());
                   terminal.setPerDayCardTransaction(terminalVo.getPerDayCardTransaction());
                   terminal.setPerDayCardVolume(terminalVo.getPerDayCardVolume());
                   terminal.setAverageTransactionSizeOnCard(terminalVo.getAverageTransactionSizeOnCard());
                   terminal.setNoOfCtmsRequired(terminalVo.getNoOfCtmsRequired());
                   terminal.setExpectedDailyTransactions(terminalVo.getExpectedDailyTransactions());
                   terminal.setBankName(terminalVo.getBankName());
                   terminal.setIbanAccountNumber(terminalVo.getIbanAccountNumber());
                   terminal.setAccountTitle(terminalVo.getAccountTitle());
                   terminal.setBankImd(terminalVo.getBankImd());
                   terminal.setBestAvailableInternetService(terminalVo.getBestAvailableInternetService());
                   terminal.setDocsSubmitted(terminalVo.getDocsSubmitted());
                   terminal.setDateOfEmployment(terminalVo.getDateOfEmployment());
                   terminal.setSecurityDeposit(terminalVo.getSecurityDeposit());
                   terminal.setPosSerial(terminalVo.getPosSerial());
                   terminal.setPosStartDate(terminalVo.getPosStartDate());
                   terminal.setTid(terminalVo.getTid());
                   terminal.setRbsChannelCode(terminalVo.getRbsChannelCode());
                   terminal.setRbsMerchantCategoryCode(terminalVo.getRbsMerchantCategoryCode());
                   terminal.setRbsSequentialCode(terminalVo.getRbsSequentialCode());
                   terminal.setMachineId(terminalVo.getMachineId());
                   terminal.setMerchantId(terminalVo.getMerchantId());
                   terminal.setTaxZone(terminalVo.getTaxZone());
                   terminal.setStatus(terminalVo.getStatus());
                   terminal.setStatusDate(terminalVo.getStatusDate());
                   terminal.setMovementReference(terminalVo.getMovementReference());
                   terminal.setChargesSchema(terminalVo.getChargesSchema());
                   terminal.setApplicableChargeValue(terminalVo.getApplicableChargeValue());
                   terminal.setChargesFloor(terminalVo.getChargesFloor());
                   terminal.setDailySettlementVoucher(terminalVo.getDailySettlementVoucher());

                   terminal = terminalRepository.save(terminal);
                   if (terminal != null) {
                       TerminalVo terminalVo1 = toVo(terminal);

                       response.setResponse(WebDnaResponse.SUCCESS);
                       response.setData("Data", terminalVo1);
                   } else {
                       response.setCode("400");
                       response.setMessage("Record not saved");
                   }
               }else {
                   response.setCode("400");
                   response.setMessage("Record not saved");
               }

            }

        }catch(Exception e){
            e.printStackTrace();
            response.setResponse(WebDnaResponse.FAILED);
        }

        return response;
    }

    @Override
    public Response deleteTerminal(Long id, Response response) {
      Optional<Terminal> terminal = null;
       try{
           terminal= terminalRepository.findById(id);
           if(terminal.isPresent()){
                terminalRepository.deleteById(terminal.get().getId());
           }else {

               response.setCode("400");
               response.setMessage("Record not saved");
           }
           response.setResponse(WebDnaResponse.SUCCESS);

       }catch (Exception e ){
           e.printStackTrace();
           response.setResponse(WebDnaResponse.FAILED);
       }


        return null;
    }

    @Override
    public Response getTerminal(Integer pagenumber,Integer pageSize,Response response) {
        Page<Terminal> terminal = null;

        try{

            Pageable p = PageRequest.of(pagenumber,pageSize);
            terminal = terminalRepository.findAll(p);
            List<Terminal> terminalList = terminal.getContent();
            if(terminalList != null && terminalList.size()>0) {
                List<TerminalVo> terminalVos = new ArrayList<>();
                for (Terminal terminal1 : terminalList) {
                    terminalVos.add(toVo(terminal1));
                }
                response.setResponse(WebDnaResponse.SUCCESS);
                response.setData("Data",terminalVos);
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


    public Terminal toEntity(TerminalVo terminalVo){
        return modelMapper.map(terminalVo,Terminal.class);
    }

    public TerminalVo toVo(Terminal terminal){
        return modelMapper.map(terminal,TerminalVo.class);
    }
}
