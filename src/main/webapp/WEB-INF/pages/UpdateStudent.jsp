<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<h3>Update a Student</h3>
<body>
<c:form action="updatestudent">
<hr>
	Student Id:			<c:input path="${sid}"/>
	Student Name:		<c:input path="${sname}"/>
	Student Branch:		<c:input path="${sbranch}"/>
	Student Contact:	<c:input path="${scontact}"/>
						<input type="submit">
<hr>
</c:form>
</body>
</html>