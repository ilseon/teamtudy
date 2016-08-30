<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false"%>
<%@include file="../include/header.jsp"%>
<div class="container">
	<div class="row">
		<form method="post" action="/board/edit?boardNumber=${BoardVO.boardNumber}">
			<table class="table">
				<tr>
					<th>제목</th>
					<th><input type="text" name="title" value="${BoardVO.title}"/></th>
				</tr>
				<tr>
					<th>내용</th>
					<td><textarea name="content">${BoardVO.content}</textarea></td>
				</tr>			
				<tr>
					<td colspan="2">
						<button class="btn">수정</button>
						<a href="/board" class="btn">취소</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>
<%@include file="../include/footer.jsp"%>