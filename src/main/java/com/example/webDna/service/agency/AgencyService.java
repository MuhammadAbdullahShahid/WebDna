package com.example.webDna.service.agency;

import com.example.webDna.entity.vo.agency.AgencyVo;
import com.example.webDna.util.response.Response;

public interface AgencyService {
    Response saveAgency(AgencyVo agencyVo, Response response);

    Response getAgency(Integer pageNumber,Integer pageSize,Response response);

    Response updateAgency(AgencyVo agencyVo, Response response);

    Response deleteAgencyById(Long id,Response response);
}
