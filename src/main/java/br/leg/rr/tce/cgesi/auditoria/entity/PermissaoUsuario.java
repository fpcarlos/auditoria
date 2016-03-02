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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author fpcarlos
 */
@Entity
@Table(name = "permissao_usuario", schema="scsisaudit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PermissaoUsuario.findAll", query = "SELECT p FROM PermissaoUsuario p"),
    @NamedQuery(name = "PermissaoUsuario.findById", query = "SELECT p FROM PermissaoUsuario p WHERE p.id = :id"),
    @NamedQuery(name = "PermissaoUsuario.findByBlativo", query = "SELECT p FROM PermissaoUsuario p WHERE p.blativo = :blativo"),
    @NamedQuery(name = "PermissaoUsuario.findByDtentrada", query = "SELECT p FROM PermissaoUsuario p WHERE p.dtentrada = :dtentrada"),
    @NamedQuery(name = "PermissaoUsuario.findByDtsaida", query = "SELECT p FROM PermissaoUsuario p WHERE p.dtsaida = :dtsaida"),
    @NamedQuery(name = "PermissaoUsuario.findByUsuarioId", query = "SELECT p FROM PermissaoUsuario p WHERE p.usuarioId = :usuarioId")})
public class PermissaoUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "blativo")
    private Boolean blativo;
    @Column(name = "dtentrada")
    @Temporal(TemporalType.DATE)
    private Date dtentrada;
    @Column(name = "dtsaida")
    @Temporal(TemporalType.DATE)
    private Date dtsaida;
    @Column(name = "usuario_id")
    private Integer usuarioId;
    @JoinColumn(name = "permissao_id", referencedColumnName = "id")
    @ManyToOne
    private Permissao permissaoId;

    public PermissaoUsuario() {
    }

    public PermissaoUsuario(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getBlativo() {
        return blativo;
    }

    public void setBlativo(Boolean blativo) {
        this.blativo = blativo;
    }

    public Date getDtentrada() {
        return dtentrada;
    }

    public void setDtentrada(Date dtentrada) {
        this.dtentrada = dtentrada;
    }

    public Date getDtsaida() {
        return dtsaida;
    }

    public void setDtsaida(Date dtsaida) {
        this.dtsaida = dtsaida;
    }

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Permissao getPermissaoId() {
        return permissaoId;
    }

    public void setPermissaoId(Permissao permissaoId) {
        this.permissaoId = permissaoId;
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
        if (!(object instanceof PermissaoUsuario)) {
            return false;
        }
        PermissaoUsuario other = (PermissaoUsuario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.leg.rr.tce.cgesi.auditoria.entity.PermissaoUsuario[ id=" + id + " ]";
    }
    
}
