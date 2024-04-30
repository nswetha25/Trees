<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Failed</title>
    <style>
        body {
            background-image: url('data:image/jpeg;base64,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'); /* Replace with the path to your background image */
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

        a {
            text-decoration: none;
            color: #fff;
            display: block;
            margin-top: 20px; /* Adjust the margin as needed */
            padding: 10px 20px;
            border: 1px solid #fff;
            border-radius: 5px;
            transition: background-color 0.3s;
        }

        a:hover {
            background-color: rgba(255, 255, 255, 0.1);
        }
    </style>
</head>
<body>
<h1> Fail to Login ! Try again </h1>
<a href='register.html'> click here for signup </a>
</body>
</html>