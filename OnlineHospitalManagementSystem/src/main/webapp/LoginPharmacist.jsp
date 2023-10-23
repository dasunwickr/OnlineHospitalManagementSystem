<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Pharmacist Login</title>
    <link rel="stylesheet" type="text/css" href="pharmacist-styles/login-pharmacist.css">
    <!-- Include Font Awesome CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
</head>
<body background="./pharmacist-images/LoginBG.jpg">
    <div class="container">
        <form class="login" action="LoginPharmacistController" method="post">
            <div class="head">
                <h2 class="company">Pharmacist Login</h2>
            </div>
            <div class="msg">
                <p>Welcome back, please login.</p>
            </div>
            <div class="form">
                <input type="text" name="username" class="text" placeholder="Username" required>
                <input type="password" name="password" class="password" placeholder="Password" required>
                <label for="remember-me" class="remember-me-label">
                    <input type="checkbox" id="remember-me" class="remember-me"> Remember Me
                </label>
                <button type="submit" class="btn-login">Login</button>
            </div>
        </form>
    </div>
</body>
</html>

