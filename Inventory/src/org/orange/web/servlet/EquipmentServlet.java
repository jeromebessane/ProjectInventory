package org.orange.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.orange.metier.IEquipment;
import org.orange.metier.IFilter;
import org.orange.metier.ImplementationEquipment;
import org.orange.metier.ImplementationFilter;
import org.orange.metier.bean.Equipment;
import org.orange.web.model.EquipmentModel;

/**
 * Servlet implementation class EquipmentServlet
 */
@WebServlet("/EquipmentServlet")
public class EquipmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IEquipment implEquip;
	private IFilter implFilter;
	private EquipmentModel model;
       
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
		implEquip=new ImplementationEquipment();
		implFilter=new ImplementationFilter();
		model = new EquipmentModel();//create instance model
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//for list equipments
		List<Equipment> listEquips = implEquip.getEquipments();//recovery results with metier part
		model.setListEquips(listEquips);//store result in model
		//for filter
		List<List<String>> listFilter = implFilter.getListFilter();//recovery results with metier part
		model.setListFilterr(listFilter);//store result in model
		//store model in request
		request.setAttribute("model", model);//name model for the jsp
		//send result --> view
		request.getRequestDispatcher("listEquipments.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//for list equipments
		String tag = request.getParameter("tag");//read data request
		model.setTag(tag);//store data request in model
		List<Equipment> listEquips = implEquip.getEquipmentsWithTag(tag);//recovery results with metier part
		model.setListEquips(listEquips);//store result in model
		//for filter
		List<List<String>> listFilter = implFilter.getListFilter();//recovery results with metier part
		model.setListFilterr(listFilter);//store result in model
		//store model in request
		request.setAttribute("model", model);//name model for the jsp
		//send result --> view
		request.getRequestDispatcher("listEquipments.jsp").forward(request, response);
	}

}
