<%--
  Created by IntelliJ IDEA.
  User: SJY
  Date: 2020/11/9
  Time: 20:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>批量文件上传</title>
</head>
<body>
<form action="./multipart1" enctype="multipart/form-data" method="post">
    <input type="file" name="photo" value="请选择上传的图片"/><p>
    <input type="file" name="photo" value="请选择上传的图片"/><p>
    <input type="file" name="photo" value="请选择上传的图片"/><p>
    <input type="submit" value="提交"/>
</form>

</body>
</html>
