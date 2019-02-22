<!DOCTYPEhtml>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<body>
	<h1>Books</h1>

<a href="<c:url value="/books/add" />">Add Books</a>
<c:if test="${not empty books}">
	<ul>
		<c:forEach var="book" items="${books}">
		<li><c:out value="${book.title}"/>
		<c:out value="${book.author}"/>
		<c:out value="${book.ratingOfBook}"/>
		<c:out value="${book.statusOfBook}"/>
		<c:out value="${book.coverOfBook}"/>
		<c:out value="${book.dateAdded}"/>
		<a href="<c:url value="/books/delete/${book.id}" />">Remove Book</a>
		<a href="<c:url value="/books/update/${book.id}" />">Edit Book</a>
		</li>
		</c:forEach>
	</ul>
</c:if>

</body>
</html>