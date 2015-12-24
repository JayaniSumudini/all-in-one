<%--
  Created by IntelliJ IDEA.
  User: dileepa
  Date: 12/24/15
  Time: 9:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page session="false"%>

<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8" />
  <title>Registration</title>
  <link rel='stylesheet' href='/time/webjars/bootstrap/3.3.6/css/bootstrap.min.css'>
  <script type="text/javascript"  src="/time/webjars/angularjs/1.4.8/angular.min.js"></script>
</head>
<body  class="container" ng-app="">
<div class="col-lg-6 col-lg-offset-3">
<a href="/time/logout"><button class="btn btn-primary" value="logout">logout</button></a>
<div class="page-header">
  <h1>Registration form <small>- sample project for ShipX TimeTracker</small></h1>
</div>

<div >
  <div class="row">
    <form role="form" method="post" action="addUser">
      <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
      <div class="col-lg-12">
        <label >First Name</label>
        <input type="text" class="form-control" name="fname" placeholder="First Name" ><br>
        <input type="submit" name="submit" value="Submit" class="btn btn-info pull-right">
      </div>
    </form>


  </div>
</div>
<hr>

<h2>ShipX Time Traker Members {{10/2}}</h2>

<table class="table table-striped">
  <thead>
  <tr>
    <th>Firstname</th>
  </tr>
  </thead>
  <tbody>
  <c:forEach items="${users}" var="item">
    <tr>
      <td>${item.username}</td>
    </tr>
  </c:forEach>

  </tbody>
</table>

</body>
</html>