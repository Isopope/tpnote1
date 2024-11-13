<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Ajouter un Livre</title>
        <link rel="stylesheet" href="styles.css">
    </head>

<body>
    <h1>Ajouter un nouveau livre</h1>
    <form action="AddLivre.jsp" method="post">
        <label for="title">Titre :</label>
        <input type="text" id="title" name="title" required>
        <br><br>

        <label for="author">Auteur :</label>
        <input type="text" id="author" name="author" required>
        <br><br>

        <label for="free">Disponible :</label>
        <select id="free" name="free">
            <option value="true">Oui</option>
            <option value="false">Non</option>
        </select>
        <br><br>

        <input type="submit" value="Ajouter le livre">
    </form>
</body>
</html>
