/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import entities.*;
import java.util.HashSet;
import java.util.UUID;
import services.AlunoService;
import services.DisciplinaService;
import services.ProfessorService;

/**
 *
 * @author Rasputuim
 */
public class ControleAcademico {

    private DisciplinaService _disciplinaService;
    private ProfessorService _professorService;
    private AlunoService _alunoService;

    public ControleAcademico(
            DisciplinaService disciplinaService,
            ProfessorService professorService,
            AlunoService alunoService
    ) {
        this._disciplinaService = disciplinaService;
        this._professorService = professorService;
        this._alunoService = alunoService;
    }

    public Disciplina criarDisciplina(String titulo, String inicio, String dia) {

        Disciplina disciplina = new Disciplina(titulo, null, new HashSet<Aluno>(), new Horario(inicio, dia));
        disciplina.getHorario().setDisciplina(disciplina);
        return this._disciplinaService.create(disciplina);
    }

    public Professor matricularProfessor(String nome) {
        Professor professor = new Professor(nome, UUID.randomUUID().toString());
        return this._professorService.create(professor);
    }

    public Aluno matricularAluno(String nome) {
        Aluno aluno = new Aluno(nome, UUID.randomUUID().toString());
        return this._alunoService.create(aluno);
    }

    public Disciplina setProfessorDaDisciplina(Professor professor, Disciplina disciplina) {

        professor.getHorarios().add(disciplina.getHorario());
        disciplina.setProfessor(professor);

        return disciplina;
    }

    public Disciplina setAlunoDaDisciplina(Aluno aluno, Disciplina disciplina) {

        aluno.getHorarios().add(disciplina.getHorario());
        disciplina.getAlunos().add(aluno);

        return disciplina;
    }
}
