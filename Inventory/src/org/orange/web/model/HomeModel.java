package org.orange.web.model;

import java.util.ArrayList;
import java.util.List;

import org.orange.metier.bean.Equipment;

public class HomeModel {
	private List<Equipment> listEquips=new ArrayList<>();
	private List<String> listTypes=new ArrayList<>();
	
	public List<Equipment> getListEquips() {
		return listEquips;
	}
	public void setListEquips(List<Equipment> listEquips) {
		this.listEquips = listEquips;
	}
	public List<String> getListTypes() {
		return listTypes;
	}
	public void setListTypes(List<String> listTypes) {
		this.listTypes = listTypes;
	} 
}
