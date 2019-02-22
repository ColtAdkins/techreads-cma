<!DOCTYPEhtml>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<body>
	<h1>Edit Book</h1>
	<form:form method="post" modelAttribute="editForm"
		action="${pageContext.request.contextPath}/books">
		<form:input path="title" type="text" />
		<form:input path="author" type="text" />
		<form:input path="ratingOfBook" type="text" />
		<form:input path="statusOfBook" type="text" />
		<form:input path="coverOfBook" type="text" />
		<form:input path="id" value="${book.id}" type="hidden" />
		<button type="submit">Edit Book</button>
	</form:form>
</body>
</html>