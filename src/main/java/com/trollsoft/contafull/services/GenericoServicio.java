/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.trollsoft.contafull.services;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Desarrollo
 * @param <T>
 */
public abstract class GenericoServicio<T> {

    @PersistenceContext
    private EntityManager entityManager;
    
    private final Class<T> clase;

    public GenericoServicio(Class<T> clase) {
        this.clase = clase;
    }
    
    public void crear(T entity) {
        entityManager.persist(entity);
    }

    public void actualizar(T entity) {
        entityManager.merge(entity);
    }

    public void eliminar(T entity) {
        entityManager.remove(entityManager.merge(entity));
    }

    public T consultar(Object id) {
        return entityManager.find(clase, id);
    }

    public List<T> listar() {
        CriteriaQuery cq = entityManager.getCriteriaBuilder().createQuery();
        cq.select(cq.from(clase));
        return entityManager.createQuery(cq).getResultList();
    }

    public List<T> listarLimite(int[] range) {
        CriteriaQuery cq = entityManager.getCriteriaBuilder().createQuery();
        cq.select(cq.from(clase));
        Query q = entityManager.createQuery(cq);
        q.setMaxResults(range[1] - range[0] + 1);
        q.setFirstResult(range[0]);
        return q.getResultList();
    }

    public int contar() {
        CriteriaQuery cq = entityManager.getCriteriaBuilder().createQuery();
        Root<T> rt = cq.from(clase);
        cq.select(entityManager.getCriteriaBuilder().count(rt));
        Query q = entityManager.createQuery(cq);
        return ((Long) q.getSingleResult()).intValue();
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }   
}
