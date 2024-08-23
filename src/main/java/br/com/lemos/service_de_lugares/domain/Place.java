package br.com.lemos.service_de_lugares.domain;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
// Criamos a Entidade Place com um record poderia ser uma classe
// Utilizamos o CreatedDate e LastModifiedDate para auditoria
public record Place( 
    Long id, 
    String name, 
    String slug, 
    String state, 
    @CreatedDate LocalDateTime createdAt, 
    @LastModifiedDate LocalDateTime updatedAt) {
}
