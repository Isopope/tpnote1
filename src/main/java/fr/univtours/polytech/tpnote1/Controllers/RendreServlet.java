package fr.univtours.polytech.tpnote1.Controllers;

import java.io.IOException;

import fr.univtours.polytech.tpnote1.Business.LivreBusiness;
import jakarta.inject.Inject;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/rendre")
public class RendreServlet extends HttpServlet {

    @Inject
    private LivreBusiness livreBusiness;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        Integer bookId = Integer.parseInt(request.getParameter("bookId"));

        livreBusiness.returnBook(bookId);

        response.sendRedirect("home");
    }
}
