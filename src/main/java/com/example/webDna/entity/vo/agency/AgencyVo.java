package com.example.webDna.entity.vo.agency;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class AgencyVo {

    private Long id;
    private String name;
    private String email;
    private String phoneNo;
    private Boolean isActive;

}
