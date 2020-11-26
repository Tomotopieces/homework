<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>登录</title>
    <link rel="stylesheet" href="css/style.css">
</head>

<body>
    <div id="mainContent">
        <h1>登录</h1>
        <form action="login" method="post">
            <div>
                账号:
                <input type="text" name="account">
            </div>
            <div>
                密码:
                <input type="password" name="password">
            </div>
            <div>
                <input type="submit" value="登录">
            </div>
        </form>
    </div>
</body>

</html>