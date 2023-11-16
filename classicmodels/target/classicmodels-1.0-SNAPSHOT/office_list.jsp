<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Office Listings</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div class="row bg-primary">
        <h2>Classic Model Offices ::</h2>
        <span>
            <form action="search-office" method="post">
                <input type="text" name="find">
                <input type="submit" value="find">
            </form>
        </span>
    </div>
    <div class="row">
        <table>
            <tr>
                <th>Office Code</th>
                <th>City</th>
                <th>Country</th>
                <th>Phone</th>
            </tr>
            <c:forEach items="${offices}" var="office">
                <tr>
                    <td>${office.officeCode}</td>
                    <td>${office.city}</td>
                    <td>${office.country}</td>
                    <td>${office.phone}</td>
                    <td><a href="office-update?officeCode=${office.officeCode}">update</a></td>
                    <td><a href="office-delete?officeCode=${office.officeCode}">delete</a></td>
                </tr>
            </c:forEach>
        </table>
    </div>
    <div class="row">
        <a href="insert-office">Insert</a>
    </div>
</div>
</body>
</html>
