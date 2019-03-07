/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Rasputuim
 */
public class Disciplina extends Entity {
    
    private Professor professor;
    private Set<Aluno> alunos;
    private Horario horario;
    private String titulo;
    
    public Disciplina() {
        this.alunos = new HashSet<Aluno>();
    }
    
    public Disciplina(String titulo, Professor professor, Set<Aluno> alunos, Horario horario) {
        this.alunos = alunos;
        this.professor = professor;
        this.horario = horario;
        this.titulo = titulo;
    }
    
    /**
     * @return the professor
     */
    public Professor getProfessor() {
        return professor;
    }

    /**
     * @param professor the professor to set
     */
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    /**
     * @return the alunos
     */
    public Set<Aluno> getAlunos() {
        return alunos;
    }

    /**
     * @return the horario
     */
    public Horario getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    @Override
    public String toString(){
        return "[" + this.titulo + "]: " + this.horario.toString();
    }

    public int qtdAlunos() {
        return this.alunos.size();
    }
    
    public String listarAlunos() {
        StringBuilder information = new StringBuilder();
        
        for(Aluno aluno : this.alunos) {
            information.append(aluno.getNome());            
            information.append(" - Matricula: ");
            information.append(aluno.getMatricula());
            information.append("\n");
        }
        
        return information.toString();
    }
}

