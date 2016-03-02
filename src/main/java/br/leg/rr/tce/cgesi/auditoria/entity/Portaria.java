/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.leg.rr.tce.cgesi.auditoria.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author fpcarlos
 */
@Entity
@Table(name = "portaria", schema="scsisaudit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Portaria.findAll", query = "SELECT p FROM Portaria p"),
    @NamedQuery(name = "Portaria.findById", query = "SELECT p FROM Portaria p WHERE p.id = :id"),
    @NamedQuery(name = "Portaria.findByIdAuditoria", query = "SELECT p FROM Portaria p WHERE p.idAuditoria = :idAuditoria"),
    @NamedQuery(name = "Portaria.findByProcessoNumero", query = "SELECT p FROM Portaria p WHERE p.processoNumero = :processoNumero"),
    @NamedQuery(name = "Portaria.findByProcessoAno", query = "SELECT p FROM Portaria p WHERE p.processoAno = :processoAno"),
    @NamedQuery(name = "Portaria.findByDataAssinatura", query = "SELECT p FROM Portaria p WHERE p.dataAssinatura = :dataAssinatura"),
    @NamedQuery(name = "Portaria.findByNumeroPublicaDoe", query = "SELECT p FROM Portaria p WHERE p.numeroPublicaDoe = :numeroPublicaDoe"),
    @NamedQuery(name = "Portaria.findByDataPublicaDoe", query = "SELECT p FROM Portaria p WHERE p.dataPublicaDoe = :dataPublicaDoe"),
    @NamedQuery(name = "Portaria.findByObjetivo", query = "SELECT p FROM Portaria p WHERE p.objetivo = :objetivo"),
    @NamedQuery(name = "Portaria.findByDeliberacao", query = "SELECT p FROM Portaria p WHERE p.deliberacao = :deliberacao"),
    @NamedQuery(name = "Portaria.findByNumeroPortariaRevogada", query = "SELECT p FROM Portaria p WHERE p.numeroPortariaRevogada = :numeroPortariaRevogada"),
    @NamedQuery(name = "Portaria.findByAnoPortariaRevogada", query = "SELECT p FROM Portaria p WHERE p.anoPortariaRevogada = :anoPortariaRevogada"),
    @NamedQuery(name = "Portaria.findByPlanInicio", query = "SELECT p FROM Portaria p WHERE p.planInicio = :planInicio"),
    @NamedQuery(name = "Portaria.findByPlanFim", query = "SELECT p FROM Portaria p WHERE p.planFim = :planFim"),
    @NamedQuery(name = "Portaria.findByPlanDiasUteis", query = "SELECT p FROM Portaria p WHERE p.planDiasUteis = :planDiasUteis"),
    @NamedQuery(name = "Portaria.findByExecInicio", query = "SELECT p FROM Portaria p WHERE p.execInicio = :execInicio"),
    @NamedQuery(name = "Portaria.findByExecFim", query = "SELECT p FROM Portaria p WHERE p.execFim = :execFim"),
    @NamedQuery(name = "Portaria.findByExecDiasUteis", query = "SELECT p FROM Portaria p WHERE p.execDiasUteis = :execDiasUteis"),
    @NamedQuery(name = "Portaria.findByRelaInicio", query = "SELECT p FROM Portaria p WHERE p.relaInicio = :relaInicio"),
    @NamedQuery(name = "Portaria.findByRelaFim", query = "SELECT p FROM Portaria p WHERE p.relaFim = :relaFim"),
    @NamedQuery(name = "Portaria.findByRelaDiasUteis", query = "SELECT p FROM Portaria p WHERE p.relaDiasUteis = :relaDiasUteis"),
    @NamedQuery(name = "Portaria.findByNumeroPortaria", query = "SELECT p FROM Portaria p WHERE p.numeroPortaria = :numeroPortaria"),
    @NamedQuery(name = "Portaria.findByAnoPortaria", query = "SELECT p FROM Portaria p WHERE p.anoPortaria = :anoPortaria"),
    @NamedQuery(name = "Portaria.findByDataAssinatuaPortaria", query = "SELECT p FROM Portaria p WHERE p.dataAssinatuaPortaria = :dataAssinatuaPortaria")})
public class Portaria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "id_auditoria")
    private Integer idAuditoria;
    @Size(max = 5)
    @Column(name = "processo_numero")
    private String processoNumero;
    @Size(max = 4)
    @Column(name = "processo_ano")
    private String processoAno;
    @Column(name = "data_assinatura")
    @Temporal(TemporalType.DATE)
    private Date dataAssinatura;
    @Size(max = 10)
    @Column(name = "numero_publica_doe")
    private String numeroPublicaDoe;
    @Column(name = "data_publica_doe")
    @Temporal(TemporalType.DATE)
    private Date dataPublicaDoe;
    @Size(max = 2147483647)
    @Column(name = "objetivo")
    private String objetivo;
    @Size(max = 2147483647)
    @Column(name = "deliberacao")
    private String deliberacao;
    @Size(max = 10)
    @Column(name = "numero_portaria_revogada")
    private String numeroPortariaRevogada;
    @Size(max = 4)
    @Column(name = "ano_portaria_revogada")
    private String anoPortariaRevogada;
    @Column(name = "plan_inicio")
    @Temporal(TemporalType.DATE)
    private Date planInicio;
    @Column(name = "plan_fim")
    @Temporal(TemporalType.DATE)
    private Date planFim;
    @Column(name = "plan_dias_uteis")
    private Integer planDiasUteis;
    @Column(name = "exec_inicio")
    @Temporal(TemporalType.DATE)
    private Date execInicio;
    @Column(name = "exec_fim")
    @Temporal(TemporalType.DATE)
    private Date execFim;
    @Column(name = "exec_dias_uteis")
    private Integer execDiasUteis;
    @Column(name = "rela_inicio")
    @Temporal(TemporalType.DATE)
    private Date relaInicio;
    @Column(name = "rela_fim")
    @Temporal(TemporalType.DATE)
    private Date relaFim;
    @Column(name = "rela_dias_uteis")
    private Integer relaDiasUteis;
    @Size(max = 3)
    @Column(name = "numero_portaria")
    private String numeroPortaria;
    @Size(max = 4)
    @Column(name = "ano_portaria")
    private String anoPortaria;
    @Column(name = "data_assinatua_portaria")
    @Temporal(TemporalType.DATE)
    private Date dataAssinatuaPortaria;
    @JoinColumn(name = "id_servidor", referencedColumnName = "id")
    @ManyToOne
    private Servidor idServidor;
    @JoinColumn(name = "id_tipo_fiscalizacao", referencedColumnName = "id")
    @ManyToOne
    private TipoFiscalizacao idTipoFiscalizacao;
    @JoinColumn(name = "id_unidade_fiscalizadora", referencedColumnName = "id")
    @ManyToOne
    private UnidadeFiscalizadora idUnidadeFiscalizadora;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPortaria")
    private List<UnidadeGestoraPortaria> unidadeGestoraPortariaList;
    @OneToMany(mappedBy = "idPortaria")
    private List<PortariasAndamento> portariasAndamentoList;

    public Portaria() {
    }

    public Portaria(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdAuditoria() {
        return idAuditoria;
    }

    public void setIdAuditoria(Integer idAuditoria) {
        this.idAuditoria = idAuditoria;
    }

    public String getProcessoNumero() {
        return processoNumero;
    }

    public void setProcessoNumero(String processoNumero) {
        this.processoNumero = processoNumero;
    }

    public String getProcessoAno() {
        return processoAno;
    }

    public void setProcessoAno(String processoAno) {
        this.processoAno = processoAno;
    }

    public Date getDataAssinatura() {
        return dataAssinatura;
    }

    public void setDataAssinatura(Date dataAssinatura) {
        this.dataAssinatura = dataAssinatura;
    }

    public String getNumeroPublicaDoe() {
        return numeroPublicaDoe;
    }

    public void setNumeroPublicaDoe(String numeroPublicaDoe) {
        this.numeroPublicaDoe = numeroPublicaDoe;
    }

    public Date getDataPublicaDoe() {
        return dataPublicaDoe;
    }

    public void setDataPublicaDoe(Date dataPublicaDoe) {
        this.dataPublicaDoe = dataPublicaDoe;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getDeliberacao() {
        return deliberacao;
    }

    public void setDeliberacao(String deliberacao) {
        this.deliberacao = deliberacao;
    }

    public String getNumeroPortariaRevogada() {
        return numeroPortariaRevogada;
    }

    public void setNumeroPortariaRevogada(String numeroPortariaRevogada) {
        this.numeroPortariaRevogada = numeroPortariaRevogada;
    }

    public String getAnoPortariaRevogada() {
        return anoPortariaRevogada;
    }

    public void setAnoPortariaRevogada(String anoPortariaRevogada) {
        this.anoPortariaRevogada = anoPortariaRevogada;
    }

    public Date getPlanInicio() {
        return planInicio;
    }

    public void setPlanInicio(Date planInicio) {
        this.planInicio = planInicio;
    }

    public Date getPlanFim() {
        return planFim;
    }

    public void setPlanFim(Date planFim) {
        this.planFim = planFim;
    }

    public Integer getPlanDiasUteis() {
        return planDiasUteis;
    }

    public void setPlanDiasUteis(Integer planDiasUteis) {
        this.planDiasUteis = planDiasUteis;
    }

    public Date getExecInicio() {
        return execInicio;
    }

    public void setExecInicio(Date execInicio) {
        this.execInicio = execInicio;
    }

    public Date getExecFim() {
        return execFim;
    }

    public void setExecFim(Date execFim) {
        this.execFim = execFim;
    }

    public Integer getExecDiasUteis() {
        return execDiasUteis;
    }

    public void setExecDiasUteis(Integer execDiasUteis) {
        this.execDiasUteis = execDiasUteis;
    }

    public Date getRelaInicio() {
        return relaInicio;
    }

    public void setRelaInicio(Date relaInicio) {
        this.relaInicio = relaInicio;
    }

    public Date getRelaFim() {
        return relaFim;
    }

    public void setRelaFim(Date relaFim) {
        this.relaFim = relaFim;
    }

    public Integer getRelaDiasUteis() {
        return relaDiasUteis;
    }

    public void setRelaDiasUteis(Integer relaDiasUteis) {
        this.relaDiasUteis = relaDiasUteis;
    }

    public String getNumeroPortaria() {
        return numeroPortaria;
    }

    public void setNumeroPortaria(String numeroPortaria) {
        this.numeroPortaria = numeroPortaria;
    }

    public String getAnoPortaria() {
        return anoPortaria;
    }

    public void setAnoPortaria(String anoPortaria) {
        this.anoPortaria = anoPortaria;
    }

    public Date getDataAssinatuaPortaria() {
        return dataAssinatuaPortaria;
    }

    public void setDataAssinatuaPortaria(Date dataAssinatuaPortaria) {
        this.dataAssinatuaPortaria = dataAssinatuaPortaria;
    }

    public Servidor getIdServidor() {
        return idServidor;
    }

    public void setIdServidor(Servidor idServidor) {
        this.idServidor = idServidor;
    }

    public TipoFiscalizacao getIdTipoFiscalizacao() {
        return idTipoFiscalizacao;
    }

    public void setIdTipoFiscalizacao(TipoFiscalizacao idTipoFiscalizacao) {
        this.idTipoFiscalizacao = idTipoFiscalizacao;
    }

    public UnidadeFiscalizadora getIdUnidadeFiscalizadora() {
        return idUnidadeFiscalizadora;
    }

    public void setIdUnidadeFiscalizadora(UnidadeFiscalizadora idUnidadeFiscalizadora) {
        this.idUnidadeFiscalizadora = idUnidadeFiscalizadora;
    }

    @XmlTransient
    public List<UnidadeGestoraPortaria> getUnidadeGestoraPortariaList() {
        return unidadeGestoraPortariaList;
    }

    public void setUnidadeGestoraPortariaList(List<UnidadeGestoraPortaria> unidadeGestoraPortariaList) {
        this.unidadeGestoraPortariaList = unidadeGestoraPortariaList;
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
        if (!(object instanceof Portaria)) {
            return false;
        }
        Portaria other = (Portaria) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.leg.rr.tce.cgesi.auditoria.entity.Portaria[ id=" + id + " ]";
    }
    
}
