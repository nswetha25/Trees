<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.telusko.controller.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Success</title>
    <style>
        body {
            background-image: url('https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTZQlmeKvJbTvbMYmwwItv8Yv674mi_dwrINQ&usqp=CAU'); /* Replace with the path to your background image */
            background-size: cover;
            background-position: center;
            font-family: Arial, sans-serif;
            text-align: center;
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            height: 100vh;
            color: #fff;
        }

        h1 {
            color: #fff;
        }
    </style>
</head>
<body>
<h1> Login Success!!  </h1>
 
<h2><%= "Welcome" + request.getAttribute("name")%> to the app</h2>//check why null is comiing why its not able to get the name
</body>
</html>