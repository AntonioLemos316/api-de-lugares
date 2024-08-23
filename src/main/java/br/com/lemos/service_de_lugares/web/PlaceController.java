package br.com.lemos.service_de_lugares.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lemos.service_de_lugares.api.PlaceRequest;
import br.com.lemos.service_de_lugares.api.PlaceResponse;
import br.com.lemos.service_de_lugares.domain.PlaceMapper;
import br.com.lemos.service_de_lugares.domain.PlaceService;
import jakarta.validation.Valid;
import reactor.core.publisher.Mono;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

// Criamos PlaceController que vai conter nossas rotas e injetar o PlaceService
@RestController
@RequestMapping("/places")
public class PlaceController {
    private PlaceService placeService;

    public PlaceController(PlaceService placeService){
        this.placeService = placeService;
    }

    //
    @PostMapping
    public ResponseEntity<Mono<PlaceResponse>> create(@Valid @RequestBody PlaceRequest request) {
        var placeResponse = placeService.create(request);
        var placeResponseMap = placeResponse.map(PlaceMapper::fromPlaceToResponse);
        return ResponseEntity.status(HttpStatus.CREATED).body(placeResponseMap);
    }
    
}
