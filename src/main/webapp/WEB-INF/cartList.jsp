<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/css.css">	
<link rel="stylesheet" href="css/style.css">

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
	$(function (){		//延迟加载函数
	
	
	});
</script>
<title>title</title>
</head>
<body>
	
		 <c:forEach items="${list_cart}" var="cart">
		     <tr>
		       <td>商品名称:${cart.sku_mch}</td>&nbsp;&nbsp;&nbsp;&nbsp;
		       <td>
		       		颜色：<span style='color:#ccc'>白色</span>&nbsp;&nbsp;&nbsp;&nbsp;
		       		尺码：<span style='color:#ccc'>L</span>&nbsp;&nbsp;&nbsp;&nbsp;
		       </td>
		       <td>合计:￥${cart.hj }</td>&nbsp;&nbsp;&nbsp;&nbsp;
		       <td>数量:<input type="text" name="min" value="${cart.tjshl }" style="width:50px;text-align:center"></td>&nbsp;&nbsp;&nbsp;&nbsp;
		     </tr>
		     <br><br><br>
		    </c:forEach>
</body>
</html>
