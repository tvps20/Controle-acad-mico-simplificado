/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Entity;
import java.util.Collection;
import java.util.Set;
import java.util.UUID;

/**
 *
 * @author Rasputuim
 */
public abstract class Service<T extends Entity> implements IService<T> {

    private Set<T> database;

    public Service(Set<T> list) {
        this.database = list;
    }

    @Override
    public T create(T entity) {
        entity.setId(UUID.randomUUID());
        this.database.add(entity);
        return entity;
    }

    @Override
    public boolean delete(T entity) {
        return this.database.remove(entity);
    }

    @Override
    public Entity getById(UUID id) {

        for (Entity entity : this.database) {
            if (entity.getId().equals(id))
                return entity;
        }

        return null;
    }

    @Override
    public Collection<T> getAll() {
        return this.database;
    }
}

