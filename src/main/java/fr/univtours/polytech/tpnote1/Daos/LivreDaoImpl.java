package fr.univtours.polytech.tpnote1.Daos;

import java.util.List;

import fr.univtours.polytech.tpnote1.Models.LivreBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless
public class LivreDaoImpl implements LivreDao {
    @PersistenceContext(unitName = "tp_note_1")
    private EntityManager em;

    @SuppressWarnings("unchecked")

    @Override
    public List<LivreBean> getAllLivre() {
        Query req = em.createNativeQuery("SELECT * FROM BOOK", LivreBean.class);
        return req.getResultList();

    }

    @Override
    public LivreBean getOneLivre(Integer id) {
        return em.find(LivreBean.class, id);
    }

    @Override
    public LivreBean updateLivre(LivreBean livre) {
        return em.merge(livre);
    }

}
