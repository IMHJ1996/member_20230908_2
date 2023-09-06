<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>회원가입 페이지</h2>
    <form action="/join" method="post">
           이메일: <input type="text" name="MemberEmail"> <br>
           비밀번호: <input type="text" name="MemberPassword"> <br>
           이름: <input type="text" name="MemberName"> <br>
           생일: <input type="text" name="MemberBirth"> <br>
           전화번호: <input type="text" name="MemberMobile"> <br>
           <input type="submit" value="등록">
       </form>
</body>
</html>