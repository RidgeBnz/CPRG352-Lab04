<%-- 
    Document   : viewnote
    Created on : Jun 8, 2021, 5:54:41 PM
    Author     : 840288
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Note-Simple Note Keeper</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        <p>Title: ${note.title}</p>
        <p>Contents: <br>${note.contents}</p>
        <a href="note?edit">Edit</a>
    </body>
</html>
