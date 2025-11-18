package es.daw.foodexpressmvc.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class AppConfig {

    @Value("${api.base-url}")
    private String apiUrl;

    @Value("${api.auth-url}")
    private String authUrl;


    @Bean
    public WebClient webClientApi(WebClient.Builder builder) {

        return builder
                .baseUrl(apiUrl)
                .build();

    }
}
