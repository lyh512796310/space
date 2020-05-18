<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="<%=request.getContextPath()%>/layui/layui.js" charset="utf-8"></script>
<link rel="stylesheet" href="<%=request.getContextPath()%>/layui/css/layui.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>IP查询</title>
</head>
<body>
	
<form class="layui-form" action="login" method="post">
  <div class="layui-form-item">
    <label class="layui-form-label">请输入ip地址</label>
    <div class="layui-input-block">
      <input type="text" name="ip" required  lay-verify="required" placeholder="例如：255.255.0.1" autocomplete="off" class="layui-input" width="100px">
    </div>
  </div>
  <div class="layui-form-item">
    <div class="layui-input-block">
      <button class="layui-btn" lay-submit lay-filter="formDemo">立即查询</button>
    </div>
  </div>
  </form>
</body>
</html>