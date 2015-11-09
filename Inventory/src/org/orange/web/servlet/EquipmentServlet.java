package org.orange.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
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
		model = new EquipmentModel();//create instance model
		implEquip=new ImplementationEquipment();
		implFilter=new ImplementationFilter();
		//generate list filter
		List<List<String>> listFilter = implFilter.getListFilter();//recovery results with metier part
		model.setListFilter(listFilter);//store result in model
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//if the first call
		if(model.getListEquips().isEmpty()){
			//for list equipments
			List<Equipment> listEquips = implEquip.getEquipments();//recovery results with metier part
			model.setListEquips(listEquips);//store result in model
		}
		//store model in request
		request.setAttribute("model", model);//name model for the jsp
		//send result --> view
		request.getRequestDispatcher("listEquipments.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Equipment> listEquips;//listEquips display
		
		//if methode doPost is called by search bar
		if(request.getParameter("tag")!=null)
		{
			//for list equipments
			String tag = request.getParameter("tag");//read data request
			model.setTag(tag);//store data request in model
			listEquips = implEquip.getEquipmentsWithTag(tag);//recovery results with metier part
			model.setListEquips(listEquips);//store result in model
			//store model in request
			request.setAttribute("model", model);//name model for the jsp
			//send result --> view
			request.getRequestDispatcher("listEquipments.jsp").forward(request, response);
		}
		else //if methode doPost is called by filter 
		{
			//list filter checked
			List<String> listFilterConstructorUsed=new ArrayList<String>();
			List<String> listFilterTypeUsed=new ArrayList<String>();
			List<String> listFilterStatusUsed=new ArrayList<String>();
			List<String> listFilterLocalisationUsed=new ArrayList<String>();
			Enumeration<String> paramName = request.getParameterNames();//read data request by enum
			//if there is no box checked
			if(!paramName.hasMoreElements()){
				model.setListFilterConstructorUsed(listFilterConstructorUsed);
				model.setListFilterTypeUsed(listFilterTypeUsed);
				model.setListFilterStatusUsed(listFilterStatusUsed);
				model.setListFilterLocalisationUsed(listFilterLocalisationUsed);
			}
			//for each category of box checked
			while(paramName.hasMoreElements()){
				String field = paramName.nextElement();//store category name
				String filter[] = request.getParameterValues(field);//store fields checked in this category
				//if category is constructor
				if(field.equals("constructor"))
				{
					for(int i=0;i<filter.length;i++){
						listFilterConstructorUsed.add(filter[i]);		
					}
				}//if category is type
				else if(field.equals("type"))
				{
					for(int i=0;i<filter.length;i++){
						listFilterTypeUsed.add(filter[i]);		
					}
				}//if category is status
				else if(field.equals("status"))
				{
					for(int i=0;i<filter.length;i++){
						listFilterStatusUsed.add(filter[i]);		
					}
				}//if category is localisation
				else if(field.equals("localisation"))
				{
					for(int i=0;i<filter.length;i++){
						listFilterLocalisationUsed.add(filter[i]);		
					}			
				}
				model.setListFilterConstructorUsed(listFilterConstructorUsed);
				model.setListFilterTypeUsed(listFilterTypeUsed);
				model.setListFilterStatusUsed(listFilterStatusUsed);
				model.setListFilterLocalisationUsed(listFilterLocalisationUsed);
			}//if there is not field checked in this category

			//for list equipments
			//recovery results with metier part
			listEquips = implEquip.getEquipmentsWithFilter(listFilterConstructorUsed, listFilterTypeUsed, listFilterStatusUsed, listFilterLocalisationUsed);
			model.setListEquips(listEquips);//store result in model		
			//store model in request
			request.setAttribute("model", model);//name model for the jsp
			//send result --> view
			request.getRequestDispatcher("listEquipments.jsp").forward(request, response);
		}
	}

}
