<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
	<p><font color="red">${errorMessage }</font></p>
	<p>
		
		<form action="login.do" method="post">
			<label>Username:</label>
			<input type="text" name="nom">
			<label>Password</label>
			<input type="password" name="pass">
			<input type="submit">
		</form>
	</p>
</body>
<%@ include file="../common/footer.jspf"%>