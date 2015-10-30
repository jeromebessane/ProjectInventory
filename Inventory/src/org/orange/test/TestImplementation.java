package org.orange.test;

import java.util.List;

import org.orange.metier.ImplementationListEquipment;
import org.orange.metier.ImplementationUser;
import org.orange.metier.bean.Equipment;
import org.orange.metier.bean.User;

public class TestImplementation {

	public static void main(String[] args) {
		
		testCheckUser();
		//testGetEquipments();
		//testGetEquipmentsWithTag();

	}
	
	private static void testGetEquipmentsWithTag(){
		ImplementationListEquipment impl = new ImplementationListEquipment();
		List<Equipment> listEquips = impl.getEquipmentsWithTag("Cisco");
		for(Equipment equip:listEquips){
			System.out.println(equip.getTypeEquipment());
		}
	}
	
	private static void testGetEquipments(){
		ImplementationListEquipment impl = new ImplementationListEquipment();
		List<Equipment> listEquips = impl.getEquipments();
		for(Equipment equip:listEquips){
			System.out.println(equip.getTypeEquipment());
		}
	}
	
	private static void testCheckUser(){
		ImplementationUser impl = new ImplementationUser();
		User user = impl.getUserValidate("jbessane", "root");
		System.out.println("test :");
		if(user!=null){
			System.out.println(user.getFirstName());
			System.out.println(user.getLastName());
			System.out.println(user.getPassword());
		}
	}

}
