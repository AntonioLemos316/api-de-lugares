package br.com.lemos.service_de_lugares.domain;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

// Criamos a interface PlaceRepository que extend a entidade Place e seu tipo
// para um framework reativo do spring 
public interface PlaceRepository extends ReactiveCrudRepository<Place, Long>{
    
}
