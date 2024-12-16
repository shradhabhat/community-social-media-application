package com.gateway.api_gateway2.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

import java.util.Collections;
import java.util.List;
 
@Configuration
public class CorsConfig 
    extends CorsConfiguration
{
    @Bean
    public CorsWebFilter corsFilter()
    {
        CorsConfiguration config = new CorsConfiguration();
       // config.setAllowCredentials( true );
        config.setAllowedOrigins( Collections.singletonList("*") );
        config.setAllowedMethods( List.of( "GET", "POST", "PUT", "DELETE", "OPTIONS", "HEAD" ) );
        config.setAllowedHeaders( List.of( "origin", "content-type", "accept", "authorization", "cookie" ) );
 
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration( "/**", config );
 
        return new CorsWebFilter( source );
    }
}