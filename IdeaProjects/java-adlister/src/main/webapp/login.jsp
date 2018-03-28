<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    if (request.getMethod().equalsIgnoreCase("post")) {
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        if ((name.equals("admin") && (password.equals("password")))) {
            response.sendRedirect("/profile.jsp");
        }
    }
%>

<html>
<head>
    <title>LogIn</title>
    <jsp:include page="partials/head.jsp"/>
</head>
<body>
<jsp:include page="partials/navbar.jsp"/>
<div class="parallax"></div>

<div class="login">
    <form action="login.jsp" method="post">
        Please enter username and password.<br>
        Username:<input type="text" name="name" /><br>
        Password:<input type="password" name="password" /><br>
        <input type="submit" value="Submit">
    </form>
</div>
<div class="parallax"></div>

</body>
</html>