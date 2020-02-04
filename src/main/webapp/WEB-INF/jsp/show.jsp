<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>查询结果</title>
</head>
<body>
<table align="center" border="1" style="border-collapse: collapse; border-color: red; text-align: center;" cellpadding="15"  >
    <tr>
        <td>id</td>
        <td>姓名</td>
        <td>密码</td>
        <td>类别</td>
        <td>操作</td>
    </tr>
    <c:forEach var="row" items="${data}">
        <tr>
            <td>${row.id}</td>
            <td>${row.name}</td>
            <td>${row.password}</td>
            <td>${row.userType.typeName}</td>
            <td><a href="javascript:deleteUser(${row.id})">删除</a> </td>
        </tr>
    </c:forEach>
</table>
<div style="text-align: center; margin-top: 10px">
    <form action="add" autocomplete="off" method="post">
        <table align="center" border="1" style="border-collapse: collapse">
            <tr>
                <td>用户名</td>
                <td><input type="text" name="name" autocomplete="off"> </td>
            </tr>
            <tr>
                <td>密码</td>
                <td><input type="password" autocomplete="off" name="password"> </td>
            </tr>
            <tr>
                <td>类别</td>
                <td><input type="number" autocomplete="off" name="type"> </td>
            </tr>
            <tr>
                <td colspan="2" align="center"><button type="submit">添加</button></td>
            </tr>
        </table>
    </form>

</div>

<script>
    function deleteUser(id) {
        if(confirm("真的要删除吗？")){
            window.location.href = "delete?id=" + id;
        }
    }
</script>
</body>
</html>