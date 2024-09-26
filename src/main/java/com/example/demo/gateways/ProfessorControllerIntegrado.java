package com.example.demo.gateways;

import com.example.demo.gateways.requests.ProfessorRequestPostDto;
import com.example.demo.gateways.responses.ProfessorResponseDto;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fiap/professor")
public interface ProfessorControllerIntegrado {

    /*
    Crie assinaturas que contemplem as seguintes operações
            criar um professor
            nome e materia devem ser não vazios
            copie os dados de entrada para os dados de saida
            rota: /fiap/professor
     */

    ResponseEntity<ProfessorResponseDto> criarUmProfessor (@RequestBody @Valid ProfessorRequestPostDto professor);

}
