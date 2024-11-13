<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Liste des Livres</title>
        <link rel="stylesheet" href="styles.css">
    </head>
<body>
    <h1>Livres de la bibliothèque</h1>
    
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Author</th>
            <th>Free</th>
            <th>Action</th>
        </tr>
        

        <c:forEach var="book" items="${books}">
            <tr>
                <td>${book.id}</td>
                <td>${book.title}</td>
                <td>${book.author}</td>
                <td>
                    <c:choose>
                        <!--Dand le cas le livre est disponible  -->
                        <c:when test="${book.free}">
                            Disponible
                        </c:when>
                        <!-- Dans le cas le livre est emprunté  -->
                        <c:otherwise>
                            Emprunté
                        </c:otherwise>
                    </c:choose>
                </td>
                <td>
        
                    <c:choose>
                        <c:when test="${book.free}">
                            <form action="rendre" method="post">
                                <input type="hidden" name="bookId" value="${book.id}">
                                <button type="submit">Emprunter</button>
                            </form>
                        </c:when>
                        <c:otherwise>
                            <form action="rendre" method="post">
                                <input type="hidden" name="bookId" value="${book.id}">
                                <button type="submit">Rendre</button>
                            </form>
                        </c:otherwise>
                    </c:choose>
                </td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
