<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html>
<head>
<title>View MovieStar</title>
<style type="text/css">@import url("<c:url value="/css/main.css"/>");</style>
</head>
<body>
<div id="global">
    <h4>${message}</h4>
    <p>
        <h5>Details:</h5>
        Name: ${movieStar.name}<br/>
        Sex: ${movieStar.sex}<br/>
        BirthDate: $${movieStar.birthDate}
    </p>
</div>
</body>
</html>