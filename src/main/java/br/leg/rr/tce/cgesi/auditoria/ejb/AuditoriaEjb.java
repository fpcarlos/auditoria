/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.leg.rr.tce.cgesi.auditoria.ejb;

import br.leg.rr.tce.cgesi.auditoria.entity.Auditoria;
import java.io.Serializable;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author fpcarlos
 */
@Stateless
public class AuditoriaEjb extends AbstractEjb implements Serializable {

    @PersistenceContext
    private EntityManager entityManager;

    public void salvar(Auditoria entity) throws Exception {
        try {
            if (entity.getId() != null && entity.getId() > 0) {
                entityManager.merge(entity);
            } else {
                entityManager.persist(entity);
            }

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    public void remove(Auditoria entity) throws Exception {
        try {
            Auditoria auditoria = entityManager.find(Auditoria.class, entity.getId());
            entityManager.remove(auditoria);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public List<Auditoria> findAll() throws Exception {
        try {
            String sql = "select * from scsisaudit.auditoria";
            List<Auditoria> listaAuditoria = executaSqlNativo(sql, Auditoria.class, entityManager);
            return listaAuditoria;

        } catch (RuntimeException re) {
            re.printStackTrace();
            throw new Exception(" Erro" + re.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(" Erro" + e.getMessage());
        }

    }

}
