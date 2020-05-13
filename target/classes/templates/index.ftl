<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<table border="1" align="center" width="50%">
<tr>
    <th>Name</th>
    <th>password</th>

</tr>
    <#list list as user>
    <tr>
        <td>${user.uname}</td>
        <td>${user.password}</td>
    </tr>
    </#list>
</table>

</body>
</html>