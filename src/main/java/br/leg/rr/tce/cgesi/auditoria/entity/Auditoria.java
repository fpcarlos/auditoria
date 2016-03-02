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
@Table(name = "auditoria", schema="scsisaudit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Auditoria.findAll", query = "SELECT a FROM Auditoria a"),
    @NamedQuery(name = "Auditoria.findById", query = "SELECT a FROM Auditoria a WHERE a.id = :id"),
    @NamedQuery(name = "Auditoria.findByIdauditoria", query = "SELECT a FROM Auditoria a WHERE a.idauditoria = :idauditoria"),
    @NamedQuery(name = "Auditoria.findByTitulo", query = "SELECT a FROM Auditoria a WHERE a.titulo = :titulo"),
    @NamedQuery(name = "Auditoria.findByObjetivo", query = "SELECT a FROM Auditoria a WHERE a.objetivo = :objetivo"),
    @NamedQuery(name = "Auditoria.findByNumprocesso", query = "SELECT a FROM Auditoria a WHERE a.numprocesso = :numprocesso"),
    @NamedQuery(name = "Auditoria.findByRelator", query = "SELECT a FROM Auditoria a WHERE a.relator = :relator"),
    @NamedQuery(name = "Auditoria.findByPlanInicioPrev", query = "SELECT a FROM Auditoria a WHERE a.planInicioPrev = :planInicioPrev"),
    @NamedQuery(name = "Auditoria.findByPlanFimPrev", query = "SELECT a FROM Auditoria a WHERE a.planFimPrev = :planFimPrev"),
    @NamedQuery(name = "Auditoria.findByPlanDiasUteisPrev", query = "SELECT a FROM Auditoria a WHERE a.planDiasUteisPrev = :planDiasUteisPrev"),
    @NamedQuery(name = "Auditoria.findByPlanInicioReal", query = "SELECT a FROM Auditoria a WHERE a.planInicioReal = :planInicioReal"),
    @NamedQuery(name = "Auditoria.findByPlanFimReal", query = "SELECT a FROM Auditoria a WHERE a.planFimReal = :planFimReal"),
    @NamedQuery(name = "Auditoria.findByPlanDiasUteisReal", query = "SELECT a FROM Auditoria a WHERE a.planDiasUteisReal = :planDiasUteisReal"),
    @NamedQuery(name = "Auditoria.findByExecInicioPrev", query = "SELECT a FROM Auditoria a WHERE a.execInicioPrev = :execInicioPrev"),
    @NamedQuery(name = "Auditoria.findByExecFimPrev", query = "SELECT a FROM Auditoria a WHERE a.execFimPrev = :execFimPrev"),
    @NamedQuery(name = "Auditoria.findByExecDiasUteisPrev", query = "SELECT a FROM Auditoria a WHERE a.execDiasUteisPrev = :execDiasUteisPrev"),
    @NamedQuery(name = "Auditoria.findByExecInicioReal", query = "SELECT a FROM Auditoria a WHERE a.execInicioReal = :execInicioReal"),
    @NamedQuery(name = "Auditoria.findByExecFimReal", query = "SELECT a FROM Auditoria a WHERE a.execFimReal = :execFimReal"),
    @NamedQuery(name = "Auditoria.findByExecDiasUteisReal", query = "SELECT a FROM Auditoria a WHERE a.execDiasUteisReal = :execDiasUteisReal"),
    @NamedQuery(name = "Auditoria.findByRelaInicioPrev", query = "SELECT a FROM Auditoria a WHERE a.relaInicioPrev = :relaInicioPrev"),
    @NamedQuery(name = "Auditoria.findByRelaFimPrev", query = "SELECT a FROM Auditoria a WHERE a.relaFimPrev = :relaFimPrev"),
    @NamedQuery(name = "Auditoria.findByRelaDiasUteisPrev", query = "SELECT a FROM Auditoria a WHERE a.relaDiasUteisPrev = :relaDiasUteisPrev"),
    @NamedQuery(name = "Auditoria.findByRelaInicioReal", query = "SELECT a FROM Auditoria a WHERE a.relaInicioReal = :relaInicioReal"),
    @NamedQuery(name = "Auditoria.findByRelaFimReal", query = "SELECT a FROM Auditoria a WHERE a.relaFimReal = :relaFimReal"),
    @NamedQuery(name = "Auditoria.findByMotivacaoFiscal", query = "SELECT a FROM Auditoria a WHERE a.motivacaoFiscal = :motivacaoFiscal"),
    @NamedQuery(name = "Auditoria.findByRelaDiasUteisReal", query = "SELECT a FROM Auditoria a WHERE a.relaDiasUteisReal = :relaDiasUteisReal"),
    @NamedQuery(name = "Auditoria.findByExerciciosAnteriores", query = "SELECT a FROM Auditoria a WHERE a.exerciciosAnteriores = :exerciciosAnteriores")})
public class Auditoria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "idauditoria")
    private String idauditoria;
    @Size(max = 255)
    @Column(name = "titulo")
    private String titulo;
    @Size(max = 2147483647)
    @Column(name = "objetivo")
    private String objetivo;
    @Size(max = 255)
    @Column(name = "numprocesso")
    private String numprocesso;
    @Size(max = 255)
    @Column(name = "relator")
    private String relator;
    @Column(name = "plan_inicio_prev")
    @Temporal(TemporalType.DATE)
    private Date planInicioPrev;
    @Column(name = "plan_fim_prev")
    @Temporal(TemporalType.DATE)
    private Date planFimPrev;
    @Column(name = "plan_dias_uteis_prev")
    private Integer planDiasUteisPrev;
    @Column(name = "plan_inicio_real")
    @Temporal(TemporalType.DATE)
    private Date planInicioReal;
    @Column(name = "plan_fim_real")
    @Temporal(TemporalType.DATE)
    private Date planFimReal;
    @Column(name = "plan_dias_uteis_real")
    private Integer planDiasUteisReal;
    @Column(name = "exec_inicio_prev")
    @Temporal(TemporalType.DATE)
    private Date execInicioPrev;
    @Column(name = "exec_fim_prev")
    @Temporal(TemporalType.DATE)
    private Date execFimPrev;
    @Column(name = "exec_dias_uteis_prev")
    private Integer execDiasUteisPrev;
    @Column(name = "exec_inicio_real")
    @Temporal(TemporalType.DATE)
    private Date execInicioReal;
    @Column(name = "exec_fim_real")
    @Temporal(TemporalType.DATE)
    private Date execFimReal;
    @Column(name = "exec_dias_uteis_real")
    private Integer execDiasUteisReal;
    @Column(name = "rela_inicio_prev")
    @Temporal(TemporalType.DATE)
    private Date relaInicioPrev;
    @Column(name = "rela_fim_prev")
    @Temporal(TemporalType.DATE)
    private Date relaFimPrev;
    @Column(name = "rela_dias_uteis_prev")
    private Integer relaDiasUteisPrev;
    @Column(name = "rela_inicio_real")
    @Temporal(TemporalType.DATE)
    private Date relaInicioReal;
    @Column(name = "rela_fim_real")
    @Temporal(TemporalType.DATE)
    private Date relaFimReal;
    @Size(max = 2147483647)
    @Column(name = "motivacao_fiscal")
    private String motivacaoFiscal;
    @Column(name = "rela_dias_uteis_real")
    private Integer relaDiasUteisReal;
    @Column(name = "exercicios_anteriores")
    private Boolean exerciciosAnteriores;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAuditoria")
    private List<UnidadeGestoraAuditoria> unidadeGestoraAuditoriaList;
    @JoinColumn(name = "id_criterios_selecao", referencedColumnName = "id")
    @ManyToOne
    private CriteriosSelecao idCriteriosSelecao;
    @JoinColumn(name = "id_origem_auditoria", referencedColumnName = "id")
    @ManyToOne
    private OrigemAuditoria idOrigemAuditoria;
    @JoinColumn(name = "id_tipo_fiscalizacao", referencedColumnName = "id")
    @ManyToOne
    private TipoFiscalizacao idTipoFiscalizacao;
    @JoinColumn(name = "id_unidade_fiscalizadora", referencedColumnName = "id")
    @ManyToOne
    private UnidadeFiscalizadora idUnidadeFiscalizadora;

    public Auditoria() {
    }

    public Auditoria(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdauditoria() {
        return idauditoria;
    }

    public void setIdauditoria(String idauditoria) {
        this.idauditoria = idauditoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getNumprocesso() {
        return numprocesso;
    }

    public void setNumprocesso(String numprocesso) {
        this.numprocesso = numprocesso;
    }

    public String getRelator() {
        return relator;
    }

    public void setRelator(String relator) {
        this.relator = relator;
    }

    public Date getPlanInicioPrev() {
        return planInicioPrev;
    }

    public void setPlanInicioPrev(Date planInicioPrev) {
        this.planInicioPrev = planInicioPrev;
    }

    public Date getPlanFimPrev() {
        return planFimPrev;
    }

    public void setPlanFimPrev(Date planFimPrev) {
        this.planFimPrev = planFimPrev;
    }

    public Integer getPlanDiasUteisPrev() {
        return planDiasUteisPrev;
    }

    public void setPlanDiasUteisPrev(Integer planDiasUteisPrev) {
        this.planDiasUteisPrev = planDiasUteisPrev;
    }

    public Date getPlanInicioReal() {
        return planInicioReal;
    }

    public void setPlanInicioReal(Date planInicioReal) {
        this.planInicioReal = planInicioReal;
    }

    public Date getPlanFimReal() {
        return planFimReal;
    }

    public void setPlanFimReal(Date planFimReal) {
        this.planFimReal = planFimReal;
    }

    public Integer getPlanDiasUteisReal() {
        return planDiasUteisReal;
    }

    public void setPlanDiasUteisReal(Integer planDiasUteisReal) {
        this.planDiasUteisReal = planDiasUteisReal;
    }

    public Date getExecInicioPrev() {
        return execInicioPrev;
    }

    public void setExecInicioPrev(Date execInicioPrev) {
        this.execInicioPrev = execInicioPrev;
    }

    public Date getExecFimPrev() {
        return execFimPrev;
    }

    public void setExecFimPrev(Date execFimPrev) {
        this.execFimPrev = execFimPrev;
    }

    public Integer getExecDiasUteisPrev() {
        return execDiasUteisPrev;
    }

    public void setExecDiasUteisPrev(Integer execDiasUteisPrev) {
        this.execDiasUteisPrev = execDiasUteisPrev;
    }

    public Date getExecInicioReal() {
        return execInicioReal;
    }

    public void setExecInicioReal(Date execInicioReal) {
        this.execInicioReal = execInicioReal;
    }

    public Date getExecFimReal() {
        return execFimReal;
    }

    public void setExecFimReal(Date execFimReal) {
        this.execFimReal = execFimReal;
    }

    public Integer getExecDiasUteisReal() {
        return execDiasUteisReal;
    }

    public void setExecDiasUteisReal(Integer execDiasUteisReal) {
        this.execDiasUteisReal = execDiasUteisReal;
    }

    public Date getRelaInicioPrev() {
        return relaInicioPrev;
    }

    public void setRelaInicioPrev(Date relaInicioPrev) {
        this.relaInicioPrev = relaInicioPrev;
    }

    public Date getRelaFimPrev() {
        return relaFimPrev;
    }

    public void setRelaFimPrev(Date relaFimPrev) {
        this.relaFimPrev = relaFimPrev;
    }

    public Integer getRelaDiasUteisPrev() {
        return relaDiasUteisPrev;
    }

    public void setRelaDiasUteisPrev(Integer relaDiasUteisPrev) {
        this.relaDiasUteisPrev = relaDiasUteisPrev;
    }

    public Date getRelaInicioReal() {
        return relaInicioReal;
    }

    public void setRelaInicioReal(Date relaInicioReal) {
        this.relaInicioReal = relaInicioReal;
    }

    public Date getRelaFimReal() {
        return relaFimReal;
    }

    public void setRelaFimReal(Date relaFimReal) {
        this.relaFimReal = relaFimReal;
    }

    public String getMotivacaoFiscal() {
        return motivacaoFiscal;
    }

    public void setMotivacaoFiscal(String motivacaoFiscal) {
        this.motivacaoFiscal = motivacaoFiscal;
    }

    public Integer getRelaDiasUteisReal() {
        return relaDiasUteisReal;
    }

    public void setRelaDiasUteisReal(Integer relaDiasUteisReal) {
        this.relaDiasUteisReal = relaDiasUteisReal;
    }

    public Boolean getExerciciosAnteriores() {
        return exerciciosAnteriores;
    }

    public void setExerciciosAnteriores(Boolean exerciciosAnteriores) {
        this.exerciciosAnteriores = exerciciosAnteriores;
    }

    @XmlTransient
    public List<UnidadeGestoraAuditoria> getUnidadeGestoraAuditoriaList() {
        return unidadeGestoraAuditoriaList;
    }

    public void setUnidadeGestoraAuditoriaList(List<UnidadeGestoraAuditoria> unidadeGestoraAuditoriaList) {
        this.unidadeGestoraAuditoriaList = unidadeGestoraAuditoriaList;
    }

    public CriteriosSelecao getIdCriteriosSelecao() {
        return idCriteriosSelecao;
    }

    public void setIdCriteriosSelecao(CriteriosSelecao idCriteriosSelecao) {
        this.idCriteriosSelecao = idCriteriosSelecao;
    }

    public OrigemAuditoria getIdOrigemAuditoria() {
        return idOrigemAuditoria;
    }

    public void setIdOrigemAuditoria(OrigemAuditoria idOrigemAuditoria) {
        this.idOrigemAuditoria = idOrigemAuditoria;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Auditoria)) {
            return false;
        }
        Auditoria other = (Auditoria) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.leg.rr.tce.cgesi.auditoria.entity.Auditoria[ id=" + id + " ]";
    }
    
}
