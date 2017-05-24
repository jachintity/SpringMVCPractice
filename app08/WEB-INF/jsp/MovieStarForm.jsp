<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html>
<head>
<title>Add MovieStar Form</title>
<style type="text/css">@import url("<c:url value="/css/main.css"/>");</style>
</head>
<body>

<div id="global">
<form:form commandName="movieStar" action="movieStar_save" method="post">
    <fieldset>
        <legend>Add a movie star</legend>
        <p class="errorLine">
            <form:errors path="name" cssClass="error"/>
        </p>
        <p>
            <label for="name">Name: </label>
            <form:input id="name" path="name" tabindex="1"/>
        </p>
        <p>
            <label for="sex">Sex: </label>
            <form:input id="sex" path="sex" tabindex="2"/>
        </p>
        <p class="errorLine">
            <form:errors path="birthDate" cssClass="error"/>
        </p>
        <p>
            <label for="birthDate">Birth Date: </label>
            <form:input id="birthDate" path="birthDate" tabindex="4"/>
        </p>
        <p id="buttons">
            <input id="reset" type="reset" tabindex="5">
            <input id="submit" type="submit" tabindex="6" 
                value="Add MovieStar">
        </p>
    </fieldset>
</form:form>
</div>
</body>
</html>
