/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builders;

import entities.Professor;
import java.util.UUID;

/**
 *
 * @author Rasputuim
 */
public class ProfessorBuilder {
    
    private Professor professor;
    
    public static ProfessorBuilder mockProfessor(){
        ProfessorBuilder builder = new ProfessorBuilder();
        builder.professor = new Professor("Sabrina", UUID.randomUUID().toString());
        
        return builder;    
    }
    
    public Professor getProfessor(){
        return this.professor;
    }
}
