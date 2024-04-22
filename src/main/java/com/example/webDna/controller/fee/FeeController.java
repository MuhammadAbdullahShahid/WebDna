package com.example.webDna.controller.fee;

import com.example.webDna.entity.entities.fee.Fee;
import com.example.webDna.entity.vo.agency.AgencyVo;
import com.example.webDna.entity.vo.fee.FeeVo;
import com.example.webDna.service.agency.AgencyService;
import com.example.webDna.service.fee.FeeService;
import com.example.webDna.util.response.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth/fee")
@RequiredArgsConstructor
@CrossOrigin()
public class FeeController {

    @Autowired
    public FeeService feeService;




    @PostMapping("/saveFee")
    public ResponseEntity<?> saveFee(@RequestBody FeeVo feeVo ){
        Response response = new Response();
        feeService.saveFee(feeVo,response);
        return new ResponseEntity<>(response, HttpStatus.OK);

    }
    @PutMapping("/updateFee")
    public ResponseEntity<?> updateFee(@RequestBody FeeVo feeVo){
        Response response= new Response();
        feeService.updateFee(feeVo,response);
        return  new ResponseEntity<>(response,HttpStatus.OK);
    }

    @GetMapping("/getFee")
    public ResponseEntity<?> getFee(
            @RequestParam (value = "pageNumber",defaultValue = "0",required = false) Integer pageNumber,
            @RequestParam(value="pageValue",defaultValue = "20",required = false) Integer pageSize){

        Response response = new Response();
        feeService.getFee(pageNumber,pageSize,response);
        return new ResponseEntity<>(response,HttpStatus.OK);


    }

    @DeleteMapping("/deleteFee")
    public ResponseEntity<?> deleteFee(@RequestParam Long id){
        Response response = new Response();
        feeService.deleteFee(id,response);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }
}
