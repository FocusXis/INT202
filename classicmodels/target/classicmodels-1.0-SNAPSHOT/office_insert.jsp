<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Insert</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div class="row bg-primary">
        <h2>Insert ::</h2>
    </div>
    <div class="row">
        <form method="post" action="insert-office">
            <div class="form-group">
                <label for="officeCode">officeCode:</label>
                <input type="text" class="form-control" id="officeCode" name="officeCode">
            </div>
            <div class="form-group">
                <label for="city">City:</label>
                <input type="text" class="form-control" id="city" name="city">
            </div>
            <div class="form-group">
                <label for="phone">Phone:</label>
                <input type="text" class="form-control" id="phone" name="phone" >
            </div>
            <div class="form-group">
                <label for="addressLine1">addressLine1:</label>
                <input type="text" class="form-control" id="addressLine1" name="addressLine1">
            </div>
            <div class="form-group">
                <label for="phone">country:</label>
                <input type="text" class="form-control" id="country" name="country" >
            </div>
            <div class="form-group">
                <label for="city">postalCode:</label>
                <input type="text" class="form-control" id="postalCode" name="postalCode">
            </div>
            <div class="form-group">
                <label for="territory">territory:</label>
                <input type="text" class="form-control" id="territory" name="territory" >
            </div>
            <input type="submit">
            <a href="office-list">Back</a>
        </form>
    </div>
</div>
</body>
</html>
