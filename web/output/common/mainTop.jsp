<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%
//공용으로 사용할 변수나 함수들 
	String title="정치인 평가 사이트";
	String commonURL="/";
%>   
<title><%=title%></title>
</head>
<body>
<!--상단 공용 페이지 -->
<div style="text-align:center; ">로고들어올 곳</div>
<div style="text-align:right"><a href=#>로그인</a></div>
<div style="text-align:right"><a href=calendar.go>달력보기</a></div>
<div style="float: left; margin-left: 20%"><a href="/main.go">지역별 정치인 보기</a></div>
<div style="margin-left:60%"><a href="/keyPointIndex.go">주요 정보 보기</a></div>
