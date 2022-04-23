<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Management Application</title>
</head>
<body>
<center>
<h1>User Management</h1>
<h2>
        	<a href="new">Add New User</a>
        	&nbsp;&nbsp;&nbsp;
        	<a href="list">List All Users</a>

        </h2>
</center>
 <div align="center">
		<c:if test="${User != null}">
			<form action="update" method="post">
        </c:if>
        <c:if test="${User == null}">
			<form action="insert" method="post">
        </c:if>
        <table border="1" cellpadding="5">
            <caption>
            	<h2>
            		<c:if test="${User != null}">
            			Edit User
            		</c:if>
            		<c:if test="${User == null}">
            			Add New User
            		</c:if>
            	</h2>
            </caption>
        		<c:if test="${User != null}">
        			<input type="hidden" name="id" value="<c:out value='${User.id}' />" />
        		</c:if>            
            <tr>
                <th>User Name: </th>
                <td>
                	<input type="text" name="name" size="45"
                			value="<c:out value='${User.name}' />"
                		/>
                </td>
            </tr>
            <tr>
                <th>User Email: </th>
                <td>
                	<input type="text" name="email" size="45"
                			value="<c:out value='${User.email}' />"
                	/>
                </td>
            </tr>
            <tr>
                <th>Country: </th>
                <td>
                	<input type="text" name="country" size="15"
                			value="<c:out value='${User.country}' />"
                	/>
                </td>
            </tr>
            <tr>
            	<td colspan="2" align="center">
            		<input type="submit" value="Save" />
            	</td>
            </tr>
        </table>
        </form>
    </div>	
</body>
</html>