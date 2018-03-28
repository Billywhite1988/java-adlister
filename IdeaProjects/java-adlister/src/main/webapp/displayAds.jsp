<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 3/28/18
  Time: 1:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Viewing Ad" />
    </jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp" />
<div class="container">
    <br>
    <hr>
    <div class="col-lg-4 welcome">
        <img src="http://lorempixel.com/g/325/400" class="imgedits">
        <br>
        <button type="button" class="btn btn-secondary disabled">Edit Ad</button>
    </div>
    <div class="col-lg-8 adsHere">
        <h2 class="mt=5"><e:forHtmlContent value="${ads[0].title}"/></h2>
        <p><e:forHtmlContent value="${ads[0].description}"/></p>
        <c:forEach var="cat" items="${categories}">
            <c:if test="${cat.id == ads[0].catId}">
                <p><e:forHtmlContent value="${cat.name}"/></p>
            </c:if>
        </c:forEach>
    </div>
</div>
</body>
</html>