package com.ge.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/clients")
public class ClienteAPI {
    @Autowired
    private ClienteServico clienteServico;

    @PostMapping
    @ResponseBody
    public Cliente create(@RequestBody Cliente cliente){
        return clienteServico.create(cliente);
    }
    @GetMapping
    @ResponseBody
    public List<Cliente> getAll(){
        return clienteServico.getAll();
    }

   @GetMapping(value = "/{id}")
   @ResponseBody
   public Cliente getById(@PathVariable Integer id){
        return clienteServico.getById(id);
   }
}
