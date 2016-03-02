/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.leg.rr.tce.cgesi.auditoria.entity;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author fpcarlos
 */
@Entity
@Table(name = "portarias_andamento", schema="scsisaudit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PortariasAndamento.findAll", query = "SELECT p FROM PortariasAndamento p"),
    @NamedQuery(name = "PortariasAndamento.findById", query = "SELECT p FROM PortariasAndamento p WHERE p.id = :id"),
    @NamedQuery(name = "PortariasAndamento.findByStatusDate", query = "SELECT p FROM PortariasAndamento p WHERE p.statusDate = :statusDate"),
    @NamedQuery(name = "PortariasAndamento.findByStatusUsr", query = "SELECT p FROM PortariasAndamento p WHERE p.statusUsr = :statusUsr"),
    @NamedQuery(name = "PortariasAndamento.findByStatusJustificativa", query = "SELECT p FROM PortariasAndamento p WHERE p.statusJustificativa = :statusJustificativa")})
public class PortariasAndamento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "status_date")
    @Temporal(TemporalType.DATE)
    private Date statusDate;
    @Size(max = 2147483647)
    @Column(name = "status_usr")
    private String statusUsr;
    @Size(max = 2147483647)
    @Column(name = "status_justificativa")
    private String statusJustificativa;
    @JoinColumn(name = "id_portaria", referencedColumnName = "id")
    @ManyToOne
    private Portaria idPortaria;
    @JoinColumn(name = "id_status_portaria", referencedColumnName = "id")
    @ManyToOne
    private StatusPortaria idStatusPortaria;

    public PortariasAndamento() {
    }

    public PortariasAndamento(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(Date statusDate) {
        this.statusDate = statusDate;
    }

    public String getStatusUsr() {
        return statusUsr;
    }

    public void setStatusUsr(String statusUsr) {
        this.statusUsr = statusUsr;
    }

    public String getStatusJustificativa() {
        return statusJustificativa;
    }

    public void setStatusJustificativa(String statusJustificativa) {
        this.statusJustificativa = statusJustificativa;
    }

    public Portaria getIdPortaria() {
        return idPortaria;
    }

    public void setIdPortaria(Portaria idPortaria) {
        this.idPortaria = idPortaria;
    }

    public StatusPortaria getIdStatusPortaria() {
        return idStatusPortaria;
    }

    public void setIdStatusPortaria(StatusPortaria idStatusPortaria) {
        this.idStatusPortaria = idStatusPortaria;
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
        if (!(object instanceof PortariasAndamento)) {
            return false;
        }
        PortariasAndamento other = (PortariasAndamento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.leg.rr.tce.cgesi.auditoria.entity.PortariasAndamento[ id=" + id + " ]";
    }
    
}
