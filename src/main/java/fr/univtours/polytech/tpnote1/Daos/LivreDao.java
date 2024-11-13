package fr.univtours.polytech.tpnote1.Daos;

import java.util.List;

import fr.univtours.polytech.tpnote1.Models.LivreBean;

public interface LivreDao {
    public List<LivreBean> getAllLivre();
    public LivreBean getOneLivre();
    public List<LivreBean> getAllBooks();
    public LivreBean findBookById(Integer bookId);
    public void updateBook(LivreBean book);
    public void deleteBook(Integer bookId);
    public void saveBook(LivreBean book);

}
