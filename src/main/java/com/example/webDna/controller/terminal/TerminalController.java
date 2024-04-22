package com.example.webDna.controller.terminal;

import com.example.webDna.entity.vo.terminal.TerminalVo;
import com.example.webDna.service.terminal.TerminalService;
import com.example.webDna.util.response.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth/terminal")
@RequiredArgsConstructor
@CrossOrigin()
public class TerminalController {

    @Autowired
    TerminalService terminalService;

    @PostMapping("/saveTerminal")
    public ResponseEntity<?> saveTerminal(@RequestBody TerminalVo terminalVo){
        Response response = new Response();
        terminalService.saveTerminal(terminalVo,response);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PutMapping("/updateTerminal")
    public ResponseEntity<?> updateTerminal(@RequestBody TerminalVo terminalVo){
        Response response = new Response();
        terminalService.updateTerminal(terminalVo,response);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/getTerminals")
    public ResponseEntity<?> getTerminal(
            @RequestParam (value = "pageNumber",defaultValue = "0",required = false)Integer pageNumber,
            @RequestParam (value ="pageSize", defaultValue = "20",required = false) Integer pageSize
    ){
        Response response = new Response();
        terminalService.getTerminal(pageNumber,pageSize,response);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

    @DeleteMapping("/deleteTerminal")
    public ResponseEntity<?> deleteTerminal(@RequestParam Long id){
        Response response = new Response();
        terminalService.deleteTerminal(id,response);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
