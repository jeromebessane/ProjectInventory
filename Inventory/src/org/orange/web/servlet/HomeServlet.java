package org.orange.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
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
import org.orange.web.model.HomeModel;

/**
 * Servlet implementation class HomePage
 */
@WebServlet("/HomePage")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IEquipment implEquip;
	private IFilter implFilter;
	private HomeModel model;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		implEquip= new ImplementationEquipment();
		implFilter=new ImplementationFilter();
		model = new HomeModel();//create instance model
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//for list equipments
		List<Equipment> listEquips = implEquip.getLastEquipments();//recovery results with metier part
		model.setListEquips(listEquips);//store result in model
		// for list types
		List<String> tmp_listTypes = implFilter.getListField("Type");
		// Display nine pictures in the homepage
		Iterator<String> it = tmp_listTypes.iterator();
		List<String> listTypes = new ArrayList<String>();
		for (int i = 0; it.hasNext() && i < 9; i++) {
			listTypes.add(it.next());
			i++;
		}
		model.setListTypes(listTypes);
		//store model in request
		request.setAttribute("modelHome", model);//name model for the jsp
		//send result --> view
		request.getRequestDispatcher("home.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
