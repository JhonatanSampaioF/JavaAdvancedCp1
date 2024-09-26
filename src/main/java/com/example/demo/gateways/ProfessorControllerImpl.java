package com.example.demo.gateways;

import com.example.demo.domains.Professor;
import com.example.demo.gateways.requests.ProfessorRequestPatchDto;
import com.example.demo.gateways.requests.ProfessorRequestPostDto;
import com.example.demo.gateways.requests.ProfessorRequestPutDto;
import com.example.demo.gateways.responses.ProfessorResponseDto;
import com.example.demo.usecases.SalvaProfessorImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Optional;

@RequiredArgsConstructor
public class ProfessorControllerImpl implements ProfessorController, ProfessorControllerIntegrado{

    private final SalvaProfessorImpl salvaProfessor;

    @Override
    public ResponseEntity<ProfessorResponseDto> getUmProfessor(String professorId) {
        return null;
    }

    @Override
    public ResponseEntity getTodosOsProfessores() {
        return null;
    }

    @Override
    public ResponseEntity deletaUmProfessor(String professorId) {
        return null;
    }

    @Override
    public ResponseEntity<ProfessorResponseDto> atualizaUmProfessorPorCompleto(ProfessorRequestPutDto professor) {
        return null;
    }

    @Override
    public ResponseEntity<ProfessorResponseDto> atualizaProfessorMateria(ProfessorRequestPatchDto professor) {
        return null;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @Override
    public ResponseEntity<ProfessorResponseDto> criarUmProfessor(ProfessorRequestPostDto professor) {

        Professor professorASerCriado = Professor.builder()
            .nome(professor.getNome())
            .materia(professor.getMateria())
            .build();

        Professor professorCriado = salvaProfessor.execute(professorASerCriado);

        ProfessorResponseDto professorResponse = ProfessorResponseDto.builder()
            .nome(professorCriado.getNome())
            .materia(professorCriado.getMateria())
            .build();

        return ResponseEntity.ok(professorResponse);
    }
}
