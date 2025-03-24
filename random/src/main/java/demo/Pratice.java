package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

public class Pratice extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		res.getWriter().write("Hello\n");
		
	
		PrintWriter p = res.getWriter();    
    Cookie c=new Cookie("user1","Gaurav");
    res.addCookie(c);
    Cookie ch[]=req.getCookies();
    
    for(Cookie c1:ch) {
    	System.out.println(c1.getName() +" " + c1.getValue());
    }
    
    HttpSession s= req.getSession();
s.setAttribute("Gam", "G");
p.println(s.getId()+" " + s.getLastAccessedTime());
System.out.println(s.getCreationTime());
    
	}
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		res.getWriter().write("Hello\n");
		
		String name=req.getParameter("name");
		res.getWriter().print("hi Gaurav");
		
		
		
   
	}

}
