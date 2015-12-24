<%--
  Created by IntelliJ IDEA.
  User: dileepa
  Date: 12/24/15
  Time: 11:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>

<c:url var="loginUrl" value="/login" />

<div style="width:300px;margin: 30px auto;border: solid 2px royalblue;border-radius: 5px;padding: 15px">
  <h1>LOG IN HERE</h1><hr>
  <form class="form-control" action="${loginUrl}" method="post">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

    <c:if test="${param.error != null}">
      <p>
        Invalid username and password.
      </p>
    </c:if>

    <p>
      <label for="username">Username --- </label>
      <input type="text" id="username" name="username" value="user"/>
    </p>
    <p>
      <label for="password">Password --- </label>
      <input type="password" id="password" name="password" value="pwd"/>
    </p>
    <button class="form-control" type="submit">Log in</button>

  </form>
</div>