package com.security.jwt_demo.services;

import com.security.jwt_demo.dto.AuthResponse;
import com.security.jwt_demo.dto.LoginRequest;

public interface IAuthService {
    public AuthResponse login(LoginRequest request);
}
