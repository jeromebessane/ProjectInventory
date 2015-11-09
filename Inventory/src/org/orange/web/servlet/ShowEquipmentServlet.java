package org.orange.web.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.orange.metier.IEquipment;
import org.orange.metier.ImplementationEquipment;
import org.orange.metier.bean.Equipment;
import org.orange.web.model.ShowEquipmentModel;

/**
 * Servlet implementation class ShowEquipmentServlet
 */
@WebServlet("/ShowEquipmentServlet")
public class ShowEquipmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ShowEquipmentModel model;
	private IEquipment implEquip;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowEquipmentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		model = new ShowEquipmentModel();//create instance model
		implEquip=new ImplementationEquipment();
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
		//String test = request.getParameter("equip");
		//System.out.println(test);
		int idEquipment = Integer.parseInt(request.getParameter("equip"));
		Equipment equip = implEquip.getEquipmentWithId(idEquipment);
		model.setEquipment(equip);
		//store model in request
		request.setAttribute("modelShowEquip", model);//name model for the jsp
		//send result --> view
		request.getRequestDispatcher("../showEquipment.jsp").forward(request, response);
	}

}
