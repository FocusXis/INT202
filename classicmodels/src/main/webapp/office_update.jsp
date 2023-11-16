<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div class="row bg-primary">
        <h2>Update ::</h2>
    </div>
    <div class="row">
        <form method="post" action="office-update">
            <div class="form-group">
                <label for="city">City:</label>
                <input type="hidden" name="officeCode" value="${selected.officeCode}">
                <input type="text" class="form-control" id="city" name="city" value="${selected.city}">
            </div>
            <div class="form-group">
                <label for="phone">Phone:</label>
                <input type="text" class="form-control" id="phone" name="phone" value="${selected.phone}">
            </div>
            <div class="form-group">
                <label for="addressLine1">addressLine1:</label>
                <input type="text" class="form-control" id="addressLine1" name="addressLine1" value="${selected.addressLine1}">
            </div>
            <div class="form-group">
                <label for="addressLine2">addressLine2:</label>
                <input type="text" class="form-control" id="addressLine2" name="addressLine2" value="${selected.addressLine2}">
            </div>
            <div class="form-group">
                <label for="state">state:</label>
                <input type="text" class="form-control" id="state" name="state" value="${selected.state}">
            </div>
            <div class="form-group">
                <label for="country">country:</label>
                <input type="text" class="form-control" id="country" name="country" value="${selected.country}">
            </div>
            <div class="form-group">
                <label for="postalCode">postalCode:</label>
                <input type="text" class="form-control" id="postalCode" name="postalCode" value="${selected.postalCode}">
            </div>
            <div class="form-group">
                <label for="territory">territory:</label>
                <input type="text" class="form-control" id="territory" name="territory" value="${selected.territory}">
            </div>
            <input type="submit">
            <a href="office-list">Back</a>
        </form>
    </div>
</div>
</body>
</html>
