/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.leg.rr.tce.cgesi.auditoria.entity;

import java.io.Serializable;
import java.util.List;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author fpcarlos
 */
@Entity
@Table(name = "status_portaria", schema="scsisaudit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StatusPortaria.findAll", query = "SELECT s FROM StatusPortaria s"),
    @NamedQuery(name = "StatusPortaria.findById", query = "SELECT s FROM StatusPortaria s WHERE s.id = :id"),
    @NamedQuery(name = "StatusPortaria.findByNome", query = "SELECT s FROM StatusPortaria s WHERE s.nome = :nome")})
public class StatusPortaria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 100)
    @Column(name = "nome")
    private String nome;
    @OneToMany(mappedBy = "idStatusPortaria")
    private List<PortariasAndamento> portariasAndamentoList;

    public StatusPortaria() {
    }

    public StatusPortaria(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @XmlTransient
    public List<PortariasAndamento> getPortariasAndamentoList() {
        return portariasAndamentoList;
    }

    public void setPortariasAndamentoList(List<PortariasAndamento> portariasAndamentoList) {
        this.portariasAndamentoList = portariasAndamentoList;
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
        if (!(object instanceof StatusPortaria)) {
            return false;
        }
        StatusPortaria other = (StatusPortaria) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.leg.rr.tce.cgesi.auditoria.entity.StatusPortaria[ id=" + id + " ]";
    }
    
}
