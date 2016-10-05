<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<ol class="breadcrumb">
  <li><a href="mc.gnd?menu=main">Home</a></li>
  <li><a href="mc.gnd?menu=${sessionScope.curMCMenuSub}">${sessionScope.curMCMenuSub}</a></li>
  <li class="active">${sessionScope.curMCMenu}</li>
</ol>