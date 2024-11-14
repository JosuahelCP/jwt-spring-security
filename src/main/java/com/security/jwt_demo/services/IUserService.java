package com.security.jwt_demo.services;

import com.security.jwt_demo.dto.AuthResponse;
import com.security.jwt_demo.dto.RegisterRequest;
import com.security.jwt_demo.entities.User;

import java.util.Optional;

public interface IUserService {
    public AuthResponse register(RegisterRequest request);
}
