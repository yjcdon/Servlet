<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>下载文件</title>
</head>
<body>

<%--
    超链接下载
        如果可识别,则显示内容;如果不可识别,则下载文件.
--%>

<%--浏览器可以识别的资源--%>
<a href="/start/sources/text.txt">文本文件</a>
<a href="/start/sources/image.jpg" download="nicejob.jpg">图片文件</a>
<%--浏览器不可以识别的资源--%>
<a href="/start/sources/text.zip">压缩文件</a>

<br/>
</body>
</html>