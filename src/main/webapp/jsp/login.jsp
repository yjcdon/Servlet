<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.io.PrintWriter" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<%
    String name = (String) request.getSession().getAttribute("name");
    int age = (Integer) request.getSession().getAttribute("age");
    String uname = (String) request.getAttribute("uname");
    int uage = (Integer) request.getAttribute("uage");
    PrintWriter writer = response.getWriter();
    writer.write("name:" + name + " age:" + age);
    writer.write("\nuname:" + uname + " uage:" + uage);
%>
<form action="request" method="post">
    用户名:<input type="text" name="uname" placeholder="请输入用户名"/><br/>
    密码: <input type="password" name="upsw" placeholder="请输入密码"/><br/>
    <button>登录</button>
</form>

</body>
</html>
