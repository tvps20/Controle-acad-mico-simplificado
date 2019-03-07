/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builders;

import entities.Disciplina;

/**
 *
 * @author Rasputuim
 */
public class DisciplinaBuilder {
    
    private Disciplina disciplina;
    
    public static DisciplinaBuilder mockDisciplina(){
        DisciplinaBuilder builder = new DisciplinaBuilder();
        builder.disciplina = new Disciplina();
        builder.disciplina.setProfessor(ProfessorBuilder.mockProfessor().getProfessor());
        builder.disciplina.setTitulo("Metodos Avancados de Programacao");
        builder.disciplina.setHorario(HorarioBuilder.mockHorario().getHorario());
        
        return builder;
    }
    
    public Disciplina getDisciplina(){
        return this.disciplina;
    }
}
