/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import entities.*;
import services.*;

/**
 *
 * @author Rasputuim
 */
public class Application {
 
    
    public static void main(String[] args) {
        
        System.out.println("Application start running...");
        
        ControleAcademico ca = new ControleAcademico(new DisciplinaService(), new ProfessorService(), new AlunoService());
        
        Disciplina disciplina1 = ca.criarDisciplina("Programacao 1", "18:00", "Segunda");        
        Disciplina disciplina2 = ca.criarDisciplina("Programacao 2", "20:00", "Segunda");
        Disciplina disciplina3 = ca.criarDisciplina("Programacao 3", "18:00", "Terça");        
        Disciplina disciplina4 = ca.criarDisciplina("Laboratorio 1", "20:00", "Terça");

        Professor professor1 = ca.matricularProfessor("Professor 1");
        Professor professor2 = ca.matricularProfessor("Professor 2");
        
        Aluno aluno1 = ca.matricularAluno("Aluno 1");
        
        ca.setProfessorDaDisciplina(professor1, disciplina1);        
        ca.setProfessorDaDisciplina(professor1, disciplina2);
        ca.setProfessorDaDisciplina(professor2, disciplina3);
        ca.setProfessorDaDisciplina(professor2, disciplina4);

        ca.setAlunoDaDisciplina(aluno1, disciplina1);
        ca.setAlunoDaDisciplina(aluno1, disciplina2);
        ca.setAlunoDaDisciplina(aluno1, disciplina3);
        ca.setAlunoDaDisciplina(aluno1, disciplina4);
        
        // Quebra de linha
        System.out.println();
        
        // Horario de um aluno + disciplinas
        System.out.println("Horario de um aluno + disciplinas:");
        System.out.println(aluno1.getFullHorarioInformation());        
        
        // Disciplinas que o professor esta ministrando + horarios
        System.out.println("Disciplinas que o professor esta ministrando + horarios:");
        System.out.println(professor1.getFullHorarioInformation());  
        
        // Alunos de uma disciplina
        System.out.println("Alunos de uma disciplina:");
        System.out.println(disciplina1.listarAlunos());
        
        // Numeros de aluno de uma disciplina
        System.out.println("Numeros de aluno de uma disciplina:");
        System.out.println(disciplina1.qtdAlunos());
        
    }
}
