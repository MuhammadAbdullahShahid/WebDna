package com.example.webDna.entity.vo.userVo;

import com.example.webDna.entity.entities.user.User;
import com.example.webDna.entity.vo.customerTypes.CustomerTypesVo;
import com.example.webDna.entity.vo.role.RoleVo;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Data
public class UserRequest {

    private Long userID;
    private String type;
    private String firstName;
    private String email;
    private Long status;
    private String password;
    private String lastName;
    private String phoneNumber;
    private String loginName;
    private String role;

}
