package com.sapient.api.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

@Bean
public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
return builder.routes()
		.route(r-> r.path("/message1").filters( f-> f.rewritePath("/message1", "/message")).uri("http://localhost:9090/")).build();
}
}
