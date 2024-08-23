package br.com.lemos.service_de_lugares.domain;

import br.com.lemos.service_de_lugares.api.PlaceResponse;

public class PlaceMapper {
    // Chamamos a classe PlaceResponse diretamente sem precisar instanciar
    // Recebemos um parametro do tipo Place
    // Retornamos uma nova instancia como DTO para ser usado como resposta da API 
    // ou qualquer outra necessidade
    public static PlaceResponse fromPlaceToResponse(Place place) {
        return new PlaceResponse(
            place.name(),
            place.slug(),
            place.state(),
            place.createdAt(), 
            place.updatedAt());
    }
}
