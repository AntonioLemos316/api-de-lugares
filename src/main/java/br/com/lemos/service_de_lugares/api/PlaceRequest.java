package br.com.lemos.service_de_lugares.api;

import jakarta.validation.constraints.NotBlank;

public record PlaceRequest(
    @NotBlank String name, 
    @NotBlank String state) {
}
