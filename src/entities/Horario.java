/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Rasputuim
 */
public class Horario {
    
    private String inicio;
    private String dia;
    private Disciplina disciplina;

    public Horario(String inicio, String dia, Disciplina disciplina) {
        this.inicio = inicio;
        this.dia = dia;
        this.disciplina = disciplina;
    }

    public Horario(String inicio, String dia) {
        this.inicio = inicio;
        this.dia = dia;
    }

    /**
     * @return the inicio
     */
    public String getInicio() {
        return inicio;
    }

    /**
     * @param inicio the inicio to set
     */
    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    /**
     * @return the dia
     */
    public String getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(String dia) {
        this.dia = dia;
    }

    /**
     * @return the disciplina
     */
    public Disciplina getDisciplina() {
        return disciplina;
    }
    
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    
    @Override
    public String toString() {
        return "Dia:" + this.dia + " - Inicio: " + this.inicio;
    }
}