package br.com.lemos.service_de_lugares.api;

import java.time.LocalDateTime;

public record PlaceResponse(
    String name, 
    String slug, 
    String state, 
    LocalDateTime createdAt, 
    LocalDateTime updatedAt) {
}
