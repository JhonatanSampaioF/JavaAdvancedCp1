package com.example.demo.usecases;

import com.example.demo.domains.Professor;
import org.springframework.stereotype.Service;

public interface SalvaProfessor {

    Professor execute(Professor professor);
}
