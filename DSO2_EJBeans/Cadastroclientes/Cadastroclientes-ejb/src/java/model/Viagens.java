/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author brunocampos01
 */
@Entity
@Table(name = "VIAGENS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Viagens.findAll", query = "SELECT v FROM Viagens v"),
    @NamedQuery(name = "Viagens.findById", query = "SELECT v FROM Viagens v WHERE v.id = :id"),
    @NamedQuery(name = "Viagens.findByDia", query = "SELECT v FROM Viagens v WHERE v.dia = :dia"),
    @NamedQuery(name = "Viagens.findByHorario", query = "SELECT v FROM Viagens v WHERE v.horario = :horario"),
    @NamedQuery(name = "Viagens.findByOrigem", query = "SELECT v FROM Viagens v WHERE v.origem = :origem"),
    @NamedQuery(name = "Viagens.findByDestino", query = "SELECT v FROM Viagens v WHERE v.destino = :destino"),
    @NamedQuery(name = "Viagens.findByNumeroAcentos", query = "SELECT v FROM Viagens v WHERE v.numeroAcentos = :numeroAcentos")})
public class Viagens implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Column(name = "DIA")
    @Temporal(TemporalType.DATE)
    private Date dia;
    @Column(name = "HORARIO")
    @Temporal(TemporalType.TIME)
    private Date horario;
    @Size(max = 30)
    @Column(name = "ORIGEM")
    private String origem;
    @Size(max = 30)
    @Column(name = "DESTINO")
    private String destino;
    @Column(name = "NUMERO_ACENTOS")
    private Integer numeroAcentos;

    public Viagens() {
    }

    public Viagens(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Integer getNumeroAcentos() {
        return numeroAcentos;
    }

    public void setNumeroAcentos(Integer numeroAcentos) {
        this.numeroAcentos = numeroAcentos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Viagens)) {
            return false;
        }
        Viagens other = (Viagens) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Viagens[ id=" + id + " ]";
    }
    
}
