package org.orange.test;

import java.util.List;

import org.orange.metier.Equipment;
import org.orange.metier.ImplementationListEquipment;

public class TestImplementation {

	public static void main(String[] args) {
		
		testGetEquipments();
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

}
