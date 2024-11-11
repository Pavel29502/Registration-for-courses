//package ru.english.registration_for_courses.config;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//
//
//public class CorsTest {
//
//    @Autowired
//    private TestRestTemplate restTemplate;
//
//    @Test
//    public void testCorsDisabled() {
//        // Проверяем, что CORS заголовки отсутствуют
//        ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:" + System.getProperty("local.server.port") + "/api/endpoint", String.class);
//
//        assertThat(response.getStatusCodeValue()).isEqualTo(200);
//        assertThat(response.getHeaders().getFirst("Access-Control-Allow-Origin")).isNull();
//        assertThat(response.getHeaders().getFirst("Access-Control-Allow-Methods")).isNull();
//        assertThat(response.getHeaders().getFirst("Access-Control-Allow-Headers")).isNull();
//
//        // Проверяем, что запрос выполняется успешно без CORS заголовков
//        ResponseEntity<String> response2 = restTemplate.getForEntity("http://localhost:" + System.getProperty("local.server.port") + "/api/endpoint", String.class);
//
//        assertThat(response2.getStatusCodeValue()).isEqualTo(200);
//    }
//}
