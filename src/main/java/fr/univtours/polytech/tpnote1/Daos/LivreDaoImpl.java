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
<<<<<<< HEAD
    public LivreBean updateBook(LivreBean livre) {
        return em.merge(livre);
=======
    public LivreBean findBookById(Integer bookId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findBookById'");
>>>>>>> 3f5db45a92b374fd8e6f90584fe07e594100afe8
    }

    @Override
    public void updateBook(LivreBean book) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateBook'");
    }

    @Override
    public void deleteBook(Integer bookId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteBook'");
    }

    @Override
    public void saveBook(LivreBean book) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveBook'");
    }


    


    

}
