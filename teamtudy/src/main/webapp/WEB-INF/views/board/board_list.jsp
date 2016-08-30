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
	<!-- 페이징 -->
	<div class="row">
       <nav>
      <ul class="pagination">
          <li><a href="/board?bno=${paging.firstPageNo}" class="first">처음 페이지</a></li>
         <li> <a href="/board?bno=${paging.prevPageNo}" class="prev">이전 페이지</a></li>
          <li>
              <c:forEach var="i" begin="${paging.startPageNo}" end="${paging.endPageNo}" step="1">
                  <c:choose>
                      <c:when test="${i eq paging.pageNo}"><a href="/board?bno=${i}" class="choice">${i}</a></c:when>
                      <c:otherwise><a href="/board?bno=${i}">${i}</a></c:otherwise>
                  </c:choose>
              </c:forEach>
          <li>
         <li> <a href="/board?bno=${paging.nextPageNo}" class="next">다음 페이지</a></li>
          <li><a href="/board?bno=${paging.finalPageNo}" class="last">마지막 페이지</a></li>
      </ul>
      </nav>
   </div>
</div>
<%@include file="../include/footer.jsp"%>