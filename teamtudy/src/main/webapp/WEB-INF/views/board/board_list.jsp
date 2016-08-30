<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false"%>
<%@include file="../include/header.jsp"%>
<div class="container">
	<div class="row">
		<table class="table">
			<tr>
				<th width="10%">번호</th>
				<th width="40%">제목</th>
				<th width="20%">작성자</th>
				<th width="20%">작성일시</th>
				<th width="10%">조회수</th>
			</tr>
			<c:forEach items="${BoardList}" var="BoardVO">
				<tr>
					<td>${BoardVO.boardNumber}</td>
					<td><a href="/board/view?boardNumber=${BoardVO.boardNumber}">${BoardVO.title}</a></td>
					<td>${BoardVO.userNumber}</td>
					<td>${BoardVO.regdate}</td>
					<td>${BoardVO.hit}</td>
				</tr>
			</c:forEach>
		</table>
		<a href="/board/writeview" class="btn">글쓰기</a>
	</div>
</div>
<%@include file="../include/footer.jsp"%>