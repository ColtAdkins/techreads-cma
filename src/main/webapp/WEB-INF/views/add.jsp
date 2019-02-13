<!DOCTYPEhtml>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
<h1>Add Book</h1>
<form:form method="post" modelAttribute="bookForm" action="${pageContext.request.contextPath}/books">
<form:input path="title" type="text"/>
<h2>Add Author</h2>
<form:form method="post" modelAttribute="bookForm" action="${pageContext.request.contextPath}/books">
<form:input path="author" type="text"/>
<button type="submit">Submit</button>
</form:form>
</form:form>
</body>
</html>