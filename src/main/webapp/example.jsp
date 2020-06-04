<%--
  Created by IntelliJ IDEA.
  User: evelyn
  Date: 6/4/20
  Time: 9:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>example</title>
</head>
<body>

<%@ include file="partials/navbar.jsp"%>

<%! int counter = 0; %>
<h1>
    welcome to this webpage <%= counter %>
</h1>
<% counter += 1; %>

<h2>implicit objects in jsp</h2>
<%--implicit objects in jsp--%>
<p>Path: <%= request.getRequestURL() %></p>
<p>Query String: <%= request.getQueryString() %></p>
<p>"name" parameter: <%= request.getParameter("name") %></p>
<p>"method" attribute: <%= request.getMethod() %></p>
<p>User-Agent header: <%= request.getHeader("user-agent") %></p>

<h2>Expression Language</h2>
<%--Expression Language--%>
<p>User-Agent header: ${header["user-agent"]}</p>
<p>"page_no" parameter: ${param.page_no}</p>

<% request.setAttribute("name", "evelyn"); %>
<p>Hello ${name}!</p>

<%@ include file="partials/thebestfooterever.jsp" %>
</body>
</html>
