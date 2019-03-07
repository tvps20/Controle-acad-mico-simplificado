/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builders;

import entities.Aluno;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 *
 * @author Rasputuim
 */
public class AlunoBuilder {
   
    private Aluno aluno;
    private Set<Aluno> alunos;
    
    public static AlunoBuilder mockAluno(){
        AlunoBuilder builder = new AlunoBuilder();
        builder.aluno = new Aluno("Thiago", UUID.randomUUID().toString());
        
        return builder;
    }
    
    public static AlunoBuilder mockAlunos(){
        AlunoBuilder builder = new AlunoBuilder();
        builder.alunos = new HashSet<>();
        
        for(int i=0; i<10; i++){
            Aluno novoAluno = new Aluno("aluno " + i, UUID.randomUUID().toString());
            
            builder.alunos.add(novoAluno);
        }
        
        return builder;
    }
    
    public Aluno getAluno(){
        return this.aluno;
    }
    
    public Set<Aluno> getAlunos(){
        return this.alunos;
    }
}
