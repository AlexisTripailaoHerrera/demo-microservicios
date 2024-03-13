package cl.amisoft.causaapp.dao;

import cl.amisoft.causaapp.model.Causa;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Optional;

@Repository
public class CausaDao {

    @PersistenceContext
    protected EntityManager em;

    public Optional<Causa> obtenerCausa(Long id) {
        Causa c = em.createQuery("Select c from Causa c where c.id = :id", Causa.class).setParameter("id",id).getSingleResult();
        return Optional.ofNullable(c);
    }
}
