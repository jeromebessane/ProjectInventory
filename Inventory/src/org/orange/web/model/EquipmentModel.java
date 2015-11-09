package org.orange.web.model;

import java.util.ArrayList;
import java.util.List;

import org.orange.metier.bean.Equipment;

public class EquipmentModel {
	
	private String tag;
	private List<Equipment> listEquips=new ArrayList<>();
	private List<List<String>> listFilter=new ArrayList<>();
	private List<String> listFilterConstructorUsed=new ArrayList<>();
	private List<String> listFilterTypeUsed=new ArrayList<>();
	private List<String> listFilterStatusUsed=new ArrayList<>();
	private List<String> listFilterLocalisationUsed=new ArrayList<>();
	
	public List<String> getListFilterConstructorUsed() {
		return listFilterConstructorUsed;
	}
	public void setListFilterConstructorUsed(List<String> listFilterConstructorUsed) {
		this.listFilterConstructorUsed = listFilterConstructorUsed;
	}
	public List<String> getListFilterTypeUsed() {
		return listFilterTypeUsed;
	}
	public void setListFilterTypeUsed(List<String> listFilterTypeUsed) {
		this.listFilterTypeUsed = listFilterTypeUsed;
	}
	public List<String> getListFilterStatusUsed() {
		return listFilterStatusUsed;
	}
	public void setListFilterStatusUsed(List<String> listFilterStatusUsed) {
		this.listFilterStatusUsed = listFilterStatusUsed;
	}
	public List<String> getListFilterLocalisationUsed() {
		return listFilterLocalisationUsed;
	}
	public void setListFilterLocalisationUsed(
			List<String> listFilterLocalisationUsed) {
		this.listFilterLocalisationUsed = listFilterLocalisationUsed;
	}
	public List<List<String>> getListFilter() {
		return listFilter;
	}
	public void setListFilter(List<List<String>> listFilter) {
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
