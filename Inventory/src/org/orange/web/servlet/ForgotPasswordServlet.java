package org.orange.web.servlet;

import java.io.IOException;
import java.util.UUID;

import javax.mail.MessagingException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.orange.metier.ISendMail;
import org.orange.metier.IUser;
import org.orange.metier.ImplementationUser;
import org.orange.metier.SendMail;

/**
 * Servlet implementation class ForgetPasswordServlet
 */
@WebServlet("/ForgetPasswordServlet")
public class ForgotPasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IUser implUser;
	private ISendMail mail;
	 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ForgotPasswordServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void init(ServletConfig config) throws ServletException {
    	implUser = new ImplementationUser();
    	mail = new SendMail();
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("forgotPassword.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("You're in the DoPost");
		String forgot_mail = request.getParameter("email"); 
		int idUser = implUser.checkField("email", forgot_mail); // Check if the mail exist and return id user;
		if (idUser != 0)	{
			String new_password = UUID.randomUUID().toString(); // Generate a new_password
			implUser.changeData(idUser, "password", new_password);// Replace the former password by the new password
			String mail_message = "Hello,\n You're request has been register, you're new password is:\n"; // Text of the mail
			/*try { DON'T remove the comment, this part of the code crash  the server
				mail.send_email("support.sas@orange.com", "SAS Support", forgot_mail, "Forgot Password", mail_message + new_password); // email which send the new password
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} */
		}
		request.getRequestDispatcher("/home.jsp").forward(request, response);
	}

}
