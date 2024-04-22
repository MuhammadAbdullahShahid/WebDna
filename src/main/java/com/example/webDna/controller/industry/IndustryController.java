package com.example.webDna.controller.industry;


import com.example.webDna.entity.vo.industry.IndustryVo;
import com.example.webDna.service.industry.IndustryService;
import com.example.webDna.util.response.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/auth/industry")
@CrossOrigin()
public class IndustryController {

    @Autowired
    IndustryService industryService;

    @GetMapping("/getIndustry")
    public ResponseEntity<?> geeIndustry(
            @RequestParam(value = "pageNumber", defaultValue = "20",required = false) Integer pageNumber,
            @RequestParam (value = "pageSize",defaultValue = "0",required = false) Integer pageSize){

        Response response = new Response();
        industryService.getIndustry(pageNumber,pageSize,response);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/saveIndustry")
    public ResponseEntity<?> saveIndustry(@RequestBody IndustryVo industryVo){
        Response response = new Response();
        industryService.saveIndustry(industryVo,response);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

    @PutMapping("/updateIndustry")
    public ResponseEntity<?> updateIndutry(@RequestBody IndustryVo industryVo){

        Response response= new Response();
        industryService.updateIndustry(response,industryVo);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

    @DeleteMapping("/deleteIndustry")
    public ResponseEntity<?> deleteIndustry(@RequestParam Long id){
        Response response= new Response();

        industryService.deleteIndustry(response,id);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }
}
