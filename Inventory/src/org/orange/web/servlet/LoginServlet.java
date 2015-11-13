package org.orange.web.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.orange.metier.IUser;
import org.orange.metier.ImplementationUser;
import org.orange.metier.bean.User;
import org.orange.web.model.UserModel;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IUser implUser;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		implUser=new ImplementationUser();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		       
		if(!login.isEmpty() && !password.isEmpty()){
			UserModel modUser = new UserModel();//create instance model
			modUser.setLogin(login);//store data request in model
			modUser.setPassword(password);
			User currentUser = implUser.getUserValidate(login, password);//recovery results with metier part
			modUser.setUser(currentUser);//store result in model
			
			if(currentUser==null){
				//if password or login is wrong
				String message = "Wrong login or password";
				request.setAttribute("message", message);
				request.getRequestDispatcher("/home.jsp").forward(request, response);
				
			}else{		         
				request.getSession().setAttribute("user", currentUser);
				response.sendRedirect(".");
			}
			
		}else {
				//if password or login is empty
				String message = "Empty login or password";
				request.setAttribute("message", message);
				request.getRequestDispatcher("/home.jsp").forward(request, response);
		}
	}

}
