package br.com.lemos.service_de_lugares.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.config.EnableR2dbcAuditing;

import br.com.lemos.service_de_lugares.domain.PlaceRepository;
import br.com.lemos.service_de_lugares.domain.PlaceService;

// Essa classe é reponsavel por definir e configurar os beans
@Configuration
@EnableR2dbcAuditing
public class PlaceConfig {
    
    // Metodo placeservice que cria e retorna um objeto de PlaceService
    // O spring gerencia e injeta o PlaceRepository conforme necessario
    @Bean
    PlaceService placeService(PlaceRepository placeRepository){
        return new PlaceService(placeRepository);
    }
}
