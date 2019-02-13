<!DOCTYPEhtml>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<body>
	<h1>Edit Book</h1>
		<form:form method="post" modelAttribute="editForm" action="${pageContext.request.contextPath}/books">
		<form:input path="title" type="text"/>
		<button type="submit">Edit Title</button>
		</form:form>
		<form:form method="post" modelAttribute="editForm" action="${pageContext.request.contextPath}/books">
		<form:input path="author" type="text"/>
		<button type="submit">Edit Author</button>
		</form:form>
		<form:form method="post" modelAttribute="editForm" action="${pageContext.request.contextPath}/books">
		<form:input path="ratingOfBook" type="text"/>
		<button type="submit">Edit Rating</button>
		</form:form>
		<form:form method="post" modelAttribute="editForm" action="${pageContext.request.contextPath}/books">
		<form:input path="statusOfBook" type="text"/>
		<button type="submit">Edit Status</button>
		</form:form>
		<form:form method="post" modelAttribute="editForm" action="${pageContext.request.contextPath}/books">
		<form:input path="coverOfBook" type="text"/>
		<button type="submit">Edit Cover</button>
		</form:form>
</body>
</html>