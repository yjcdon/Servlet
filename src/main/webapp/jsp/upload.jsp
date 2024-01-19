<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>上传文件</title>
</head>
<body>
<%--
        form的method设置为post,
        enctype="multipart/form-data"
        action表示文件提交的地址
        name属性一定要有,否则后台无法接受数据
--%>
<%--现在这里是前台的实现--%>
<form method="post" action="file1" enctype="multipart/form-data">
    姓名:<input type="text" name="name"/><br/>
    文件:<input type="file" name="myfile"/><br/>
    <%--    button默认的type是submit    --%>
    <button>上传</button>
</form>

<br/>
</body>
</html>