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
@Table(name = "unidade_fiscalizadora", schema="scsisaudit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UnidadeFiscalizadora.findAll", query = "SELECT u FROM UnidadeFiscalizadora u"),
    @NamedQuery(name = "UnidadeFiscalizadora.findById", query = "SELECT u FROM UnidadeFiscalizadora u WHERE u.id = :id"),
    @NamedQuery(name = "UnidadeFiscalizadora.findByNome", query = "SELECT u FROM UnidadeFiscalizadora u WHERE u.nome = :nome"),
    @NamedQuery(name = "UnidadeFiscalizadora.findBySigla", query = "SELECT u FROM UnidadeFiscalizadora u WHERE u.sigla = :sigla"),
    @NamedQuery(name = "UnidadeFiscalizadora.findByTelefone", query = "SELECT u FROM UnidadeFiscalizadora u WHERE u.telefone = :telefone")})
public class UnidadeFiscalizadora implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "nome")
    private String nome;
    @Size(max = 50)
    @Column(name = "sigla")
    private String sigla;
    @Size(max = 50)
    @Column(name = "telefone")
    private String telefone;
    @OneToMany(mappedBy = "idUnidadeFiscalizadora")
    private List<Portaria> portariaList;
    @OneToMany(mappedBy = "idUnidadeFiscalizadora")
    private List<Auditoria> auditoriaList;

    public UnidadeFiscalizadora() {
    }

    public UnidadeFiscalizadora(Integer id) {
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

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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
        if (!(object instanceof UnidadeFiscalizadora)) {
            return false;
        }
        UnidadeFiscalizadora other = (UnidadeFiscalizadora) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.leg.rr.tce.cgesi.auditoria.entity.UnidadeFiscalizadora[ id=" + id + " ]";
    }
    
}
