package com.Medhanialem.jwtauthentication.model;



import java.util.Set;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Signup {
    @NotBlank
    @Size(min=3, max = 60)
    private String username;

    @NotBlank
    @Size(min = 6, max = 40)
    private String password;

    private Set<String> role;
    
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

	public Set<String> getRole() {
		return role;
	}

	public void setRole(Set<String> role) {
		this.role = role;
	}
    
}
