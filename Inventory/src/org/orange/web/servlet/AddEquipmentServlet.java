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
import org.orange.web.model.AddEquipementModel;

/**
 * Servlet implementation class AddEquipmentServlet
 */
@WebServlet("/AddEquipmentServlet")
public class AddEquipmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IEquipment implEquip;
	private AddEquipementModel model;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEquipmentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		implEquip= new ImplementationEquipment();
		model = new AddEquipementModel();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getSession().invalidate();
		response.sendRedirect("addEquipment.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Equipment equip = new Equipment();
		equip.setTypeEquipment(request.getParameter("type"));
		equip.setConstructorEquipment(request.getParameter("constructor"));
		equip.setModelEquipment(request.getParameter("model"));
		equip.setSnEquipment(request.getParameter("serial_number"));
		equip.setPnEquipment(request.getParameter("part_number"));
		equip.setLocalisationEquipment(request.getParameter("localisation"));
		equip.setSupervisorEquipment(request.getParameter("supervisor"));
		equip.setAdressIpEquipment(request.getParameter("adress_ip"));
		equip.setNameEquipment(request.getParameter("name"));
		equip.setLicenseEquipment(request.getParameter("licence"));
		equip.setAccessoriesEquipment(request.getParameter("accessories"));
		equip.setStateEquipment(request.getParameter("condition"));
		equip.setStatusEquipment(request.getParameter("status"));
		if (request.getParameter("proprietary").equals("false")) {
			equip.setProprietaryEquipment(false);
		}
		else {
			equip.setProprietaryEquipment(true);
		}
		Boolean bool = implEquip.addEquipment(equip);
		model.setEquip(equip);
		if (bool){
			request.getRequestDispatcher("home.jsp").forward(request, response);
		}
		else{
			request.getRequestDispatcher("/addEquipment.jsp").forward(request, response);
		}
	}

}
