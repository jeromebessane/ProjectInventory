package org.orange.web.model;

import java.util.ArrayList;
import java.util.List;

import org.orange.metier.Equipment;

public class EquipmentModele {
	
	private String tag;
	private List<Equipment> listEquips=new ArrayList<>();
	
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public List<Equipment> getListEquips() {
		return listEquips;
	}
	public void setListEquips(List<Equipment> listEquips) {
		this.listEquips = listEquips;
	}
}
