/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import builders.DisciplinaBuilder;
import entities.Disciplina;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Rasputuim
 */
public class DisciplinaServiceTest {
    
    private DisciplinaService disciplinaService;
    private Disciplina disciplina;

    @Before
    public void setUp(){
        this.disciplinaService =  new DisciplinaService();
        this.disciplina = DisciplinaBuilder.mockDisciplina().getDisciplina();
        this.disciplinaService.create(this.disciplina);
    }
    
     @Test
    public void testCreated() {      
        assertEquals(this.disciplinaService.create(this.disciplina), this.disciplina);
    }
    
    @Test
    public void testDelete() {
        assertTrue(this.disciplinaService.delete(this.disciplina));
    }
    
    @Test
    public void testGetById() {
        assertEquals(this.disciplinaService.getById(this.disciplina.getId()), this.disciplina);
    }
    
    @Test
    public void testGetAll(){
        assertEquals(this.disciplinaService.getAll().size(), 1);
        assertFalse(this.disciplinaService.getAll().isEmpty());
    }
    
}
