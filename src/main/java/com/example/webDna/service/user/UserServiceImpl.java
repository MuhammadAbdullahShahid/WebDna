package com.example.webDna.service.user;

import com.example.webDna.entity.entities.user.User;
import com.example.webDna.entity.entities.user.role.Role;
import com.example.webDna.entity.vo.userVo.UserRequest;
import com.example.webDna.entity.vo.userVo.UserVo;
import com.example.webDna.repository.RoleRepository;
import com.example.webDna.repository.UserRepository;
import com.example.webDna.util.response.Response;
import com.example.webDna.util.response.WebDnaResponse;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    @Autowired
    ModelMapper modelMapper;
    @Autowired
    UserRepository userRepository;
    @Autowired
    RoleRepository roleRepository;
    @Autowired
    private final PasswordEncoder passwordEncoder;

    @Override
    public Response signUp(UserRequest userRequest, Response response) {

        User user= null;
        try{
            if (StringUtils.isEmpty(userRequest.getEmail())) {
                response.setResponse(WebDnaResponse.EMAIL_IS_EMPTY);
                return response;
            } else if (StringUtils.isEmpty(userRequest.getFirstName())) {
                response.setResponse(WebDnaResponse.FIRST_NAME_EMPTY);
                return response;
            }
            boolean isEmailValid = Pattern.matches("^\\w+([\\.-]?\\w+)*(\\+\\w+)?@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+$", userRequest.getEmail());

            if (!isEmailValid){
                response.setCode("400");
                response.setResponse(WebDnaResponse.INVALID_EMAIL);
                return response;
            }

            List<User> isExistUser = userRepository.getByEmailOrLoginNameOrPhoneNumberOrIsActiveTrue(userRequest.getEmail()
                    ,userRequest.getLoginName(),userRequest.getPhoneNumber());
            if (isExistUser.size()>0){
                response.setResponse(WebDnaResponse.USER_EMAIL_EXIST);
                response.setMessage("User with these data already exists");
                return response;

            }
             user = new User();
            user.setEmail(userRequest.getEmail());
            user.setFirstName(userRequest.getFirstName());
            user.setLastName(userRequest.getLastName());
            user.setActive(true);
            user.setLoginName(userRequest.getLoginName());
            user.setPassword(passwordEncoder.encode(userRequest.getPassword()));
            user.setPhoneNumber(userRequest.getPhoneNumber());
            user.setType(userRequest.getType());


            Role role = roleRepository.findByCode(userRequest.getRole());
            if (role != null) {

                List<Role> roleList = new ArrayList<>();
                roleList.add(role);
                user.setRoles(roleList);
            } else {

                response.setCode("400");
                response.setMessage("Roles not found");
                return  response;
            }
            user = userRepository.save(user);
            if(user.getUserID()!=null){
                UserVo userVo= toVo(user);

                response.setResponse(WebDnaResponse.SUCCESS);
                response.setData("Data",userVo);
            }



        }catch (Exception e){
            e.printStackTrace();
            response.setResponse(WebDnaResponse.FAILED);
        }


        return response;
    }

    public User toEntity(UserVo usersVo) {
        return modelMapper.map(usersVo, User.class);
    }

    public UserVo toVo(User users) {
        return modelMapper.map(users, UserVo.class);
    }


}
