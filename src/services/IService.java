/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Entity;
import java.util.Collection;
import java.util.UUID;

/**
 *
 * @author Rasputuim
 */
interface IService<T extends Entity> {
    T create(T entity);
    boolean delete(T entity);
    Entity getById(UUID id);
    Collection<T> getAll();
}
