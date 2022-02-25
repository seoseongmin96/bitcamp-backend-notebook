package com.reactweb.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * packageName: com.reactweb.api
 * fileName   : CorsConfig
 * author     : seoseongmin
 * date       : 2022-02-24
 * desc       :
 * 클래스변수   :
 * 인스턴수변수 :
 * 파라미터변수 :
 * 로컬변수    :
 * ================================
 * DATE       AUTHOR        NOTE
 * ================================
 * 2022-02-24    seoseongmin        최초 생성
 */
@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedMethods(CorsConfiguration.ALL)
                .allowedHeaders(CorsConfiguration.ALL)
                .allowedOriginPatterns(CorsConfiguration.ALL);
    }
}