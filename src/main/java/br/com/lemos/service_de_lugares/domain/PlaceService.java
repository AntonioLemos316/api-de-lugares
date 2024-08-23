package br.com.lemos.service_de_lugares.domain;

import com.github.slugify.Slugify;

import br.com.lemos.service_de_lugares.api.PlaceRequest;
import reactor.core.publisher.Mono;

// Criamos Place service que vai injetar o Place repository com o metodo construtor
public class PlaceService {
    private PlaceRepository placeRepository;
    private Slugify slg;

    public PlaceService(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
        this.slg = Slugify.builder().build();
    }

    // Metodo publico que cria um objeto da Entidade Place e retorna um Mono que representa 
    // uma operação assíncrona contendo o objeto Place que foi salvo ou sinaliza a falha se ocorrer
    public Mono<Place> create(PlaceRequest placeRequest) {
        var place = new Place(
            null, 
            placeRequest.name(), 
            slg.slugify(placeRequest.name()), 
            placeRequest.state(), 
            null, 
            null);
        return placeRepository.save(place);
    }
}
