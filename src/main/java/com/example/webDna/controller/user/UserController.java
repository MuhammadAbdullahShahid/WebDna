package com.example.webDna.controller.user;

import com.example.webDna.entity.vo.userVo.UserRequest;
import com.example.webDna.service.user.UserService;
import com.example.webDna.util.response.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/auth/user")
@CrossOrigin()
public class UserController {


    @Autowired
    private UserService userService;

//    @RequestMapping(value="/register", method= RequestMethod.POST, produces="application/json")
//    public ResponseEntity<?> saveUser(@RequestBody Map<String, UserVo> input, HttpServletRequest request) {
//        return new ResponseEntity<Response>(userService.saveUser(input), HttpStatus.OK);
//    }

    @PostMapping("/signup")
    public ResponseEntity<?> signup(@RequestBody UserRequest userRequest){
        Response response = new Response();
        userService.signUp(userRequest,response);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
