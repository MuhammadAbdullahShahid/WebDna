package com.example.webDna.service.industry;

import com.example.webDna.entity.vo.industry.IndustryVo;
import com.example.webDna.util.response.Response;

public interface IndustryService {

    Response getIndustry(Integer pageNumber,Integer pageSize,Response response);

    Response saveIndustry(IndustryVo industryVo,Response response);

    Response updateIndustry(Response response, IndustryVo industryVo);

    Response deleteIndustry(Response response, Long id);
}
