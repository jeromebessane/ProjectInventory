package org.orange.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.orange.metier.Equipment;
import org.orange.metier.IListEquipment;
import org.orange.metier.ImplementationListEquipment;
import org.orange.web.model.EquipmentModele;

/**
 * Servlet implementation class EquipmentServlet
 */
@WebServlet("/EquipmentServlet")
public class EquipmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IListEquipment metierEquip;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EquipmentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		metierEquip=new ImplementationListEquipment();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EquipmentModele modEquip = new EquipmentModele();//create instance model
		List<Equipment> listEquips = metierEquip.getEquipments();//recovery results with metier part
		modEquip.setListEquips(listEquips);//store result in model
		//store model in request
		request.setAttribute("model", modEquip);//name model for the jsp
		//send result --> view
		request.getRequestDispatcher("listEquipments.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tag = request.getParameter("tag");//read data request
		EquipmentModele modEquip = new EquipmentModele();//create instance model
		modEquip.setTag(tag);//store data request in model
		List<Equipment> listEquips = metierEquip.getEquipmentsWithTag(tag);//recovery results with metier part
		modEquip.setListEquips(listEquips);//store result in model
		//store model in request
		request.setAttribute("model", modEquip);//name model for the jsp
		//send result --> view
		request.getRequestDispatcher("listEquipments.jsp").forward(request, response);
	}

}
