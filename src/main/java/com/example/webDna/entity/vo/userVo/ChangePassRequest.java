package com.example.webDna.entity.vo.userVo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class ChangePassRequest {
    private String email;
    private String oldPassword;
    private String newPassword;
    private  String secretQuestion;
    private String secretAnswer;
}
