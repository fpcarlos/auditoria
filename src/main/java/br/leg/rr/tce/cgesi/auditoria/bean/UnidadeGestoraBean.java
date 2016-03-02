package br.leg.rr.tce.cgesi.auditoria.bean;

import br.leg.rr.tce.cgesi.auditoria.comum.entity.UnidadeGestora;
import br.leg.rr.tce.cgesi.auditoria.ejb.UnidadeGestoraEjb;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;


@Named
@SessionScoped
public class UnidadeGestoraBean extends AbstractBean implements Serializable {
	private static final long serialVersionUID = 1L;

	@EJB
	private UnidadeGestora unidadeGestora;
	
	@EJB
	private UnidadeGestoraEjb unidadeGestoraEjb;
	
	
	private List<UnidadeGestora> todasUnidadeGestoras = new ArrayList<UnidadeGestora>();
	
	public UnidadeGestoraBean() {
		super();		
	}

	public UnidadeGestora getUnidadeGestora() {
		return unidadeGestora;
	}

	public void setUnidadeGestora(UnidadeGestora unidadeGestora) {
		this.unidadeGestora = unidadeGestora;
	}

	public List<UnidadeGestora> getTodasUnidadeGestoras() {
		return todasUnidadeGestoras;
	}

	public void setTodasUnidadeGestoras(List<UnidadeGestora> todasUnidadeGestoras) {
		this.todasUnidadeGestoras = todasUnidadeGestoras;
	}

	

}
