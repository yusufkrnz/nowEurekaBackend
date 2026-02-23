package com.nowEurekaBackend.nowEurekaBackend.Auth.security;

import lombok.Value;
import org.springframework.stereotype.Component;


@Component
public class JwtUtil {


    @Value("${app.jwt.secret:change-me-to-strong-secret}")
    private String jwtSecret;



}
