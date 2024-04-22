package com.example.webDna.service.systemParameter;

import com.example.webDna.entity.vo.systemParameter.SystemParameterVo;
import com.example.webDna.util.response.Response;

public interface SystemParameterService {
    Response saveSystemParameters(SystemParameterVo systemParameterVo, Response response);

    Response updateSystemParameters(SystemParameterVo systemParameterVo, Response response);

    Response getSystemParameter(Integer pageNumber,Integer pageSize,Response response);

    Response deleteSystemParameter(Long id,Response response);
}
