package mvc;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) {
		
		EmployeeService es=new EmployeeService();
		Employee e=es.getEmployee();
		RequestDispatcher rd;
			req.setAttribute("employee", e);
		
	}

}
