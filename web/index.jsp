<%@ page import="com.front.database.DatabaseConnection" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="com.front.database.DatabaseGetData" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.front.database.WriteDataFromDatabase" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Fanaberia - Tea Garden</title>
    <link rel="stylesheet" type="text/css" href="/CSS/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="/CSS/style.css" type="text/css">
    <script src="/JS/jquery-3.3.1.min.js"></script>
    <script src="/JS/popper.min.js"></script>
    <script src="/JS/bootstrap.min.js"></script>
  </head>
  <body>
  <%
      if(session.isNew())
      {
        WriteDataFromDatabase data = new WriteDataFromDatabase();
        session.setAttribute("Data",data);
      }

  %>
  <header>
    <nav class="navbar navbar-expand-md navbar-light bg-success">
      <a class="navbar-brand">
        <img src="/IMG/logo.jpg" width="30" height="30" class="d-inline-block align-top" alt="">
        Fanaberia - Tea Garden
      </a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-0 mr-sm-1 mr-md-2 menu-list">
          <li class="nav-item mx-2 active">
            <a href="index.jsp" class="active">Start</a>
          </li>
          <li class="nav-item mx-2">
            <a href="menu.jsp">Menu</a>
          </li>
          <li class="nav-item mx-2">
            <a href="map.jsp">Jak dojechać</a>
          </li>
          <li class="nav-item mx-2">
            <a href="about.jsp">O nas</a>
          </li>
        </ul>
      </div>
    </nav>
  </header>
  <main>
    <div class="container-fluid justify-content-center">
      <h1 class="text-center header-start">
        Witaj na stronie internetowej Fanaberia - Tea Garden
      </h1>
      <p>
        Czynne w tygodniu od godz. 11:00 do 23:30, w piątek i sobotę od 11:00 do 1:00, w niedzielę od 15:00 do 23:30.
        W czasie wakacji, w lipcu i sierpniu w soboty otwieramy od godz. 15:00. Informacje o rezerwacjach i kontakt na dole strony, w stopce.
      </p>
      <p>
        Każdą z oferowanych u nas herbat i kaw można zakupić na wagę.
        Kawy sprzedajemy w ziarnach, jak również mielimy na miejscu, gwarantując świeżość i najwyższą jakość.
        Poza tym oferujemy yerba-matę pakowaną i akcesoria do jej parzenia.
      </p>
    </div>
  </main>
  </body>
</html>
