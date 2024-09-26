package com.example.demo.gateways.requests;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class ProfessorRequestPostDto {
    @NotEmpty
    String nome;
    @NotEmpty
    String materia;
}
