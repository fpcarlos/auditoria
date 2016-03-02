package br.leg.rr.tce.cgesi.auditoria.comum.converter;

import br.leg.rr.tce.cgesi.auditoria.comum.entity.UnidadeGestora;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;


@FacesConverter("converterAutoCompletUG")
public class ConverterAutoCompletUG implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		UnidadeGestora unidG = new UnidadeGestora();
		
		return unidG;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		return "";
	}

	
	
}
