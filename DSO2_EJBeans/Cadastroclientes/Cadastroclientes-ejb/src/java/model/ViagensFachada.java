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
public class ViagensFachada {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    @PersistenceContext (name = "CadastroClientes-ejbPU") 
    EntityManager em;  

    public void persist(Object object) {
       em.persist(object);
    }
    
    public void edit(Object object){
        em.merge(object);
    }
    
    public void delete(int id){
        em.remove(em.find(Viagens.class, id));
    }
    
    public List<model.Viagens> getListaViagens() {
        Query query = em.createNamedQuery("Viagens.findAll");
        return query.getResultList();
    }
    
    public void find(String login, String senha){
        em.find(Viagens.class, login);
        em.createQuery("select * from clientes where login");
    }
}
