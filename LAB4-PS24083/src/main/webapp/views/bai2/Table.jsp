<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<h3>User List</h3>
<table class="table table-striped" style="border-radius: 10px">
	<tbody>
		<tr>
			<th>Mark</th>
			<th>Otto</th>
			<th>@mdo</th>
		</tr>

		<c:choose>
			<c:when test="${not empty items}">
				<c:forEach var="item" items="${items}">
					<tr>
						<td>${item.getUsername() }</td>
						<td>${item.getPassword() }</td>
						<td> ${item.isRemember()?"Yes" : "No"} </td>

					</tr>
				</c:forEach>

			</c:when>
			<c:otherwise>
				<p>Danh sách rỗng.</p>
			</c:otherwise>
		</c:choose>

	</tbody>
</table>