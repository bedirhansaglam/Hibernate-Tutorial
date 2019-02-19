<%@ page language="java" contentType="text/html; charset=ISO-8859-9"
    pageEncoding="ISO-8859-9"%>
<%@ page import = "java.io.*,java.util.*, javax.servlet.*" %>
<%@ page import = "java.io.*,java.util.*" %>
<%@ page import = "javax.servlet.*,java.text.*" %>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.bedirhansaglam.yazilim.object.Yonetici" %>
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
<jsp:useBean id="yoneticiDao" class="com.bedirhansaglam.yazilim.dao.YoneticiDao"></jsp:useBean>
<jsp:useBean id="yonetici" class="com.bedirhansaglam.yazilim.object.Yonetici"></jsp:useBean>
<% yonetici=yoneticiDao.getYonetici(Integer.parseInt(request.getParameter("id")));%>
<div id="main">
<div class="container">
  <form action="updateYoneticiControl.jsp?id=<%=Integer.parseInt(request.getParameter("id"))%>" method="post">
    <div class="row">
      <div class="col-25">
        <label for="fname">G�ncellenecek �sim</label>
      </div>
      <div class="col-75">
        <input type="text" id="fname" name="ad" value='<%=yonetici.getAd()%>' placeholder="Y�netici Ad�">
      </div>
    </div>
    <div class="row">
      <div class="col-25">
        <label for="lname">G�ncellenecek Soyisim</label>
      </div>
      <div class="col-75">
        <input type="text" id="lname" name="soyad" value='<%=yonetici.getSoyad()%>' placeholder="Y�netici Soyad�">
      </div>
    </div>
    <div class="row">
      <div class="col-25">
        <label for="email">G�ncellenecek E-mail</label>
      </div>
      <div class="col-75">
		<input type="text" id="email" name="email" value='<%=yonetici.getEmail()%>' placeholder="Y�netici E mail">
      </div>
    </div>
    <div class="row">
      <div class="col-25">
        <label for="pword">G�ncellenecek �ifre</label>
      </div>
      <div class="col-75">
        <input type="password" id="pword" name="sifre" value='<%=yonetici.getSifre()%>' placeholder="Y�netici �ifresi">
      </div>
    </div>
    <div class="row">
      <input type="submit" value="G�NCELLE">
    </div>
  </form>
</div>
</div>
</body>
</html>