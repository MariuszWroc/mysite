/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mariuszczarny.mysite.dto.web;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotBlank;


/**
 *
 * @author mariusz
 */
public class LoginDTO implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @NotBlank
    private String username;
    @NotBlank
    private String password;
    
    
    public LoginDTO(){
        
    }

	public LoginDTO(String username, String password) {
		this.username = username;
		this.password = password;
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

    @Override
    public String toString() {
        return "LoginDTO{" + "username=" + username + ", password=" + password + '}';
    }
    
}
