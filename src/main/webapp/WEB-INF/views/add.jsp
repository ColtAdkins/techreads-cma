<!DOCTYPEhtml>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
<h1>Add Book</h1>
<p> Title </p>
<form:form method="post" modelAttribute="bookForm" action="${pageContext.request.contextPath}/books">
<form:input path="title" type="text"/>
<p> Author </p>
<form:form method="post" modelAttribute="bookForm" action="${pageContext.request.contextPath}/books">
<form:input path="author" type="text"/>
<p> Rating </p>
<form:form method="post" modelAttribute="bookForm" action="${pageContext.request.contextPath}/books">
<form:input path="ratingOfBook" type="text"/>
<p> Status </p>
<form:form method="post" modelAttribute="bookForm" action="${pageContext.request.contextPath}/books">
<form:input path="statusOfBook" type="text"/>
<p> Cover </p>
<form:form method="post" modelAttribute="bookForm" action="${pageContext.request.contextPath}/books">
<form:input path="coverOfBook" type="text"/>
<button type="submit">Submit</button>
</form:form>
</form:form>
</form:form>
</form:form>
</form:form>
</body>
</html>