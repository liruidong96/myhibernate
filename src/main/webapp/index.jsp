<%@page language="java" pageEncoding="utf-8" %>
<html>
<body>
<h2>Hello World!</h2>
<form action="/myhibernate/findOneUserInfo.do" method="post">
  <div>
    用户编码：
    <input type="text" id="userId" name="userId"/>
    <input type="submit" value="提交"/>
  </div>
</form>
</body>
</html>
