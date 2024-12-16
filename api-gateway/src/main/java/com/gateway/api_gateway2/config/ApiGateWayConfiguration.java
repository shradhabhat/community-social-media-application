package com.gateway.api_gateway2.config;


import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGateWayConfiguration {

	@Bean
	public RouteLocator gateWayRouter(RouteLocatorBuilder builder) {
		return builder.routes().
				route(q->q.path("/get").
						filters(f -> f.addRequestHeader("Hello", "World")).
						uri("http://httpbin.org:80")).
				//route(p->p.path("/feignclientForSecurityTest/**").uri("lb://restful-web-services")).
				route(p->p.path("/auth/**").uri("lb://identity-service2")).
				route(r->r.path("/users/**").uri("lb://restful-web-services")).
				route(r->r.path("/posts/**").uri("lb://restful-web-services")).
				route(r->r.path("/comments/**").uri("lb://restful-web-services")).
				route(r->r.path("/likes/**").uri("lb://restful-web-services"))
				.build();
	}
}
