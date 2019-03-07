/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.UUID;

/**
 *
 * @author Rasputuim
 */
public abstract class Entity {
    
    private UUID _id;

    /**
     * @return the _id
     */
    public UUID getId() {
        return _id;
    }

    /**
     * @param _id the _id to set
     */
    public void setId(UUID _id) {
        this._id = _id;
    }
}
