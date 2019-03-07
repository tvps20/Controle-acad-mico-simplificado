/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import builders.AlunoBuilder;
import builders.DisciplinaBuilder;
import builders.HorarioBuilder;
import builders.ProfessorBuilder;
import entities.Aluno;
import entities.Disciplina;
import entities.Horario;
import entities.Professor;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import services.AlunoService;
import services.DisciplinaService;
import services.ProfessorService;

/**
 *
 * @author Rasputuim
 */
public class ControleAcademicoTest {
    
    private ControleAcademico controleAcademico;
    
    private Disciplina disciplina;
    private Professor professor;
    private Aluno aluno;
    
    @Before
    public void setUp(){
        this.controleAcademico = new ControleAcademico(new DisciplinaService(), new ProfessorService(), new AlunoService());
        this.disciplina  = DisciplinaBuilder.mockDisciplina().getDisciplina();
        this.professor = ProfessorBuilder.mockProfessor().getProfessor();
        this.aluno = AlunoBuilder.mockAluno().getAluno();
    }
    
    @Test
    public void testCriarDisciplina(){       
        Disciplina disciplinaCadastrada = this.controleAcademico.criarDisciplina(disciplina.getTitulo(), this.disciplina.getHorario().getInicio(), this.disciplina.getHorario().getDia());
        
        assertEquals(disciplinaCadastrada.getTitulo(), this.disciplina.getTitulo());
        assertEquals(disciplinaCadastrada.getHorario().getInicio(), this.disciplina.getHorario().getInicio());
        assertEquals(disciplinaCadastrada.getHorario().getDia(), this.disciplina.getHorario().getDia());
        assertEquals(disciplinaCadastrada.getProfessor(), null);
        assertTrue(disciplinaCadastrada.getAlunos().isEmpty());
    }
    
    @Test
    public void testMatricularProfessor(){        
        Professor professorCadastrado = this.controleAcademico.matricularProfessor(professor.getNome());
        
        assertEquals(professorCadastrado.getNome(), this.professor.getNome());
    }
    
    @Test
    public void testMatricularAluno(){
        Aluno alunoCadastrado = this.controleAcademico.matricularAluno(this.aluno.getNome());
        
        assertEquals(alunoCadastrado.getNome(), this.aluno.getNome());
    }
    
    @Test
    public void testSetProfessorDaDisciplina(){
        Disciplina disciplinaCadastrada = this.controleAcademico.setProfessorDaDisciplina(this.professor, this.disciplina);
         
        Assert.assertFalse(this.professor.getHorarios().isEmpty());
        assertEquals(this.professor.getHorarios().get(0).getDia(), disciplinaCadastrada.getHorario().getDia());
        assertEquals(this.professor.getHorarios().get(0).getInicio(), disciplinaCadastrada.getHorario().getInicio());
        assertEquals(disciplinaCadastrada.getProfessor().getNome(), this.professor.getNome());
    }
    
    @Test
    public void testSetAlunoDaDisciplina(){
        Disciplina disciplinaCadastrada = this.controleAcademico.setAlunoDaDisciplina(this.aluno, this.disciplina);
    
        Assert.assertFalse(disciplinaCadastrada.getAlunos().isEmpty());
        assertEquals(this.aluno.getHorarios().size(), 1);
        assertEquals(this.aluno.getHorarios().get(0).getDia(), disciplinaCadastrada.getHorario().getDia());
        assertEquals(this.aluno.getHorarios().get(0).getInicio(), disciplinaCadastrada.getHorario().getInicio());
    }
}
