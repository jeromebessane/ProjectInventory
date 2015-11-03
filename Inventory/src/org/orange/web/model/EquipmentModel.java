package org.orange.web.model;

import java.util.ArrayList;
import java.util.List;

import org.orange.metier.bean.Equipment;

public class EquipmentModel {
	
	private String tag;
	private List<Equipment> listEquips=new ArrayList<>();
	private List<List<String>> listFilter=new ArrayList<>();
	
	public List<List<String>> getListFilter() {
		return listFilter;
	}
	public void setListFilterr(List<List<String>> listFilter) {
		this.listFilter = listFilter;
	}
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
