<%--
  Created by IntelliJ IDEA.
  User: SJY
  Date: 2020/11/9
  Time: 19:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加信息</title>

</head>
<body>

<ul class="layui-nav">
    <li class="layui-nav-item"><a href="http://www.dangdang.com/?_utm_sem_id=16532272&_ddclickunion=422-kw-1-PC-%C6%B7%C5%C6%B4%CA-%CB%D1%CB%F7%B4%CA-5%D4%C2_%C6%B7%C5%C6%B4%CA-%CB%D1%CB%F7%B4%CA-%C6%E4%CB%FB_%B5%B1%B5%B1%CD%F8%D6%B7|ad_type=0|sys_id=1">浏览商城</a></li>
    <li class="layui-nav-item"><a href="detailesBookForJsp">书籍信息</a></li>
    <li class="layui-nav-item"><a href="add">添加书籍</a></li>
</ul>
<div style="margin: 20px 0;"></div>
<form id="insertForm" action="/LmkBook/insert" method="post" enctype="multipart/form-data">
    <table class="layui-table">
        <colgroup>
            <col width="100">
            <col width="500">
            <col width="500">
            <col>
        </colgroup>
        <tr>
            <td>id编号：</td>
            <td><input id="id" name="id"></td>
        </tr>
        <tr>
            <td>书籍名称：</td>
            <td><input id="name" name="name"></td>
        </tr>
        <tr>
            <td>书籍价格:</td>
            <td><input id="price" name="price"></td>
        </tr>
        <tr>
            <td>上传文件:</td>
            <td>
                <input type="file" name="photo" value="选择上传的图片">
            </td>
        </tr>
        <tr>
            <td></td>
            <td align="right"><input id="submit" type="submit" class="layui-btn" value="提交" /></td>
        </tr>
    </table>
</form>
</body>
</html>
