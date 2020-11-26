<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ page import="io.tomoto.model.entity.User" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>个人信息</title>
    <link rel="stylesheet" href="css/style.css">
</head>

<body>
    <div id="mainContent">
        <%
            User user = (User) request.getAttribute("user");
        %>
        <br>
        <h1>个人信息界面</h1>
        <div>
            ID: 
            ${user.userId}
        </div>
        <div>
            账号:
            ${user.userAccount}
        </div>
        <div>
            自我介绍:
            ${user.userIntroduction}
        </div>
        <br>
        <hr>
        <br>
        <h2>信息修改</h2>
        <form action="modify" method="post">
            <div>旧密码: <input name="oldPassword" type="password"></div>
            <div>新密码: <input name="newPassword" type="password"></div>
            <div>确认新密码: <input name="rePassword" type="password"></div>
            <br> <hr> <br>
            <div>自我介绍: <textarea style="vertical-align: top;" name="introduction" id="introduction" cols="30" rows="3"></textarea></div>
            <br> <hr>
            <input type="submit" value="确认">
        </form>
    </div>
</body>

</html>