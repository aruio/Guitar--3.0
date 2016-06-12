<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2 align=center>添加Guitar</h2>
<form method="post" action="AddGuitarServlet" >
<p>
序       号<input type="text" name="serialNumber" id="serialNumber" />
</p><p>
价        格<input type="text" name="price" id="price" />元
</p><p>
制造商<input type="text" name="builder" id="builder" />
</p><p>
型        号<input type="text" name="model" id="model" />
</p><p>
类        型<input type="text" name="type" id="type" />
</p><p>
背面木料<input typr="text" name="backWood" id="backWood"/>
</p><p>
正面木料<input type="text" name="topWood" id="topWood"/>
</p>
<input type="submit" value="添  加" />
</form>
</body>
</html>