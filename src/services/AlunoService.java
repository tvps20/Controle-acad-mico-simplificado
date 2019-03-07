/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Aluno;

import java.util.HashSet;

/**
 *
 * @author Rasputuim
 */
public class AlunoService extends Service<Aluno> {

    public AlunoService() {
        super(new HashSet<Aluno>());
    }
}
