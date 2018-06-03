/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author brunocampos01
 */
@Stateless
@LocalBean
public class ClienteFachada {

     @PersistenceContext (name = "CadastroClientes-ejbPU") 
    EntityManager em;  

    public void persist(Object object) {
       em.persist(object);
    }
    
    public List<model.Clientes> getListaClientes() {
        Query query = em.createNamedQuery("Clientes.findAll");
        return query.getResultList();
    }

    public void setClientes(Clientes cliente) {
        persist(cliente);
    }
    
    public void delete(int id) {
        em.remove(em.find(Clientes.class, id));
    }
    
    public void procura(String nome) {
        em.remove(em.find(Clientes.class, nome));
    }
}
