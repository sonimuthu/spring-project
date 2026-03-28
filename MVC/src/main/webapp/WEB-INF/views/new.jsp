<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign Up</title>

<style>
    body {
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background: linear-gradient(to right, #4facfe, #00f2fe);
        margin: 0;
        padding: 0;
    }

    .container {
        width: 400px;
        margin: 80px auto;
        background: #fff;
        padding: 30px;
        border-radius: 10px;
        box-shadow: 0 8px 20px rgba(0,0,0,0.2);
    }

    h2 {
        text-align: center;
        margin-bottom: 20px;
        color: #333;
    }

    .form-group {
        margin-bottom: 15px;
    }

    label {
        display: block;
        margin-bottom: 5px;
        color: #555;
        font-size: 14px;
    }

    input {
        width: 100%;
        padding: 10px;
        border-radius: 6px;
        border: 1px solid #ccc;
        font-size: 14px;
    }

    input:focus {
        border-color: #4facfe;
        outline: none;
    }

    .btn {
        width: 100%;
        padding: 10px;
        background: #4facfe;
        border: none;
        color: #fff;
        font-size: 16px;
        border-radius: 6px;
        cursor: pointer;
        transition: 0.3s;
    }

    .btn:hover {
        background: #00c6ff;
    }

    .footer {
        text-align: center;
        margin-top: 15px;
        font-size: 13px;
    }

    .footer a {
        color: #4facfe;
        text-decoration: none;
    }

    .footer a:hover {
        text-decoration: underline;
    }

</style>
</head>

<body>

<div class="container">
    <h2>Create Account</h2>

    <form action="SignupServlet" method="post">
        
        <div class="form-group">
            <label>Full Name</label>
            <input type="text" name="fullname" required>
        </div>

        <div class="form-group">
            <label>Email Address</label>
            <input type="email" name="email" required>
        </div>

        <div class="form-group">
            <label>Username</label>
            <input type="text" name="username" required>
        </div>

        <div class="form-group">
            <label>Password</label>
            <input type="password" name="password" required>
        </div>

        <div class="form-group">
            <label>Confirm Password</label>
            <input type="password" name="confirmPassword" required>
        </div>

        <button type="submit" class="btn">Sign Up</button>
    </form>

    <div class="footer">
        Already have an account? <a href="login.jsp">Login</a>
    </div>
</div>

</body>
</html>