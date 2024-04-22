package com.example.webDna.service.permission;

import com.example.webDna.entity.entities.user.permission.Permission;
import com.example.webDna.entity.vo.permission.PermissionVo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PermissionServiceImpl implements PermissionService{

    @Autowired
    ModelMapper modelMapper;

    public Permission toEntity(PermissionVo permissionVo) {
        return modelMapper.map(permissionVo, Permission.class);
    }

    public PermissionVo toVo(Permission permission) {
        return modelMapper.map(permission, PermissionVo.class);
    }

}
