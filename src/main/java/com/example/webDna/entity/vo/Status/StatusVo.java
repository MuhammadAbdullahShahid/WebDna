package com.example.webDna.entity.vo.Status;

import com.example.webDna.entity.vo.userVo.UserVo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StatusVo {


    private Long id;
    private String shortDescription;
    private String Description;
    private boolean isActive;
    private UserVo createBy;
    private UserVo updateBy;
    private String createdDate;
    private String updateDate;


}
