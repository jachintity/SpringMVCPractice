<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html>
<head>
<title>Save Product</title>
<style type="text/css">@import url("<c:url value="/css/main.css"/>");</style>
</head>
<body>
<div id="global">
    <h4>The product has been saved.</h4>
    <p>
        <h5>Details:</h5>
        Name: ${movieStar.name}<br/>
        Sex: ${movieStar.sex}<br/>
        BirthDate: $${movieStar.birthDate}
    </p>
</div>
</body>
</html>