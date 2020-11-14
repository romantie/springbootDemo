<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<%
    String path = request.getContextPath(); //  path = "/travel"
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; // basePath="http://localhost:8080/travel/"
%>

    <head>

        <title>书籍详情</title>
        <base href="<%=basePath%>">
        <style type="text/css">
            .image{
                width: 175px;
                height: 112px;
            }
        </style>
    </head>
<script>
    layui.use(['rate'], function(){
        var rate = layui.rate;
        //基础效果
        rate.render({
            elem: '#test1'
        })

        //显示文字
        rate.render({
            elem: '#test2'
            ,value: 2 //初始值
            ,text: true //开启文本
        });

        //半星效果
        rate.render({
            elem: '#test3'
            ,value: 2.5 //初始值
            ,half: true //开启半星
        })
        rate.render({
            elem: '#test4'
            ,value: 3.5
            ,half: true
            ,text: true
        })

        //自定义文本
        rate.render({
            elem: '#test5'
            ,value: 3
            ,text: true
            ,setText: function(value){ //自定义文本的回调
                var arrs = {
                    '1': '极差'
                    ,'2': '差'
                    ,'3': '中等'
                    ,'4': '好'
                    ,'5': '极好'
                };
                this.span.text(arrs[value] || ( value + "星"));
            }
        })
        rate.render({
            elem: '#test6'
            ,value: 1.5
            ,half: true
            ,text: true
            ,setText: function(value){
                this.span.text(value);
            }
        })

        //自定义长度
        rate.render({
            elem: '#test7'
            ,length: 3
        });
        rate.render({
            elem: '#test8'
            ,length: 10
            ,value: 8 //初始值
        });

        //只读
        rate.render({
            elem: '#test9'
            ,value: 4
            ,readonly: true
        });

        //主题色
        rate.render({
            elem: '#test10'
            ,value: 3
            ,theme: '#FF8000' //自定义主题色
        });
        rate.render({
            elem: '#test11'
            ,value: 3
            ,theme: '#009688'
        });

        rate.render({
            elem: '#test12'
            ,value: 2.5
            ,half: true
            ,theme: '#1E9FFF'
        })
        rate.render({
            elem: '#test13'
            ,value: 2.5
            ,half: true
            ,theme: '#2F4056'
        });
        rate.render({
            elem: '#test14'
            ,value: 2.5
            ,half: true
            ,theme: '#FE0000'
        })
    });
</script>

    <body>
    <fieldset class="layui-elem-field layui-field-title" style="margin-top: 30px;">
        <legend>水平导航菜单</legend>
    </fieldset>

    <ul class="layui-nav">
        <li class="layui-nav-item"><a href="http://www.dangdang.com/?_utm_sem_id=16532272&_ddclickunion=422-kw-1-PC-%C6%B7%C5%C6%B4%CA-%CB%D1%CB%F7%B4%CA-5%D4%C2_%C6%B7%C5%C6%B4%CA-%CB%D1%CB%F7%B4%CA-%C6%E4%CB%FB_%B5%B1%B5%B1%CD%F8%D6%B7|ad_type=0|sys_id=1">浏览商城</a></li>
        <li class="layui-nav-item layui-this">
            <a href="javascript:;">书籍信息</a>
        </li>
        <li class="layui-nav-item"><a href="/LmkBook/add">添加书籍</a></li>
    </ul>



    <!--
    <table class="layui-hide" id="test" lay-filter="test"></table>

    <script type="text/html" id="toolbarDemo">
        <div class="layui-btn-container">
            <button class="layui-btn layui-btn-sm" lay-event="getCheckData">获取选中行数据</button>
            <button class="layui-btn layui-btn-sm" lay-event="getCheckLength">获取选中数目</button>
            <button class="layui-btn layui-btn-sm" lay-event="isAll">验证是否全选</button>
        </div>
    </script>
    <script type="text/html" id="barDemo">
        <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
        <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
    </script>-->
    <!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
        <div align="left">
            <table border="5" class="layui-table">
                <tr>
                    <td>书籍封面</td>
                    <td>书籍编号</td>
                    <td>书籍名称</td>
                    <td>书籍价格</td>
                    <td>书籍星级</td>

                </tr>
                <c:forEach items="${book}" var="book1">
                    <tr>
                        <td><img class="image" src="${book1.file}"/></td>
                        <td><c:out value="${book1.id}"/></td>
                        <td><c:out value="${book1.name}"/></td>
                        <td><c:out value="${book1.price}"/></td>

                        <td>
                            <a href="LmkBook/detailesForJsp?id=${book1.id}" class="layui-btn">详细信息</a>
                        </td>

                    </tr>
                </c:forEach>
            </table>
        </div>

        <table class="layui-hide" id="test" lay-filter="test"></table>


    </body>
</html>