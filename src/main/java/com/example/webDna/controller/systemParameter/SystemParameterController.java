package com.example.webDna.controller.systemParameter;


import com.example.webDna.entity.vo.systemParameter.SystemParameterVo;
import com.example.webDna.service.systemParameter.SystemParameterService;
import com.example.webDna.util.response.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth/systemParameter")
@RequiredArgsConstructor
@CrossOrigin()
public class SystemParameterController {

    @Autowired
    SystemParameterService systemParameterService;

    @PostMapping("/saveSystemParameters")
    public ResponseEntity<?> saveSystemParameters(@RequestBody SystemParameterVo systemParameterVo){
        Response response = new Response();
        systemParameterService.saveSystemParameters(systemParameterVo,response);
        return new ResponseEntity<>(response, HttpStatus.OK);

    }

    @PutMapping("/updateSystemParameters")
    public ResponseEntity<?> updateSystemParameters(@RequestBody SystemParameterVo systemParameterVo){
        Response response = new Response();
        systemParameterService.updateSystemParameters(systemParameterVo,response);
        return new ResponseEntity<>(response, HttpStatus.OK);

    }

    @GetMapping("/getSystemParameter")
    public ResponseEntity<?> getSystemParameter(
            @RequestParam (value = "pageNumber", defaultValue = "0", required = false) Integer pageNumber,
            @RequestParam(value=  "pageSize", defaultValue= "20", required = false) Integer pageSize){
        Response response = new Response();
        systemParameterService.getSystemParameter(pageNumber,pageSize,response);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

    @DeleteMapping("/deleteSystemParameter")
    public ResponseEntity<?> deleteSystemParameter(@RequestParam Long id){
        Response response = new Response();
        systemParameterService.deleteSystemParameter(id,response);
        return new ResponseEntity<>(response,HttpStatus.OK);

    }

}
