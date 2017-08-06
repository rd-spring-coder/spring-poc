<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:choose>
<c:when test="${helloForm eq true}">
<spring:url var="formURL" value="/no-model-attribute"/>
<form:form name="employeeForm" modelAttribute="hello" action="${ formURL }">
	<form:input path="value"/>
	<form:errors path="value" cssStyle="color:red"/>
	<input type="submit"/>
</form:form>
</c:when>
<c:otherwise>
	<a href="#">Back to form</a>
	Value: ${hello.value}
</c:otherwise>
</c:choose>