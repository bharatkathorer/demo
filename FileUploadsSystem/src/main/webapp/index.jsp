<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
<h2>File Upload System</h2><br/>

<form action="Upload" method="post" enctype="multipart/form-data">
<p><input type="file" name="file" multiple="multiple"/></p>
<p><input type="submit"/></p>
</form>
<img src="images/b.jpg"/>

</body>
</html>
