<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Create User</title>
</head>
<body>
    <h2>Create User</h2>
    <form action="createUser" method="post">
        Email: <input type="text" name="email" /><br />
        Username: <input type="text" name="username" /><br />
        Password: <input type="password" name="password" /><br />
        <input type="submit" value="Create User" />
    </form>
</body>
</html>
