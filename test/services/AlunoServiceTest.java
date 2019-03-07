/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import builders.AlunoBuilder;
import entities.Aluno;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rasputuim
 */
public class AlunoServiceTest {
    
    private AlunoService alunoService;
    private Aluno aluno;
    
    @Before
    public void setUp(){
        this.alunoService =  new AlunoService();
        this.aluno = AlunoBuilder.mockAluno().getAluno();
        this.alunoService.create(this.aluno);
    }

    @Test
    public void testCreated() {      
        assertEquals(this.alunoService.create(this.aluno), this.aluno);
    }
    
    @Test
    public void testDelete() {
        assertTrue(this.alunoService.delete(this.aluno));
    }
    
    @Test
    public void testGetById() {
        assertEquals(this.alunoService.getById(this.aluno.getId()), this.aluno);
    }
    
    @Test
    public void testGetAll(){
        assertEquals(this.alunoService.getAll().size(), 1);
        assertFalse(this.alunoService.getAll().isEmpty());
    }
}
