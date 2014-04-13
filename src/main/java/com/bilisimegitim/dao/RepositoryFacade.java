/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bilisimegitim.dao;

import com.bilisimegitim.model.Repository;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Adem
 */
@Stateless
public class RepositoryFacade extends AbstractFacade<Repository> {
    @PersistenceContext(unitName = "coursePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RepositoryFacade() {
        super(Repository.class);
    }
    
}
