package com.example.webDna.service.status;

import com.example.webDna.entity.entities.Status;
import com.example.webDna.entity.vo.Status.StatusVo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Service;

@Service
public class StatusServiceImpl implements StatusService{

    @Autowired
    ModelMapper modelMapper;


    public Status toEntity(StatusVo statusVo) {
        return modelMapper.map(statusVo, Status.class);
    }

    public StatusVo toVo(Status status) {
        return modelMapper.map(status, StatusVo.class);
    }
}
