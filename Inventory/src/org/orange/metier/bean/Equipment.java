package org.orange.metier.bean;

import java.io.Serializable;
import java.util.Date;

public class Equipment implements Serializable{
	
	public Equipment() {
		super();
	}
	public Equipment(String typeEquipment, String constructorEquipment,
			String modelEquipment, String snEquipment, String pnEquipment,
			String licenseEquipment, String localisationEquipment,
			String supervisorEquipment, String statutEquipment,
			String adressIpEquipment, String nameEquipment,
			String proprietaryEquipment, String accessoriesEquipment,
			Date dateEquipment) {
		super();
		this.typeEquipment = typeEquipment;
		this.constructorEquipment = constructorEquipment;
		this.modelEquipment = modelEquipment;
		this.snEquipment = snEquipment;
		this.pnEquipment = pnEquipment;
		this.licenseEquipment = licenseEquipment;
		this.localisationEquipment = localisationEquipment;
		this.supervisorEquipment = supervisorEquipment;
		this.statutEquipment = statutEquipment;
		this.adressIpEquipment = adressIpEquipment;
		this.nameEquipment = nameEquipment;
		this.proprietaryEquipment = proprietaryEquipment;
		AccessoriesEquipment = accessoriesEquipment;
		this.dateEquipment = dateEquipment;
	}
	public Long getIdEquipment() {
		return idEquipment;
	}
	public void setIdEquipment(Long idEquipment) {
		this.idEquipment = idEquipment;
	}
	public String getTypeEquipment() {
		return typeEquipment;
	}
	public void setTypeEquipment(String typeEquipment) {
		this.typeEquipment = typeEquipment;
	}
	public String getConstructorEquipment() {
		return constructorEquipment;
	}
	public void setConstructorEquipment(String constructorEquipment) {
		this.constructorEquipment = constructorEquipment;
	}
	public String getModelEquipment() {
		return modelEquipment;
	}
	public void setModelEquipment(String modelEquipment) {
		this.modelEquipment = modelEquipment;
	}
	public String getSnEquipment() {
		return snEquipment;
	}
	public void setSnEquipment(String snEquipment) {
		this.snEquipment = snEquipment;
	}
	public String getPnEquipment() {
		return pnEquipment;
	}
	public void setPnEquipment(String pnEquipment) {
		this.pnEquipment = pnEquipment;
	}
	public String getLicenseEquipment() {
		return licenseEquipment;
	}
	public void setLicenseEquipment(String licenseEquipment) {
		this.licenseEquipment = licenseEquipment;
	}
	public String getLocalisationEquipment() {
		return localisationEquipment;
	}
	public void setLocalisationEquipment(String localisationEquipment) {
		this.localisationEquipment = localisationEquipment;
	}
	public String getSupervisorEquipment() {
		return supervisorEquipment;
	}
	public void setSupervisorEquipment(String supervisorEquipment) {
		this.supervisorEquipment = supervisorEquipment;
	}
	public String getStatutEquipment() {
		return statutEquipment;
	}
	public void setStatutEquipment(String statutEquipment) {
		this.statutEquipment = statutEquipment;
	}
	public String getAdressIpEquipment() {
		return adressIpEquipment;
	}
	public void setAdressIpEquipment(String adressIpEquipment) {
		this.adressIpEquipment = adressIpEquipment;
	}
	public String getNameEquipment() {
		return nameEquipment;
	}
	public void setNameEquipment(String nameEquipment) {
		this.nameEquipment = nameEquipment;
	}
	public String getProprietaryEquipment() {
		return proprietaryEquipment;
	}
	public void setProprietaryEquipment(String proprietaryEquipment) {
		this.proprietaryEquipment = proprietaryEquipment;
	}
	public String getAccessoriesEquipment() {
		return AccessoriesEquipment;
	}
	public void setAccessoriesEquipment(String accessoriesEquipment) {
		AccessoriesEquipment = accessoriesEquipment;
	}
	public Date getDateEquipment() {
		return dateEquipment;
	}
	public void setDateEquipment(Date dateEquipment) {
		this.dateEquipment = dateEquipment;
	}
	private Long idEquipment;
	private String typeEquipment;
	private String constructorEquipment;
	private String modelEquipment;
	private String snEquipment;
	private String pnEquipment;
	private String licenseEquipment;
	private String localisationEquipment;
	private String supervisorEquipment;
	private String statutEquipment;
	private String adressIpEquipment;
	private String nameEquipment;
	private String proprietaryEquipment;
	private String AccessoriesEquipment;
	private Date dateEquipment;
	
}
