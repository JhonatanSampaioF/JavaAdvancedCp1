package com.example.demo.gateways.requests;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProfessorRequestPutDto {
    @NotEmpty
    private String materia;
    @NotEmpty
    private String nome;
}
