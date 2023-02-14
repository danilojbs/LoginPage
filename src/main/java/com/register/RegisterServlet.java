package com.register;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	@Override
	protected void doPost(HttpServletRequest rq, HttpServletResponse rp) throws ServletException, IOException {
		String username = rq.getParameter("user");
		String password1 = rq.getParameter("pass1");
		String password2 = rq.getParameter("pass2");
		Register register = new Register();
		String pag = "register.jsp";
		
		if(register.registrar(username, password1, password2)) pag = "login.jsp";
		else {
			rq.setAttribute("user", username);
			rq.setAttribute("pass1", password1);
			rq.setAttribute("pass2", password2);
		}
		rq.setAttribute("msg", register.getMsg());
		rq.getRequestDispatcher(pag).forward(rq, rp);
	}
}
