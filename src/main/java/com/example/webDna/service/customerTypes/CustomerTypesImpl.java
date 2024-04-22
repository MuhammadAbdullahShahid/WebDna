package com.example.webDna.service.customerTypes;

import com.example.webDna.entity.entities.CustomerTypes;
import com.example.webDna.entity.vo.customerTypes.CustomerTypesVo;
import jakarta.persistence.Access;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class CustomerTypesImpl implements CustomerTypesService{

    @Autowired
    ModelMapper modelMapper;

    public CustomerTypes toEntity(CustomerTypesVo customerTypesVo) {
        return modelMapper.map(customerTypesVo, CustomerTypes.class);
    }

    public CustomerTypesVo toVo(CustomerTypes customerTypes) {
        return modelMapper.map(customerTypes, CustomerTypesVo.class);
    }
}
