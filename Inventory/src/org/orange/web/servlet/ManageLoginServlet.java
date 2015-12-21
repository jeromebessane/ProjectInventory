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
 * Servlet implementation class ChangePassword
 */
@WebServlet("/ChangePassword")
public class ManageLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private IUser implUser;
    private UserModel model;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManageLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		implUser = new ImplementationUser();
		model = new UserModel();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User currentUser = (User) request.getSession().getAttribute("user");
		//System.out.println(currentUser.getLogin());
		int idUser = currentUser.getId(); //The id of user is catch
		User userData = implUser.getDataUser(idUser);// The database gave the information of the user
		model.setUserData(userData);
		request.setAttribute("modelUser", model);
		request.getRequestDispatcher("manageLogin.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
