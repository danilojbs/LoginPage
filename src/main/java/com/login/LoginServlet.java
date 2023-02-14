package com.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entities.Usuario;

public class LoginServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	@Override
	protected void doPost(HttpServletRequest rq, HttpServletResponse rp) throws ServletException, IOException {
		String username = rq.getParameter("user");
		String password = rq.getParameter("pass");
		Usuario user = new Usuario(username, password);
		Login login = new Login(user);
		String pag = "login.jsp";
		
		if(login.connect()) {
			pag = "home.jsp";
			rq.getSession().setAttribute("username", username);
		}
		else {
			rq.setAttribute("user", username);
			rq.setAttribute("pass", password);
		}
		
		rq.setAttribute("msg", login.getMsg());
		rq.getRequestDispatcher(pag).forward(rq, rp);
	}
}
