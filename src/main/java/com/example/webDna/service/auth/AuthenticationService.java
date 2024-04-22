package com.example.webDna.service.auth;


import com.example.webDna.controller.auth.AuthenticateRequest;
import com.example.webDna.controller.auth.AuthenticationResponse;
import com.example.webDna.controller.auth.RegisterRequest;
import com.example.webDna.entity.entities.user.User;
import com.example.webDna.entity.entities.user.role.Role;
import com.example.webDna.repository.UserRepository;
import com.example.webDna.security.config.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;
    public AuthenticationResponse register(RegisterRequest request) {

       // List<Role> roleList = request.
        User user= User.builder()
                    .firstName(request.getFirstname())
                    .lastName(request.getLastname())
                    .email(request.getEmail())
                    .password(passwordEncoder.encode(request.getPassword()))
//                    .roles.stream()
//                    .map(role -> new SimpleGrantedAuthority(role.getName()))
//                    .collect(Collectors.toList())
                    .build();
        userRepository.save(user);

        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();

    }

    public AuthenticationResponse authenticate(AuthenticateRequest request) {

        Optional<User> userOptional  = userRepository.findByEmail(request.getEmail());

        if ( userOptional.isPresent() ) {
            User user = userOptional.get();
            if ( passwordEncoder.matches(request.getPassword(), user.getPassword())) {

                var jwtToken = jwtService.generateToken(user);
                return AuthenticationResponse.builder()
                        .token(jwtToken)
                        .build();
            }

        }
        return null;
    }
}
