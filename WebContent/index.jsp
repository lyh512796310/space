<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="<%=request.getContextPath()%>/layui/layui.js" charset="utf-8"></script>
<link rel="stylesheet" href="<%=request.getContextPath()%>/layui/css/layui.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>标题</title>
</head>
<body>
     <table class="layui-table">
  <colgroup>
    <col width="150">
    <col width="200">
    <col>
  </colgroup>
  <thead>
    <tr>
      <th>结果</th>
    </tr> 
  </thead>
  <tbody>
    <tr>
      <td> ${IPLocation }</td>
    </tr>
  </tbody>
</table>
</body>
</html>