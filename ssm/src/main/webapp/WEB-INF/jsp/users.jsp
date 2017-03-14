<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
	<table>
		<c:forEach items="${users}" var="item">
			<tr>
				<td>${item.userName }</td>
				<td>${item.userPhone }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
