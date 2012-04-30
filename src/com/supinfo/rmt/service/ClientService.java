package com.supinfo.rmt.service;

import com.supinfo.rmt.entity.Client;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created with IntelliJ IDEA.
 * User: bargenson
 * Date: 4/30/12
 * Time: 5:34 PM
 */
@Stateless
public class ClientService {

    @PersistenceContext
    private EntityManager em;

    public Client addClient(Client client) {
        em.persist(client);
        return client;
    }

}
