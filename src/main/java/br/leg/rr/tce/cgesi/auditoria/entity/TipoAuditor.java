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
@Table(name = "tipo_auditor", schema="scsisaudit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoAuditor.findAll", query = "SELECT t FROM TipoAuditor t"),
    @NamedQuery(name = "TipoAuditor.findById", query = "SELECT t FROM TipoAuditor t WHERE t.id = :id"),
    @NamedQuery(name = "TipoAuditor.findByDescricao", query = "SELECT t FROM TipoAuditor t WHERE t.descricao = :descricao"),
    @NamedQuery(name = "TipoAuditor.findByFuncao", query = "SELECT t FROM TipoAuditor t WHERE t.funcao = :funcao")})
public class TipoAuditor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 2147483647)
    @Column(name = "descricao")
    private String descricao;
    @Size(max = 2147483647)
    @Column(name = "funcao")
    private String funcao;
    @OneToMany(mappedBy = "idTipoAuditor")
    private List<EquipeFiscalizacao> equipeFiscalizacaoList;

    public TipoAuditor() {
    }

    public TipoAuditor(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @XmlTransient
    public List<EquipeFiscalizacao> getEquipeFiscalizacaoList() {
        return equipeFiscalizacaoList;
    }

    public void setEquipeFiscalizacaoList(List<EquipeFiscalizacao> equipeFiscalizacaoList) {
        this.equipeFiscalizacaoList = equipeFiscalizacaoList;
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
        if (!(object instanceof TipoAuditor)) {
            return false;
        }
        TipoAuditor other = (TipoAuditor) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.leg.rr.tce.cgesi.auditoria.entity.TipoAuditor[ id=" + id + " ]";
    }
    
}
