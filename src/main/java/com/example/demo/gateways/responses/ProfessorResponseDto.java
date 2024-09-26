package com.example.demo.gateways.responses;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProfessorResponseDto {
    String nome;
    String materia;
}
