package com.ge.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class ClienteServico {
    private static final HashMap<Integer, Cliente> clients = new HashMap<>();

    public Cliente create(Cliente cliente){
        Integer nextId = clients.keySet().size() + 1;
        cliente.setClientId(nextId);
        clients.put(nextId, cliente);
        return cliente;
    }

    public Cliente getById (Integer clientId){
        return clients.get(clientId);
    }

    public List<Cliente> getAll(){
        return new ArrayList<>(clients.values());
    }

}
