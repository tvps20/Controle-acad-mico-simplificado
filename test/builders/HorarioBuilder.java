/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builders;

import entities.Horario;

/**
 *
 * @author Rasputuim
 */
public class HorarioBuilder {
    
    private Horario horario;
    
    public static HorarioBuilder mockHorario(){
        HorarioBuilder builder = new HorarioBuilder();
        builder.horario = new Horario("18:00", "Segunda");
        
        return builder;
    }
    
    public Horario getHorario(){
        return this.horario;
    }
}
