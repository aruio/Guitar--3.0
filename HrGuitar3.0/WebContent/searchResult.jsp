<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Result</title>
</head>
<body>
<h2>你想要的Guitar</h2>
<style>
body{text-align: center}
</style>
<table  style="width:100%"  >
		<thead>
<tr bgcolor="#4F81BD"style="color: #fff;height:60px">
	<td align="center">SerialNumber</td>
	<td align="center">PRICE</td>
	<td align="center">BUILDER</td>
	<td align="center">MODEL</td>
	<td align="center">TYPE</td>
	<td align="center">BACKWOOD</td>
	<td align="center">TOPWOOD</td>
</tr>
		</thead>
		
		
		<tbody>
		<c:forEach items="${requestScope.list}" var="guitar">	
		 <tr bgcolor="${status.index%2 == 0?'#D0D8E8':'#E9EDF4'}" style="height:60px" >

		 <td align="center">${guitar.serialNumber}</td>
		 <td align="center">${guitar.price}</td>
		 <td align="center">${guitar.spec.builder }</td>
		 <td align="center">${guitar.spec.model}</td>
		 <td align="center">${guitar.spec.type}</td>
		 <td align="center">${guitar.spec.backWood}</td>
		<td align="center">${guitar.spec.topWood}</td>
		 </tr>
		 
			</c:forEach>	
		
	</tbody>
</table>

<a href="SearchGuitar.jsp" style="display:inline-block;margin-top:20px;">继续查询 </a>
</body>
</html>