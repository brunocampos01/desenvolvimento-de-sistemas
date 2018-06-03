/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author brunocampos01
 */
@Entity
@Table(name = "viagens")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Viagens.findAll", query = "SELECT v FROM Viagens v"),
    @NamedQuery(name = "Viagens.findById", query = "SELECT v FROM Viagens v WHERE v.id = :id"),
    @NamedQuery(name = "Viagens.findByDia", query = "SELECT v FROM Viagens v WHERE v.dia = :dia"),
    @NamedQuery(name = "Viagens.findByHorario", query = "SELECT v FROM Viagens v WHERE v.horario = :horario"),
    @NamedQuery(name = "Viagens.findByDestino", query = "SELECT v FROM Viagens v WHERE v.destino = :destino"),
    @NamedQuery(name = "Viagens.findByOrigem", query = "SELECT v FROM Viagens v WHERE v.origem = :origem"),
    @NamedQuery(name = "Viagens.findByNumeroAcentos", query = "SELECT v FROM Viagens v WHERE v.numeroAcentos = :numeroAcentos")})
public class Viagens implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dia")
    private int dia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "horario")
    private String horario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 56)
    @Column(name = "destino")
    private String destino;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 56)
    @Column(name = "origem")
    private String origem;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numero_acentos")
    private int numeroAcentos;
    @OneToMany(mappedBy = "viagensId")
    private Collection<Reservas> reservasCollection;

    public Viagens() {
    }

    public Viagens(Integer id) {
        this.id = id;
    }

    public Viagens(Integer id, int dia, String horario, String destino, String origem, int numeroAcentos) {
        this.id = id;
        this.dia = dia;
        this.horario = horario;
        this.destino = destino;
        this.origem = origem;
        this.numeroAcentos = numeroAcentos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public int getNumeroAcentos() {
        return numeroAcentos;
    }

    public void setNumeroAcentos(int numeroAcentos) {
        this.numeroAcentos = numeroAcentos;
    }

    @XmlTransient
    public Collection<Reservas> getReservasCollection() {
        return reservasCollection;
    }

    public void setReservasCollection(Collection<Reservas> reservasCollection) {
        this.reservasCollection = reservasCollection;
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
        return "modelo.Viagens[ id=" + id + " ]";
    }
    
}
