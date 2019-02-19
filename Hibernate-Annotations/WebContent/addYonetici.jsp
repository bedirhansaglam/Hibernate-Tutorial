<%@ page language="java" contentType="text/html; charset=ISO-8859-9"
    pageEncoding="ISO-8859-9"%>
<%@ page import = "java.io.*,java.util.*, javax.servlet.*" %>
<%@ page import = "java.io.*,java.util.*" %>
<%@ page import = "javax.servlet.*,java.text.*" %>
<%
request.setCharacterEncoding("ISO-8859-9");
%>
    <!DOCTYPE html>
<html>
<head>
<link href="css/Form.css" rel="stylesheet" type="text/css">
</head>
<body>
<jsp:include page="leftMenu.jsp"></jsp:include>
<%if(session.getAttribute("newUser")=="success") { %>
<div class="alert-success">
  <span class="closebtn" onclick="this.parentElement.style.display='none';">&times;</span> 
Yeni Y�netici Ba�ar�yla Eklendi
</div>
<%}else if(session.getAttribute("newUser")=="unsuccess") { %>
<div class="alert-unsuccess">
 <span class="closebtn" onclick="this.parentElement.style.display='none';">&times;</span> 
Y�netici Eklenemedi
</div>
<%} %>
<div id="main">
<div class="container">
  <form action="addYoneticiControl.jsp" method="post">
    <div class="row">
      <div class="col-25">
        <label for="fname">�sim</label>
      </div>
      <div class="col-75">
        <input type="text" id="fname" name="ad" placeholder="Y�netici Ad�">
      </div>
    </div>
    <div class="row">
      <div class="col-25">
        <label for="lname">Soyisim</label>
      </div>
      <div class="col-75">
        <input type="text" id="lname" name="soyad" placeholder="Y�netici Soyad�">
      </div>
    </div>
    <div class="row">
      <div class="col-25">
        <label for="email">E-mail</label>
      </div>
      <div class="col-75">
		<input type="text" id="email" name="email" placeholder="Y�netici E mail">
      </div>
    </div>
    <div class="row">
      <div class="col-25">
        <label for="pword">�ifre</label>
      </div>
      <div class="col-75">
        <input type="password" id="pword" name="sifre" placeholder="Y�netici �ifresi">
      </div>
    </div>
    <div class="row">
      <input type="submit" value="Ekle">
    </div>
  </form>
</div>
</div>
</body>
</html>