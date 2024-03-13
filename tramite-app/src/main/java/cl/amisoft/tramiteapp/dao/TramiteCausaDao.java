package cl.amisoft.tramiteapp.dao;

import cl.amisoft.tramiteapp.model.TramiteCausa;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collections;
import java.util.List;

@Repository
public class TramiteCausaDao {

    @PersistenceContext
    protected EntityManager em;

    public List<TramiteCausa> obtenerTodosPorCausa(TramiteCausa tramiteCausa) {
        List resultList = em.createQuery("Select t from TramiteCausa t where t.causa = :idCausa ", TramiteCausa.class)
                .setParameter("idCausa", tramiteCausa.getCausa())
                .getResultList();
        if (!resultList.isEmpty()) {
            return resultList;
        }
        return Collections.emptyList();
    }
}