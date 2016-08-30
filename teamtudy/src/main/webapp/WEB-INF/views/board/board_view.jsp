<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false"%>
<%@include file="../include/header.jsp"%>
<div class="container">
	<div class="row">
		<table class="table">
			<tr>
				<th width="80%">${BoardVO.title}</th>
				<td>${BoardVO.regdate}</td>
			</tr>
			<tr>
				<th>${BoardVO.userNumber}</th>
				<td>${BoardVO.hit}</td>
			</tr>
			<tr>
				<td colspan="2">${BoardVO.content}</td>
			</tr>
			<tr>
				<td colspan="2">
					<a href="/board/editview?boardNumber=${BoardVO.boardNumber}" class="btn">수정</a>
					<a href="/board/delete?boardNumber=${BoardVO.boardNumber}" class="btn">삭제</a>
					<a href="/board" class="btn">목록</a>
				</td>
			</tr>
		</table>
	</div>
</div>
<%@include file="../include/footer.jsp"%>