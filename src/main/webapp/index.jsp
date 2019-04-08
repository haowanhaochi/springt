<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>起始页</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/4.1.0/css/bootstrap.min.css">
  <script src="https://cdn.staticfile.org/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://cdn.staticfile.org/popper.js/1.12.5/umd/popper.min.js"></script>
  <script src="https://cdn.staticfile.org/twitter-bootstrap/4.1.0/js/bootstrap.min.js"></script>
	<style type="text/css">
		.container{
			width:400px;
		}
	</style>

</head>
<body>

<div class="container">
  <h2>插入数据</h2>
  <form action="http://localhost:8080/springt/insert.action">
    <div class="form-group">
      <label for="dno">dno:</label>
      <input type="number" class="form-control" name="dno">
    </div>
    <div class="form-group">
      <label for="dname">dname:</label>
      <input type="text" class="form-control" name="dname">
    </div>
    <div class="form-group">
      <label for="dloc">dloc:</label>
      <input type="text" class="form-control" name="dloc">
    </div>
    <div class="form-group">
      <input type="submit" class="form-control" value="插入">
    </div>
  </form>
</div>
<hr>
<div class="container">
  <h2>查询数据</h2>
  <form action="http://localhost:8080/springt/query.action">
    <div class="form-group">
      <label for="dno">部门编号:</label>
      <input type="number" class="form-control" name="dno">
    </div>
    <div class="form-group">
      <input type="submit" class="form-control" value="查询">
    </div>
  </form>
<div class="container">
  <h2>查询结果</h2>
  <table class="table table-hover">
    <thead>
      <tr>
        <th>部门编号</th>
        <th>部门名称</th>
        <th>部门地址</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>${dno }</td>
        <td>${dname }</td>
        <td>${dloc }</td>
      </tr>
    </tbody>
  </table>
</div>
</div>



</body>
</html>