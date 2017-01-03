/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mariuszczarny.mysite.dto.general;

import java.io.Serializable;

/**
 *
 * @author Jaca
 */
public final class ProfessionDTO implements Serializable{
    private static final long serialVersionUID = 1L;
    
    	private final int id;
	private final String name;
	private final int startMoney;

    public ProfessionDTO() {
        this.id = 0;
        this.name = null;
        this.startMoney = 0;
    }
       

	public int getStartMoney() {
		return startMoney;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

    @Override
    public String toString() {
        return "ProfessionDTO{" + "id=" + id + ", name=" + name + ", startMoney=" + startMoney + '}';
    }
        
}
