<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<ol class="breadcrumb">
  <li><a href="mc.gnd?menu=main">홈</a></li>
  <li><a href="mc.gnd?menu=${curMCSubUrl}">${curMCSubName}</a></li>
  <li class="active">${curMCMenu}</li>
</ol>