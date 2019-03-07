/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Disciplina;
import java.util.HashSet;

/**
 *
 * @author Rasputuim
 */
public class DisciplinaService extends Service<Disciplina> {
    
    public DisciplinaService() {
        super(new HashSet<Disciplina>());
    }
}
