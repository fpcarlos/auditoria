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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author fpcarlos
 */
@Entity
@Table(name = "equipe_fiscalizacao", schema="scsisaudit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EquipeFiscalizacao.findAll", query = "SELECT e FROM EquipeFiscalizacao e"),
    @NamedQuery(name = "EquipeFiscalizacao.findById", query = "SELECT e FROM EquipeFiscalizacao e WHERE e.id = :id"),
    @NamedQuery(name = "EquipeFiscalizacao.findByIdPortaria", query = "SELECT e FROM EquipeFiscalizacao e WHERE e.idPortaria = :idPortaria")})
public class EquipeFiscalizacao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "id_portaria")
    private Integer idPortaria;
    @JoinColumn(name = "id_servidor", referencedColumnName = "id")
    @ManyToOne
    private Servidor idServidor;
    @JoinColumn(name = "id_tipo_auditor", referencedColumnName = "id")
    @ManyToOne
    private TipoAuditor idTipoAuditor;

    public EquipeFiscalizacao() {
    }

    public EquipeFiscalizacao(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdPortaria() {
        return idPortaria;
    }

    public void setIdPortaria(Integer idPortaria) {
        this.idPortaria = idPortaria;
    }

    public Servidor getIdServidor() {
        return idServidor;
    }

    public void setIdServidor(Servidor idServidor) {
        this.idServidor = idServidor;
    }

    public TipoAuditor getIdTipoAuditor() {
        return idTipoAuditor;
    }

    public void setIdTipoAuditor(TipoAuditor idTipoAuditor) {
        this.idTipoAuditor = idTipoAuditor;
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
        if (!(object instanceof EquipeFiscalizacao)) {
            return false;
        }
        EquipeFiscalizacao other = (EquipeFiscalizacao) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.leg.rr.tce.cgesi.auditoria.entity.EquipeFiscalizacao[ id=" + id + " ]";
    }
    
}
