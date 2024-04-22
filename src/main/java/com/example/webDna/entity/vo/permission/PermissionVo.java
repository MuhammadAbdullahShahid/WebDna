package com.example.webDna.entity.vo.permission;

import com.example.webDna.entity.entities.user.permission.Permission;

public class PermissionVo {

    private Long id;
    private String code;
    private String name;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public static PermissionVo getPermissionVo(Permission permission) {
        PermissionVo permissionVo = null;
        if(permission != null) {
            permissionVo = new PermissionVo();
            permissionVo.setCode(permission.getCode());
            permissionVo.setId(permission.getId());
            permissionVo.setName(permission.getName());
        }
        return permissionVo;
    }

    public static Permission getPermission(PermissionVo permissionVo) {
        Permission permission = null;
        if(permissionVo != null) {
            permission = new Permission();
            permission.setId(permissionVo.getId());
            permission.setCode(permissionVo.getCode());
            permission.setName(permissionVo.getCode());
        }
        return permission;
    }
}
