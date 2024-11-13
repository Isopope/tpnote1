package fr.univtours.polytech.tpnote1.Business;

import java.util.List;

import fr.univtours.polytech.tpnote1.Daos.LivreDao;
import fr.univtours.polytech.tpnote1.Models.LivreBean;
import jakarta.inject.Inject;

public class LivreBusinessImpl implements LivreBusiness {

    @Inject
    private LivreDao livreDAO;

    @Override
    public List<LivreBean> getAllBooks() {
        return livreDAO.getAllLivre();
    }

    @Override
    public void returnBook(Integer bookId) {
        LivreBean book = livreDAO.findBookById(bookId);
        if (book != null && !book.getFree()) {
            book.setFree(true);
            livreDAO.updateBook(book);
        }
    }

    @Override
    public void borrowBook(Integer bookId) {
        LivreBean book = livreDAO.findBookById(bookId);
        if (book != null && book.getFree()) {
            book.setFree(false);
            livreDAO.updateBook(book);
        }
    }

    @Override
    public void updateBook(LivreBean book) {
        LivreBean existingBook = livreDAO.findBookById(book.getId());
        if (existingBook != null) {
            existingBook.setTitle(book.getTitle());
            existingBook.setAuthor(book.getAuthor());
            livreDAO.updateBook(existingBook);
        }
    }

    @Override
    public void deleteBook(Integer bookId) {
        LivreBean book = livreDAO.findBookById(bookId);
        if (book != null) {
            livreDAO.deleteBook(bookId);
        }
    }

    @Override
    public void insertBook(LivreBean book) {
        book.setFree(true);
        livreDAO.saveBook(book);
    }
}
