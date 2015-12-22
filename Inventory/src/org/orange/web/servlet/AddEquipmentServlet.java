package org.orange.web.servlet;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.orange.metier.IEquipment;
import org.orange.metier.ImplementationEquipment;
import org.orange.metier.bean.Equipment;
import org.orange.web.model.AddEquipementModel;

/**
 * Servlet implementation class AddEquipmentServlet
 */
@WebServlet("/AddEquipmentServlet")
@MultipartConfig(fileSizeThreshold=1024*1024*2, 
				 maxFileSize=1024*1024*10,      
				 maxRequestSize=1024*1024*50)

public class AddEquipmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IEquipment implEquip;
	private AddEquipementModel model;
	private static final String SAVE_DIR = "Images_equip"; // Directory on the website
	private static final String CHAMP_IMAGE = "image"; // Nom class files (view)
       
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
		//request.getSession().invalidate();
		//response.sendRedirect("addEquipment.jsp");
		request.getRequestDispatcher("addEquipment.jsp").forward(request, response);
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//Upload Image
		String appPath = request.getServletContext().getRealPath("");	// Path of the application
		String savePath = appPath + File.separator + SAVE_DIR; // Path of the directory where are save the pictures
		Part part = request.getPart(CHAMP_IMAGE); // The pictures is save on the part
		String fileName = extractFileName(part); // Extract the file
		String finalPath = (savePath + File.separator + fileName); // Path of the file in the destination directory
		if (savePath.length() + 1 != finalPath.length()) { //Verify if the user has upload a picture 
			part.write(finalPath); // Write the picture in the folder
			finalPath = finalPath.replace("\\", "\\\\"); // The SQL delete the "\" if it is alone, so we need to put two "\"
		}
		else // If there is no file, the database receive "" (String empty)
			finalPath = "";
		
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
		equip.setImageEquipment(finalPath);
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
	
	//Parse name of the picture
	private String extractFileName(Part part) {
        String contentDisp = part.getHeader("content-disposition");
        String[] items = contentDisp.split(";");
        for (String s : items) {
            if (s.trim().startsWith("filename")) {
                return s.substring(s.indexOf("=") + 2, s.length()-1);
            }
        }
        return "";
    }
}
