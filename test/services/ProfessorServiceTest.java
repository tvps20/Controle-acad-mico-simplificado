/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import builders.ProfessorBuilder;
import entities.Professor;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rasputuim
 */
public class ProfessorServiceTest {
    
    private ProfessorService professorService;
    private Professor professor;
    
    @Before
    public void setUp(){
        this.professorService =  new ProfessorService();
        this.professor = ProfessorBuilder.mockProfessor().getProfessor();
        this.professorService.create(this.professor);
    }
    
      @Test
    public void testCreated() {      
        assertEquals(this.professorService.create(this.professor), this.professor);
    }
    
    @Test
    public void testDelete() {
        assertTrue(this.professorService.delete(this.professor));
    }
    
    @Test
    public void testGetById() {
        assertEquals(this.professorService.getById(this.professor.getId()), this.professor);
    }
    
    @Test
    public void testGetAll(){
        assertEquals(this.professorService.getAll().size(), 1);
        assertFalse(this.professorService.getAll().isEmpty());
    }
}
