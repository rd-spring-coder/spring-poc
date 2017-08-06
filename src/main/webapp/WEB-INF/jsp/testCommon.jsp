<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<spring:url var="formURL" value="/uri3"/>
<form:form name="commonForm" modelAttribute="requestVO" action="${ formURL }">
	<form:input path="value"/>
	<form:errors path="value" cssStyle="color:red"/>
	<input type="submit"/>
</form:form>
