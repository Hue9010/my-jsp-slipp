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
			<c:set var="actionUrl" value="/users/create" />
			<c:if test="${not empty user.userId}">
			<c:set var="actionUrl" value="/users/update" />
			</c:if>
				<form name="question" method="post" action="${actionUrl}">
					<div class="form-group">
						<label for="userId">사용자 아이디</label>
						<c:choose>
							<c:when test="${empty user.userId}">
								<input class="form-control" id="userId" name="userId"
									value="${user.userId}" placeholder="User ID">
							</c:when>
							<c:otherwise>
								<input class="form-control" id="userId" name="userId"
									value="${user.userId}" placeholder="User ID" readonly>
							</c:otherwise>
						</c:choose>
					</div>
					<div class="form-group">
						<label for="password">비밀번호</label> <input type="password"
							class="form-control" id="password" name="password"
							value="${user.password}"  placeholder="Password">
					</div>
					<div class="form-group">
						<label for="name">이름</label> <input class="form-control" id="name"
							name="name" value="${user.name}"  placeholder="Name">
					</div>
					<div class="form-group">
						<label for="email">이메일</label> <input type="email"
							class="form-control" id="email" name="email"
							value="${user.email}" placeholder="Email">
					</div>
					<button type="submit" class="btn btn-success clearfix pull-right">
						<c:choose>
							<c:when test="${empty user.userId}">
						회원가입
						</c:when>
							<c:otherwise>
						수정
						</c:otherwise>
						</c:choose>
					</button>
					<div class="clearfix" />
				</form>
			</div>
		</div>
	</div>

	<%@include file="/_footer.jspf"%>

</body>
</html>