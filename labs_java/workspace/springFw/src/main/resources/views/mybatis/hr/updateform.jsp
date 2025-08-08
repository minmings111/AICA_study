<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>사원 수정</h1>
	<form action  = "./update" method = "post">
	<table border = "1">
		<tr>
			<th>EMPLOYEE_ID</th>
			<td><input type = "number" name="employeeId" max = "999999" required value = "${emp.employeeId }" readnoly></td> <!--  table data -->		
		</tr>
		<tr>
		    <th>FIRST_NAME</th>
		    <td><input type = "text" name = "firstName" value = "${emp.firstName }"></td>
		</tr>
		<tr>
		    <th>LAST_NAME</th>
		    <td><input type="text" name="lastName" value = "${emp.lastName }" required ></td>
		</tr>
		<tr>
		    <th>EMAIL</th>
		    <td><input type="text" name="email" value = "${emp.email }" required ></td>
		</tr>
		<tr>
		    <th>PHONE_NUMBER</th>
		    <td><input type="text" name="phoneNumber" value = "${emp.phoneNumber }"></td>
		</tr>
		<tr>
		    <th>HIRE_DATE</th>
		    <td><input type="date" name="hireDate" value = "${emp.hireDate }" required ></td>
		</tr>
		<tr>
		    <th>JOB_ID</th>
		    <td>
		    	<select name = "jobId">
		    	<c:forEach var = "job" items = "${jobList }">
		    		<c:if test= "${emp.jobId == job.JOBID }">
		    		<option value = "${job.JOBID }" selected >${job.JOBTITLE }</option>
		    		</c:if>
		    		<c:if test= "${emp.jobId != job.JOBID }">
		    		<option value = "${job.JOBID }">${job.JOBTITLE }</option>
		    		</c:if>
		    	</c:forEach>
		    	</select> <!-- 이미 값이 내장되어 있어서 직접 입력하면 위험한 데이터는 select 사용 -->
		    </td>
		</tr>
		<tr>
		    <th>SALARY</th>
		    <td><input type = "number" name = "salary" value = "${emp.salary }" required></td>
		</tr>
		<tr>
		    <th>COMMISSION_PCT</th>
		    <td><input type = "number" name = "commissionPct" min = "0" max = "0.99" step = "0.1" value = "${emp.commissionPct }" required></td>
		</tr>
		<tr>
		    <th>MANAGER_ID</th>
		    <td>
		    	<select name = "managerId">
		    	<c:forEach var = "manager" items = "${managerList }">
		    		<c:if test= "${emp.managerId == job.MANAGERID }">
		    		<option value = "${manager.MANAGER_ID }" selected >${manager.MANAGER_NAME }</option>
		    		</c:if>
		    		<c:if test= "${emp.managerId != job.MANAGERID }">
		    		<option value = "${manager.MANAGER_ID }">${manager.MANAGER_NAME }</option>
		    		</c:if>
		    	</c:forEach>
		    	</select>
		    </td>
		</tr>
		<tr>
		    <th>DEPARTMENT_ID</th>
		    <td>
		    	<select name = "departmentId">
		    	<c:forEach var = "dept" items = "${deptList }">
		    		<option value = "${dept.DEPARTMENTID }"
		    		<c:if test= "${emp.departmentId == dept.DEPARTMENTID }">
		    		selected
		    		</c:if>
		    		>${dept.DEPARTMENTNAME }</option>
		    	</c:forEach>
		    	</select>
		   	</td>
		</tr>
		<tr>
			<th>&nbsp;</th>
			<td>
				<button type = "submit"> 사원수정</button>
				<button type = "submit"> 초기화</button>
			</td>
		</tr>
	</table>
	</form>
</body>
</html>