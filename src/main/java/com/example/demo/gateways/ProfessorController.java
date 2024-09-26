package com.example.demo.gateways;

import com.example.demo.gateways.requests.ProfessorRequestPatchDto;
import com.example.demo.gateways.requests.ProfessorRequestPutDto;
import com.example.demo.gateways.responses.ProfessorResponseDto;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/fiap/professor")
public interface ProfessorController {

    //rota /fiap/professor/{id}
    //o body de retorno deve conter professorId
    @GetMapping("/{id}")
    ResponseEntity<ProfessorResponseDto> getUmProfessor(@RequestParam(name = "id") String professorId);

    //rota /fiap/professor
    //retorne uma lista vazia
    @GetMapping
    ResponseEntity getTodosOsProfessores();

    //rota /fiap/professor/{id}
    //retorne o status code mais adequado para a operação
    @DeleteMapping("/{id}")
    ResponseEntity deletaUmProfessor(@RequestParam(name = "id") String professorId);

    /*
    Crie assinaturas que contemplem as seguintes operações

        atualizar um professor por completo
            copie os dados de entrada mais o id para os dados de saida
            nome e materia devem ser não vazios
            rota: /fiap/professor/{id}

        atualizar parcialmente um professor
            deve atualizar somente materia
            rota: /fiap/professor/{id}/materia
    */

    @PutMapping("/{id}")
    ResponseEntity<ProfessorResponseDto> atualizaUmProfessorPorCompleto (@RequestParam @Valid ProfessorRequestPutDto professor);

    @PatchMapping("/{id}/materia")
    ResponseEntity<ProfessorResponseDto> atualizaProfessorMateria (@RequestParam ProfessorRequestPatchDto professor);

}
