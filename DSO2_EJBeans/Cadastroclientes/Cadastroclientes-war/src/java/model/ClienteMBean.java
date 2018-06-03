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
@Named(value = "clienteMBean")
@RequestScoped
public class ClienteMBean {

    @EJB
    private ClienteFachada clienteFachada;
    private Clientes clientes = new Clientes();

    /**
     * Creates a new instance of ClienteMBean
     */
    public ClienteMBean() {
    }
    
    public List<Clientes> getListaClientes() {
        return clienteFachada.getListaClientes();
    }
    
    public void setClientes(Clientes clientes){
        this.clientes = clientes;
    }
    
    public Clientes getClientes(){
        return this.clientes;
    }
    
    public String add(){
        this.clienteFachada.persist(this.clientes);
        return "List";
    }
    
    public String delete(){
        this.clienteFachada.delete(this.clientes.getId());
        return "index";
    }
}
