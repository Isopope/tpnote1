package fr.univtours.polytech.tpnote1.Controllers;

import java.io.IOException;
import java.util.List;

import fr.univtours.polytech.tpnote1.Business.LivreBusiness;
import fr.univtours.polytech.tpnote1.Models.LivreBean;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "afficherLivre", urlPatterns = "/livres")
public class AfficherLivre extends HttpServlet {

    @Inject
    private LivreBusiness livreBusiness;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<LivreBean> livres = livreBusiness.getAllBooks();

        request.setAttribute("LIVRES", livres);

        request.getRequestDispatcher("livres").forward(request, response);
    }
}
