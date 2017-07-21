<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<spring:url var="formURL" value="/save"/>
<form:form name="employeeForm" modelAttribute="employee" action="${ formURL }">
	<form:input path="name"/>
	<form:errors path="name" cssStyle="color:red"/>
	<input type="submit"/>
</form:form>