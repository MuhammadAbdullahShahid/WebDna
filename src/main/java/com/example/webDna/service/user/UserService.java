package com.example.webDna.service.user;

import com.example.webDna.entity.vo.userVo.UserRequest;
import com.example.webDna.util.response.Response;

public interface UserService {
    Response signUp(UserRequest userRequest, Response response);
}
