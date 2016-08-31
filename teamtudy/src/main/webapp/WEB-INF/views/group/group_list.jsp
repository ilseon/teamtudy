<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false"%>
<%@include file="../include/header.jsp"%>
<div class="container">
	<h1>모임 보기</h1>
	<!-- 검색 필터 -->
	<div>
	</div>
	<!-- 검색 결과 및 모임 보기 -->
	<div class="row">
		<c:forEach items="${groupList}" var="groupVO">
			<div class="col-md-3">
				제목 : ${groupVO.title}
			</div>
		</c:forEach>
	</div>
</div>
<%@include file="../include/footer.jsp"%>