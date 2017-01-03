/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mariuszczarny.mysite.dto;

import java.io.Serializable;

/**
 *
 * @author Jaca
 */
public final class GenderDTO implements Serializable{
    private static final long serialVersionUID = 1L;
    private final int id;
    private final String name;

    public GenderDTO(int id, String name) {
            this.id = id;
            this.name = name;
    }

    public int getId() {
            return id;
    }

    public String getName() {
            return name;
    }

    @Override
    public String toString() {
        return "GenderDTO{" + "id=" + id + ", name=" + name + '}';
    }
    
}
