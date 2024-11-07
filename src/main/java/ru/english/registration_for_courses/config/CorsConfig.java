package ru.english.registration_for_courses.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import java.util.Arrays;
import java.util.Collections;

@Configuration
public class CorsConfig {

//    @Bean
//    public CorsFilter corsFilter() {
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        CorsConfiguration config = new CorsConfiguration();
//
//        // Отключаем все настройки CORS
//        config.setAllowCredentials(false);
//        config.setAllowedOrigins(Collections.emptyList()); // Не разрешаем ни один источник
//        config.setAllowedMethods(Collections.emptyList()); // Не разрешаем ни один метод
//        config.setAllowedHeaders(Collections.emptyList()); // Не разрешаем ни один заголовок
//
//        source.registerCorsConfiguration("/**", config);
//        return new CorsFilter(source);
//    }
//}

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();

        config.setAllowCredentials(true); // Разрешаем отправку куки и данных аутентификации
        config.addAllowedOriginPattern("*"); // Разрешаем все источники
        config.setAllowedMethods(Collections.singletonList("*")); // Разрешаем все методы
        config.setAllowedHeaders(Collections.singletonList("*")); // Разрешаем все заголовки
        config.setExposedHeaders(Collections.singletonList("*")); // Разрешаем все заголовки в ответах

        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
}


