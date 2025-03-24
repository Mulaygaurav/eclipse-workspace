<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<pre>
<% 

for(int i=1;i<=5;i++){
	for(int j=1;j<=i;j++){
		out.print("*");
	}
	out.println("");
	} %>
<br>
<%
int a=20;
int b=30;
if(a>10){
	out.print("Hello");
}else{
	out.print("world");
}
%>


<%=10+20 %>



<%! public int count=0;
	public void increment(){
		count++;
	}
	
%>
<%
increment();
increment();
increment();
increment();
increment();
out.print(count);
%>


</pre>


</body>
</html>