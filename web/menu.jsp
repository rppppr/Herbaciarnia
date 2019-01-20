<%@ page import="com.front.database.DatabaseGetData" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.front.items.Categories" %>
<%@ page import="com.front.database.WriteDataFromDatabase" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Menu</title>
    <link rel="stylesheet" type="text/css" href="CSS/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="/CSS/style.css" type="text/css">
    <script src="/JS/jquery-3.3.1.min.js"></script>
    <script src="/JS/popper.min.js"></script>
    <script src="/JS/bootstrap.min.js"></script>
</head>
<body>
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
                    <li class="nav-item mx-2">
                        <a href="index.jsp">Start</a>
                    </li>
                    <li class="nav-item mx-2 active">
                        <a href="menu.jsp" class="active">Menu</a>
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
    <main id="Content">
        <section id="Tea">
            <header class="section-header my-3 product-header">
                <h2>
                    W naszym menu znajdziesz następujące produkty:
                </h2>
            </header>
            <div class="container-fluid">
                <div class="row align-content-center justify-content-center">
                    <%
                        WriteDataFromDatabase data = (WriteDataFromDatabase) session.getAttribute("Data");
                        ArrayList products = data.WriteCategories();
                        for(int i = 0 ; i< products.size() ; i++)
                        {
                            out.print(products.get(i));
                        }
                    %>
                </div>
            </div>
        </section>
    </main>
    <footer>

    </footer>
</body>
</html>
