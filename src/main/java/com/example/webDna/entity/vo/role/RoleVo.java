package com.example.webDna.entity.vo.role;

import com.example.webDna.entity.vo.userVo.UserVo;
import com.example.webDna.entity.vo.permission.PermissionVo;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class RoleVo {

    private Long id;
    private String code;
    private String name;
    private Set<PermissionVo> permissionVo;
    private UserVo createdBy;
    private String createdDate;
    private UserVo updatedBy;
    private String updatedDate;
    private int status;

}
