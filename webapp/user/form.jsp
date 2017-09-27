<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="kr">
<head>
<%@include file="/_head.jspf"%>
</head>

<body>
	<%@include file="/_top.jspf"%>
	<div class="container" id="main">
		<div class="col-md-6 col-md-offset-3">
			<div class="panel panel-default content-main">
				<form name="question" method="get" action="/user/create">
					<div class="form-group">
						<label for="userId">사용자 아이디</label> <input class="form-control"
							id="userId" name="userId" placeholder="User ID">
					</div>
					<div class="form-group">
						<label for="password">비밀번호</label> <input type="password"
							class="form-control" id="password" name="password"
							placeholder="Password">
					</div>
					<div class="form-group">
						<label for="name">이름</label> <input class="form-control" id="name"
							name="name" placeholder="Name">
					</div>
					<div class="form-group">
						<label for="email">이메일</label> <input type="email"
							class="form-control" id="email" name="email" placeholder="Email">
					</div>
					<button type="submit" class="btn btn-success clearfix pull-right">회원가입</button>
					<div class="clearfix" />
				</form>
			</div>
		</div>
	</div>

	<%@include file="/_footer.jspf"%>

</body>
</html>