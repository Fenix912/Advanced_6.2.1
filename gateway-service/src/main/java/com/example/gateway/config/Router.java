package com.example.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Router {

    private final Filter filter;

    public Router(Filter filter) {
        this.filter = filter;
    }

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("book-service",
                        r -> r
                                .path("/api/**")
                                .filters(f -> f.filter(filter))
                                .uri("http://localhost:8888"))
                                .build();
    }
}
