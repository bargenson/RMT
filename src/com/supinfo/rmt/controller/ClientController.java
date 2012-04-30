package com.supinfo.rmt.controller;

import com.supinfo.rmt.entity.Client;
import com.supinfo.rmt.service.ClientService;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

/**
 * Created with IntelliJ IDEA.
 * User: bargenson
 * Date: 4/30/12
 * Time: 5:30 PM
 */
@ManagedBean
public class ClientController {

    @EJB
    private ClientService clientService;

    private Client client;

    public String addClient() {
        if(client != null) {
            clientService.addClient(client);
            return "manager_home?faces-redirect=true";
        }
        return null;
    }

    public Client getClient() {
        if(client == null) {
            client = new Client();
        }
        return client;
    }

}
