package com.Medhanialem.jwtauthentication.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name="passwordResetEntity")
public class PasswordResetTokenEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5920855467904033060L;
@Id
@GeneratedValue
private long id;	

private String token;

@OneToOne
@JoinColumn(name="user_id")
private User userDetails;

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getToken() {
	return token;
}

public void setToken(String token) {
	this.token = token;
}

public User getUserDetails() {
	return userDetails;
}

public void setUserDetails(User userDetails) {
	this.userDetails = userDetails;
}


	
}
