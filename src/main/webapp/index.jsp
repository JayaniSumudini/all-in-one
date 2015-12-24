<%--
  Created by IntelliJ IDEA.
  User: dileepa
  Date: 12/24/15
  Time: 11:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html ng-app="restTest">
<head>
    <title></title>
    <link rel='stylesheet' href='/time/webjars/bootstrap/3.3.6/css/bootstrap.min.css'>

</head>
<body class="container">
<h1>Rest API Testing</h1>

<div ng-controller="restController as rest">
    <div ng-repeat="post in posts">
        <h3>{{post.username}}</h3>
    </div>
</div>

<script type="text/javascript"  src="/time/webjars/angularjs/1.4.8/angular.min.js"></script>
<script type="text/javascript"  src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.5.0-rc.0/angular-resource.js"></script>
<script src="<c:url value='/resources/js/test.js' />" rel="script"></script>
</body>
</html>
