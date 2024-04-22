package com.example.webDna.controller.agency;

import com.example.webDna.entity.vo.agency.AgencyVo;
import com.example.webDna.entity.vo.userVo.UserRequest;
import com.example.webDna.service.agency.AgencyService;
import com.example.webDna.util.response.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/auth/agency")
@CrossOrigin()
public class AgencyController {
    @Autowired
    public AgencyService agencyService;

    @PostMapping("/saveAgency")
    public ResponseEntity<?> saveAgency(@RequestBody AgencyVo agencyVo ){
        Response response = new Response();
        agencyService.saveAgency(agencyVo,response);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

    @PutMapping("/updateAgency")
    public ResponseEntity<?> updateAgency(@RequestBody AgencyVo agencyVo ){
        Response response = new Response();
        agencyService.updateAgency(agencyVo,response);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

    @GetMapping("/getAgency")
    public ResponseEntity<?> getAgency(
            @RequestParam(value="pageNumber",defaultValue = "0",required = false) Integer pageNumber,
            @RequestParam(value="pageSize", defaultValue = "20",required = false) Integer pageSize){
        Response response = new Response();
        agencyService.getAgency(pageNumber,pageSize,response);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }


    @DeleteMapping("/deleteAgency")
    public ResponseEntity<?> deleteUser(@RequestParam Long id) {
        // Call the service method to delete the user by ID
        Response response = new Response();
        agencyService.deleteAgencyById(id,response);
        return new  ResponseEntity<>(response,HttpStatus.OK);
    }
}
