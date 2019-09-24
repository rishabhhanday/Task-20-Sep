<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h3>List-of-Students-Using-JSTL</h3>
<hr>
	<table>
	
	<tr>
		<th>RollNo</th><th>Name</th><th>Branch</th><th>Sem</th>
	<tr>
	<c:forEach var="student" items="${list}">
		<tr>
			<td>${student.sid}</td>
			<td>${student.sname}</td>
			<td>${student.sbranch}</td>
			<td>${student.scontact}</td>
			<td><a href="removestudent?sid=${student.sid}">[X]</a></td>
			<td><a href="Update?sid=${student.sid}">Change</a></td>
		</tr>
	</c:forEach>
	</table>


<hr>
</body>
</html>