<%-- 
    Document   : editnote
    Created on : Jun 8, 2021, 5:54:52 PM
    Author     : 840288
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Note-Simple Note Keeper</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>Edit Note</h2>
        <form method="post" action="note">
            <label>Title:</label> <input type="textarea" name="titleInput" value="${note.title}">
            <br>
            <label>Contents:</label> 
            <textarea name="contentsInput" rows="5" cols="20">${note.contents}</textarea>
            <br>
            <a href="note"><button>save</button</a>
        </form>
    </body>
</html>
