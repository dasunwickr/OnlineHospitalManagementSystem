package com.ohms.model.pharmacy;

public class Pharmacist {
	
	private int id;
    private String username;
    private String password;
    private String name;
    private String degree;
    private String remarks;
    private String affiliatedInstitute;
    private String certifications;
    private String contactInformation;

	public Pharmacist() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getAffiliatedInstitute() {
		return affiliatedInstitute;
	}

	public void setAffiliatedInstitute(String affiliatedInstitute) {
		this.affiliatedInstitute = affiliatedInstitute;
	}

	public String getCertifications() {
		return certifications;
	}

	public void setCertifications(String certifications) {
		this.certifications = certifications;
	}

	public String getContactInformation() {
		return contactInformation;
	}

	public void setContactInformation(String contactInformation) {
		this.contactInformation = contactInformation;
	}
	
	
	
	

}
