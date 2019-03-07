/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rasputuim
 */
public abstract class Pessoa extends Entity {
    
    private String nome;
    private String matricula;
    
    private List<Horario> horarios;
    
    public Pessoa() {
        this.horarios = new ArrayList<>();
    }

    public Pessoa(List<Horario> horarios) {
        this.horarios = horarios;
    }

    public Pessoa(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.horarios = horarios;
        this.horarios = new ArrayList<>();
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the horarios
     */
    public List<Horario> getHorarios() {
        return horarios;
    }
    
    public String getFullHorarioInformation() {
        
        StringBuilder information = new StringBuilder();
        
        for(Horario horario : this.horarios) {
            information.append(horario.getDisciplina().toString());
            information.append("\n");
        }
        
        return information.toString();
    }
}
