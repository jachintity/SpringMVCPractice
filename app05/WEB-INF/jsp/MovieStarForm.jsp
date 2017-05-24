<!DOCTYPE HTML>
<html>
<head>
<title>Add Movie Star Form</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>

<div id="global">
<form action="movieStar_save" method="post">
    <fieldset>
        <legend>Add a movie star</legend>
        <p>
            <label for="name">Movie Star Name: </label>
            <input type="text" id="name" name="name" 
                tabindex="1">
        </p>
        <p>
            <label for="sex">Sex: </label>
            <input type="text" id="sex" name="sex" 
                tabindex="2">
        </p>
        <p>
            <label for="description">Description: </label>
            <input type="text" id="description" 
                name="description" tabindex="3">
        </p>        
        <p id="buttons">
            <input id="reset" type="reset" tabindex="4">
            <input id="submit" type="submit" tabindex="5" 
                value="Add Movie Star">
        </p>
    </fieldset>
</form>
</div>
</body>
</html>
