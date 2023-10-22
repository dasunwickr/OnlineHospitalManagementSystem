package com.ohms.model.pharmacy;  // Replace with the appropriate package

public class Pharmacist {
    private String username;
    private String password;

    public Pharmacist() {
		super();
	}

	public Pharmacist(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getters and setters
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
}
