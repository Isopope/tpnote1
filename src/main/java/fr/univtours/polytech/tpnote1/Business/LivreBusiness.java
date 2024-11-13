package fr.univtours.polytech.tpnote1.Business;

import java.util.List;

import fr.univtours.polytech.tpnote1.Models.LivreBean;

public interface LivreBusiness {

    public List<LivreBean> getAllBooks();

    // Pour la partie Version v1: rendre et emprunter un livre
    public void returnBook(Integer bookId);

    public void borrowBook(Integer bookId);

    // Pour la partie Version v2: modifier, supprimer et créer un livre dans la BDD
    public void updateBook(LivreBean book);

    public void deleteBook(Integer bookId);

    public void insertBook(LivreBean book);

}
