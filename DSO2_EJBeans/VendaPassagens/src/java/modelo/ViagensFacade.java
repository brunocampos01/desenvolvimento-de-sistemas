/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author brunocampos01
 */
@Stateless
public class ViagensFacade extends AbstractFacade<Viagens> {

    @PersistenceContext(unitName = "VendaPassagensPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ViagensFacade() {
        super(Viagens.class);
    }
    
}
