package com.security.jwt_demo.controllers.no_auth;

import com.security.jwt_demo.dto.AuthResponse;
import com.security.jwt_demo.dto.LoginRequest;
import com.security.jwt_demo.dto.RegisterRequest;
import com.security.jwt_demo.services.IAuthService;
import com.security.jwt_demo.services.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class NoAuthController {
    @Autowired
    private IUserService userService;
    @Autowired
    private IAuthService authService;

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request){
        return ResponseEntity.ok(authService.login(request));
    }

    @PostMapping("/register")
    public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest request){
        return ResponseEntity.ok(userService.register(request));
    }
}
