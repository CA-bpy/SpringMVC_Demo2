<%--Send request--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SpringMVC Demo2</title>
</head>
<body>
    <p>SpringMVC_Demo2 ReceiveParam</p>
    <p><a href="some.do">==用户发起some.do的请求==</a></p>
    <br/>
    <p>逐个提交参数给Controller</p>
    <form action="receiveproperty.do" method="post">
        姓名：<input type="text" name="name"> <br/>
        年龄：<input type="text" name="age"> <br/>
        <input type="submit" value="提交参数">
    </form>
    <br/>
    <p>通过对象提交参数给Controller</p>
    <form action="receiveobject.do" method="post">
        学号：<input type="text" name="num"> <br/>
        姓名：<input type="text" name="name"> <br/>
        年龄：<input type="text" name="age"> <br/>
        <input type="submit" value="提交参数">
    </form>
</body>
</html>
