/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.leg.rr.tce.cgesi.auditoria.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "servidor", schema="scsisaudit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Servidor.findAll", query = "SELECT s FROM Servidor s"),
    @NamedQuery(name = "Servidor.findById", query = "SELECT s FROM Servidor s WHERE s.id = :id"),
    @NamedQuery(name = "Servidor.findByNome", query = "SELECT s FROM Servidor s WHERE s.nome = :nome"),
    @NamedQuery(name = "Servidor.findBySexo", query = "SELECT s FROM Servidor s WHERE s.sexo = :sexo"),
    @NamedQuery(name = "Servidor.findByAutoridade", query = "SELECT s FROM Servidor s WHERE s.autoridade = :autoridade"),
    @NamedQuery(name = "Servidor.findByAuditorFiscal", query = "SELECT s FROM Servidor s WHERE s.auditorFiscal = :auditorFiscal"),
    @NamedQuery(name = "Servidor.findByServidorGabineteAutoridade", query = "SELECT s FROM Servidor s WHERE s.servidorGabineteAutoridade = :servidorGabineteAutoridade"),
    @NamedQuery(name = "Servidor.findByServidorAtualizaPublicacao", query = "SELECT s FROM Servidor s WHERE s.servidorAtualizaPublicacao = :servidorAtualizaPublicacao"),
    @NamedQuery(name = "Servidor.findByLogin", query = "SELECT s FROM Servidor s WHERE s.login = :login"),
    @NamedQuery(name = "Servidor.findByFormacao", query = "SELECT s FROM Servidor s WHERE s.formacao = :formacao"),
    @NamedQuery(name = "Servidor.findByServidorAdministrador", query = "SELECT s FROM Servidor s WHERE s.servidorAdministrador = :servidorAdministrador"),
    @NamedQuery(name = "Servidor.findByServidorAutorizador", query = "SELECT s FROM Servidor s WHERE s.servidorAutorizador = :servidorAutorizador"),
    @NamedQuery(name = "Servidor.findBySenha", query = "SELECT s FROM Servidor s WHERE s.senha = :senha")})
public class Servidor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 2147483647)
    @Column(name = "nome")
    private String nome;
    @Column(name = "sexo")
    private Character sexo;
    @Column(name = "autoridade")
    private Character autoridade;
    @Column(name = "auditor_fiscal")
    private Character auditorFiscal;
    @Column(name = "servidor_gabinete_autoridade")
    private Character servidorGabineteAutoridade;
    @Column(name = "servidor_atualiza_publicacao")
    private Character servidorAtualizaPublicacao;
    @Size(max = 2147483647)
    @Column(name = "login")
    private String login;
    @Size(max = 2147483647)
    @Column(name = "formacao")
    private String formacao;
    @Column(name = "servidor_administrador")
    private Character servidorAdministrador;
    @Column(name = "servidor_autorizador")
    private Character servidorAutorizador;
    @Size(max = 2147483647)
    @Column(name = "senha")
    private String senha;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "servidor")
    private List<Grupo> grupoList;
    @OneToMany(mappedBy = "idServidor")
    private List<EquipeFiscalizacao> equipeFiscalizacaoList;
    @OneToMany(mappedBy = "idServidor")
    private List<Portaria> portariaList;

    public Servidor() {
    }

    public Servidor(Integer id) {
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

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Character getAutoridade() {
        return autoridade;
    }

    public void setAutoridade(Character autoridade) {
        this.autoridade = autoridade;
    }

    public Character getAuditorFiscal() {
        return auditorFiscal;
    }

    public void setAuditorFiscal(Character auditorFiscal) {
        this.auditorFiscal = auditorFiscal;
    }

    public Character getServidorGabineteAutoridade() {
        return servidorGabineteAutoridade;
    }

    public void setServidorGabineteAutoridade(Character servidorGabineteAutoridade) {
        this.servidorGabineteAutoridade = servidorGabineteAutoridade;
    }

    public Character getServidorAtualizaPublicacao() {
        return servidorAtualizaPublicacao;
    }

    public void setServidorAtualizaPublicacao(Character servidorAtualizaPublicacao) {
        this.servidorAtualizaPublicacao = servidorAtualizaPublicacao;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public Character getServidorAdministrador() {
        return servidorAdministrador;
    }

    public void setServidorAdministrador(Character servidorAdministrador) {
        this.servidorAdministrador = servidorAdministrador;
    }

    public Character getServidorAutorizador() {
        return servidorAutorizador;
    }

    public void setServidorAutorizador(Character servidorAutorizador) {
        this.servidorAutorizador = servidorAutorizador;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @XmlTransient
    public List<Grupo> getGrupoList() {
        return grupoList;
    }

    public void setGrupoList(List<Grupo> grupoList) {
        this.grupoList = grupoList;
    }

    @XmlTransient
    public List<EquipeFiscalizacao> getEquipeFiscalizacaoList() {
        return equipeFiscalizacaoList;
    }

    public void setEquipeFiscalizacaoList(List<EquipeFiscalizacao> equipeFiscalizacaoList) {
        this.equipeFiscalizacaoList = equipeFiscalizacaoList;
    }

    @XmlTransient
    public List<Portaria> getPortariaList() {
        return portariaList;
    }

    public void setPortariaList(List<Portaria> portariaList) {
        this.portariaList = portariaList;
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
        if (!(object instanceof Servidor)) {
            return false;
        }
        Servidor other = (Servidor) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.leg.rr.tce.cgesi.auditoria.entity.Servidor[ id=" + id + " ]";
    }
    
}
