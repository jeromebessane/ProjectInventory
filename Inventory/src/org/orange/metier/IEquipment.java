package org.orange.metier;

import java.util.List;

import org.orange.metier.bean.Equipment;

public interface IEquipment {
	public List<Equipment> getEquipmentsWithTag(String tag);
	public List<Equipment> getEquipmentsWithFilter(List<String> constructor, List<String> type, List<String> status, List<String> localisation);
	public List<Equipment> getEquipments();
	public Equipment getEquipmentWithId(int id);
	public void addEquipment(Equipment equip);
	public List<Equipment> getLastEquipments();
	public List<Equipment> getTypesEquipments();
}
