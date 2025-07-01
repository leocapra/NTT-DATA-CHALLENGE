package com.dio.gateway.api_gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import com.dio.gateway.api_gateway.filter.AuthenticationFilter;

@Configuration
public class GatewayConfig {

    @Bean
    @Order(Ordered.HIGHEST_PRECEDENCE)
    public AuthenticationFilter authenticationFilter() {
        return new AuthenticationFilter();
    }
}
