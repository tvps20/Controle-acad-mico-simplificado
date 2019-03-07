/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Professor;
import java.util.HashSet;

/**
 *
 * @author Rasputuim
 */
public class ProfessorService extends Service<Professor> {

    public ProfessorService() {
        super(new HashSet<Professor>());
    }
}

