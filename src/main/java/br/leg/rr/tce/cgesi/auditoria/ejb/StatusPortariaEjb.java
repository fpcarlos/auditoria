package br.leg.rr.tce.cgesi.auditoria.ejb;

import br.leg.rr.tce.cgesi.auditoria.entity.StatusPortaria;
import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class StatusPortariaEjb extends AbstractEjb implements Serializable {

    //private static final long serialVersionUID = 1L;
    @PersistenceContext
    private EntityManager entityManager;

    public StatusPortaria pegarStatusPortariaId(Integer id) throws Exception {
        try {
            StatusPortaria statusPortaria = new StatusPortaria();
            statusPortaria = entityManager.find(StatusPortaria.class, id);
            return statusPortaria;
        } catch (Exception e) {
            throw e;
        }
    }

    public List<StatusPortaria> findAll() throws Exception {
        try {
            String sql = "select * from scsisaudit.status_portaria order by id";
            List<StatusPortaria> listaPortaria = executaSqlNativo(sql, StatusPortaria.class, entityManager);
            return listaPortaria;

        } catch (RuntimeException re) {
            re.printStackTrace();
            throw new Exception(" Erro" + re.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(" Erro" + e.getMessage());
        }

    }

}
