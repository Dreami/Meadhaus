<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<html>
<head>
    <title>Login Page</title>
</head>
<body>
    <h1>Select your preferred type of mead: </h1>
    <form name="beer" action="beer.do">
        <select name="color">
            <option value="pale">Pale</option>
            <option value="dark">Dark</option>
            <option value="light">Light</option>
        </select>
        <input type="submit" name="submit" value="submit"/>
    </form>
</body>
</html>