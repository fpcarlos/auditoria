package br.leg.rr.tce.cgesi.auditoria.ejb;

import br.leg.rr.tce.cgesi.auditoria.comum.entity.UnidadeGestora;
import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class UnidadeGestoraEjb extends AbstractEjb implements Serializable {
    //private static final long serialVersionUID = 1L;

    @PersistenceContext
    private EntityManager entityManager;

    public List<UnidadeGestora> findAll()
            throws Exception {
        try {
            String sql = "select * from comum.v_unidade_gestora";
            List<UnidadeGestora> listaUnidadeGestora = executaSqlNativo(sql, UnidadeGestora.class, entityManager);
            return listaUnidadeGestora;

        } catch (RuntimeException re) {
            re.printStackTrace();
            throw new Exception(" Erro" + re.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(" Erro" + e.getMessage());
        }
    }

    public List<UnidadeGestora> findIdUnidadeGestora(Integer idP) throws Exception {
        try {
            String sql = "select * from comum.v_unidade_gestora where cod_ug=" + idP + "";
            List<UnidadeGestora> listaUGP = executaSqlNativo(sql, UnidadeGestora.class, entityManager);
            return listaUGP;

        } catch (RuntimeException re) {
            re.printStackTrace();
            throw new Exception(" Erro" + re.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(" Erro" + e.getMessage());
        }
    }

   
}
