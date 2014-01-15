<%--
  Created by IntelliJ IDEA.
  User: shenjie
  Date: 14-1-2
  Time: 上午10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title></title>
</head>
<body>

欢迎注册，请在这里输入必要的注册信息：
<s:form action="loginApp" method="post">
    <s:textfield name="user.username" label="用户名"></s:textfield>
    <s:password name="user.password" label="密码"></s:password>
    <s:submit label="提交"></s:submit>
</s:form>

</body>
</html>
