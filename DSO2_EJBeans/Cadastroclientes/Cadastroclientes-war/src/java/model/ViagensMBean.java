/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author brunocampos01
 */
@Named(value = "viagensMBean")
@RequestScoped
public class ViagensMBean {
    
    @EJB
    private ViagensFachada viagensFachada;
    private Viagens viagens = new Viagens();

    /**
     * Creates a new instance of ViagensMBean
     */
    public ViagensMBean() {
    }
    
        
    public List<Viagens> getListaViagenses() {
        return viagensFachada.getListaViagens();
    }

    public Viagens getViagens() {
        return viagens;
    }

    public void setViagens(Viagens viagens) {
        this.viagens = viagens;
    }
    
    public String add(){
        this.viagensFachada.persist(this.viagens);
        return "index";
    }
    
    public String edit(){
        this.viagensFachada.edit(this.viagens.getId());
        return "index";
    }
    
    public String delete(){
        this.viagensFachada.delete(this.viagens.getId());
        return "index";
    }
}
