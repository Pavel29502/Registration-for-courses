package ru.english.registration_for_courses.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
//public class WebConfig implements WebMvcConfigurer {
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**") // Разрешаем CORS для всех эндпоинтов
//                .allowedOrigins("http://vm4.mogilevich.net:8080", "http://localhost:8080") // Указываем нужный URL фронтенда
//                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Разрешённые HTTP-методы
//                .allowedHeaders("*")
//                .allowCredentials(true);
//    }
//}

//@Configuration
//public class WebConfig implements WebMvcConfigurer {
//
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**")
//                .allowedOrigins("http://vm4.mogilevich.net:8080", "http://localhost:8060")
//                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
////                .allowedHeaders("*")
//                .allowedHeaders("Content-Type", "Authorization", "Accept", "X-Requested-With")
////                .exposedHeaders("Content-Type", "X-Custom-Header")
//                .exposedHeaders("Content-Type", "Authorization", "Location", "X-Custom-Header")
//
//                .allowCredentials(true)
//                .maxAge(3600);
//
//        registry.addMapping("/greeting-javaconfig")
//                .allowedOrigins("http://vm4.mogilevich.net:8080", "http://localhost:8060");
//    }
//}
