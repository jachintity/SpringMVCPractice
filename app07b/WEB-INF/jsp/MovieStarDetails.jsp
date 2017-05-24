<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html>
<head>
<title>Save MovieStar</title>
<style type="text/css">@import url("<c:url value="/css/main.css"/>");</style>
</head>
<body>
<div id="global">
    <h4>The movie star details have been saved.</h4>
    <p>
        <h5>Details:</h5>
        Name: ${movieStar.name}<br/>
        Date of Birth: ${movieStar.birthDate}
    </p>
</div>
</body>
</html>