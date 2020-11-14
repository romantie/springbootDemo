<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<%
    String path = request.getContextPath(); //  path = "/travel"
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; // basePath="http://localhost:8080/travel/"
%>
    <head>
        <link rel="stylesheet" href="/layui/css/layui.css">
        <title>书籍详情</title>
        <base href="<%=basePath%>">
        <style type="text/css">
            .image{
                width: 176px;
                height: 112px;
            }
        </style>
    </head>
    <body>
    <fieldset class="layui-elem-field layui-field-title" style="margin-top: 30px;">
        <legend>水平导航菜单</legend>
    </fieldset>

    <ul class="layui-nav">
        <li class="layui-nav-item"><a href="http://www.dangdang.com/?_utm_sem_id=16532272&_ddclickunion=422-kw-1-PC-%C6%B7%C5%C6%B4%CA-%CB%D1%CB%F7%B4%CA-5%D4%C2_%C6%B7%C5%C6%B4%CA-%CB%D1%CB%F7%B4%CA-%C6%E4%CB%FB_%B5%B1%B5%B1%CD%F8%D6%B7|ad_type=0|sys_id=1">浏览商城</a></li>
        <li class="layui-nav-item layui-this">
            <a href="LmkBook/detailesBookForJsp">书籍信息</a>
        </li>
        <li class="layui-nav-item"><a href="/LmkBook/add">添加书籍</a></li>
    </ul>
        <div align="left">
            <table border="1" class="layui-table">
                <tr>
                    <td>标签</td>
                    <td>值</td>
                </tr>
                <tr>
                    <td>书籍编号</td>
                    <td>
                        <c:out value="${book.id}"></c:out>
                    </td>
                </tr>
                <tr>
                    <td>书籍名称</td>
                    <td><c:out value="${book.name}"></c:out></td>
                </tr>
                <tr>
                    <td>书籍价格</td>
                    <td><c:out value="${book.price}"></c:out></td>
                </tr>
                <tr>
                    <td>书籍封面</td>
                    <td><img class="image" src="${book.file}"/></td>
                </tr>
            </table>
        </div>
    </body>
</html>