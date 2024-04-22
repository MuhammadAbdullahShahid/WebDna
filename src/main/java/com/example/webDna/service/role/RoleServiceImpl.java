package com.example.webDna.service.role;

import com.example.webDna.entity.entities.user.role.Role;
import com.example.webDna.entity.vo.role.RoleVo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService{

    @Autowired
    ModelMapper modelMapper;

    public Role toEntity(RoleVo roleVo) {
        return modelMapper.map(roleVo, Role.class);
    }

    public RoleVo toVo(Role role) {
        return modelMapper.map(role, RoleVo.class);
    }



}
