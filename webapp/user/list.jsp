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
		<div class="col-md-10 col-md-offset-1">
			<div class="panel panel-default">
				<table class="table table-hover">
					<thead>
						<tr>
							<th>#</th>
							<th>사용자 아이디</th>
							<th>이름</th>
							<th>이메일</th>
							<th></th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="user" items="${users}">
							<tr>
								<th scope="row">index</th>
								<td>${user.userId}</td>
								<td><a href="/users/{{id}}">${user.name}</a></td>
								<td>${user.email}</td>
								<c:if test="${user.userId eq loginedId}">
									<td><a href="/users/updateForm" class="btn btn-success"
										role="button">수정</a></td>
								</c:if>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>

	<%@include file="/_footer.jspf"%>

</body>
</html>