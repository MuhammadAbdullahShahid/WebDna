package com.example.webDna.entity.vo.systemParameter;

import lombok.Data;

@Data
public class SystemParameterVo {

    private Long  id;
    private String name;
    private String value;
    private String type;
    private Boolean active;
}
