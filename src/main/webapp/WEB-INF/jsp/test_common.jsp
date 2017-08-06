<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<spring:url var="formURLWithoutModelAttribute" value="/uri3-2"/>
<spring:url var="formURLWithModelAttribute" value="/uri3-2"/>
<form:form name="commonForm" modelAttribute="requestVO" action="${ formURLWithModelAttribute }">
	<form:input path="instanceVarChild1"/>
	<input type="submit"/>
</form:form>
