<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

	
	<h1>Welcome ${name} to My collection bag Page From Saraya Tech</h1>
	

	<p>g 
		
		<table>
			<thead>
					<tr>
						<td>Image</td>
						<td>Year</td>
						<td>Make</td>
						<td>Model</td>
						<td> Delete bag</td>
					</tr>
			</thead>
			<tbody>
			<c:forEach items="${bags}" var="bag">
				<tr>
					<td><img src = "${bag.image}" width="100" height="100" /></td>
					<td>${bag.year}</td>
					<td>${bag.make}</td>
					<td>${bag.model}</td>
					<td>&nbsp; &nbsp; 
					<a href="/delete.do?id=${bag.id}">Delete</a></td>
				</tr>
			</c:forEach>	
			</tbody>
			
			
			
		</table>
		<p>
		<form action="/bag.do" method="post">
			<input type="text" name = "yr">
			<input type="text" name = "mk">
			<input type="text" name = "md">
			<input type="text" name = "im">
			<input type="submit" value="Add a Bag">
		</form>
	</p>
<%@ include file="../common/footer.jspf"%>