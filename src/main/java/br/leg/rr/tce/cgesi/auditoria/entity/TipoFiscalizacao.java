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
@Table(name = "tipo_fiscalizacao", schema="scsisaudit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoFiscalizacao.findAll", query = "SELECT t FROM TipoFiscalizacao t"),
    @NamedQuery(name = "TipoFiscalizacao.findById", query = "SELECT t FROM TipoFiscalizacao t WHERE t.id = :id"),
    @NamedQuery(name = "TipoFiscalizacao.findByNome", query = "SELECT t FROM TipoFiscalizacao t WHERE t.nome = :nome"),
    @NamedQuery(name = "TipoFiscalizacao.findByObjetivo", query = "SELECT t FROM TipoFiscalizacao t WHERE t.objetivo = :objetivo")})
public class TipoFiscalizacao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "nome")
    private String nome;
    @Size(max = 2147483647)
    @Column(name = "objetivo")
    private String objetivo;
    @OneToMany(mappedBy = "idTipoFiscalizacao")
    private List<Portaria> portariaList;
    @OneToMany(mappedBy = "idTipoFiscalizacao")
    private List<Auditoria> auditoriaList;

    public TipoFiscalizacao() {
    }

    public TipoFiscalizacao(Integer id) {
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

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    @XmlTransient
    public List<Portaria> getPortariaList() {
        return portariaList;
    }

    public void setPortariaList(List<Portaria> portariaList) {
        this.portariaList = portariaList;
    }

    @XmlTransient
    public List<Auditoria> getAuditoriaList() {
        return auditoriaList;
    }

    public void setAuditoriaList(List<Auditoria> auditoriaList) {
        this.auditoriaList = auditoriaList;
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
        if (!(object instanceof TipoFiscalizacao)) {
            return false;
        }
        TipoFiscalizacao other = (TipoFiscalizacao) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.leg.rr.tce.cgesi.auditoria.entity.TipoFiscalizacao[ id=" + id + " ]";
    }
    
}
