/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.leg.rr.tce.cgesi.auditoria.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author fpcarlos
 */
@Entity
@Table(name = "unidade_gestora_auditoria", schema="scsisaudit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UnidadeGestoraAuditoria.findAll", query = "SELECT u FROM UnidadeGestoraAuditoria u"),
    @NamedQuery(name = "UnidadeGestoraAuditoria.findById", query = "SELECT u FROM UnidadeGestoraAuditoria u WHERE u.id = :id"),
    @NamedQuery(name = "UnidadeGestoraAuditoria.findByIdUnidadeGestora", query = "SELECT u FROM UnidadeGestoraAuditoria u WHERE u.idUnidadeGestora = :idUnidadeGestora")})
public class UnidadeGestoraAuditoria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_unidade_gestora")
    private int idUnidadeGestora;
    @JoinColumn(name = "id_auditoria", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Auditoria idAuditoria;

    public UnidadeGestoraAuditoria() {
    }

    public UnidadeGestoraAuditoria(Integer id) {
        this.id = id;
    }

    public UnidadeGestoraAuditoria(Integer id, int idUnidadeGestora) {
        this.id = id;
        this.idUnidadeGestora = idUnidadeGestora;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdUnidadeGestora() {
        return idUnidadeGestora;
    }

    public void setIdUnidadeGestora(int idUnidadeGestora) {
        this.idUnidadeGestora = idUnidadeGestora;
    }

    public Auditoria getIdAuditoria() {
        return idAuditoria;
    }

    public void setIdAuditoria(Auditoria idAuditoria) {
        this.idAuditoria = idAuditoria;
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
        if (!(object instanceof UnidadeGestoraAuditoria)) {
            return false;
        }
        UnidadeGestoraAuditoria other = (UnidadeGestoraAuditoria) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.leg.rr.tce.cgesi.auditoria.entity.UnidadeGestoraAuditoria[ id=" + id + " ]";
    }
    
}
