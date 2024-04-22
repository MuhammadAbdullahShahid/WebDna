package com.example.webDna.service.fee;

import com.example.webDna.entity.vo.agency.AgencyVo;
import com.example.webDna.entity.vo.fee.FeeVo;
import com.example.webDna.util.response.Response;

public interface FeeService {
    Response saveFee(FeeVo feeVo, Response response);

    Response updateFee(FeeVo feeVo, Response response);

    Response deleteFee(Long id,Response response);

    Response getFee(Integer pageNumber,Integer pageSize,Response response);
}
