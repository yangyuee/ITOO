<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<script type="text/javascript" src="http://222.222.124.77:9001/jquery.min.js"></script>
<script type="text/javascript" src="http://222.222.124.77:9001/jquery.easyui.min.js"></script>
<%--<script src="${pageContext.request.contextPath}/Script/sendcode.js"></script>--%>
</script>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<base href="<%=basePath%>">
</head>

<script type="text/javascript">

function findById()
{
$.ajax({
type:"POST",
url:'<%=basePath%>'+"${bean}/findById/id/0342a6bfe85e490422c4c6"
})
}

</script>
<body class="easyui-layout" fit="true">

<div>
    <input id="findById" type="button" value="查找测试" onclick="findById()">
</div>
</body>
</html>