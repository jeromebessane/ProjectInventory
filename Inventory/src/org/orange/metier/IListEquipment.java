package org.orange.metier;

import java.util.List;

public interface IListEquipment {
	public List<Equipment> getEquipmentsWithTag(String tag);
	public List<Equipment> getEquipments();
	public void addEquipment(Equipment equip);
}
