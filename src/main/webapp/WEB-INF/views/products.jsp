<%@ page language="java" contentType="text/html; charset=US-ASCII"
         pageEncoding="US-ASCII" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
    <title>Products</title>
    <link href="bootstrap/css/bootstrap.css" rel="stylesheet">
</head>
<body>
<div class="hero-unit">
    <h1>Buy a product</h1>
</div>

<%--<%--%>
<%--//dit is code om resultaat te kunnen geven en is dus geen voorbeeldcode!--%>
<%--Object products = request.getAttribute("products"); --%>
<%--if (products instanceof java.util.List) {--%>
<%--out.println(((java.util.List<?>)products).size() + " producten gevonden!");--%>
<%--} else {--%>
<%--out.println("Implementeer de servlet...");--%>
<%--}--%>
<%--%>--%>

<div class="span12">

    <c:forEach var="product" items="${products}">
        <div class="span3 thumbnail">
            <img src="img/${product.getImage()}">

            <h3>${product.getName()}</h3>

            <p>Price: EUR ${product.getPrice()}</p>
        </div>
    </c:forEach>

</div>

</body>
</html>