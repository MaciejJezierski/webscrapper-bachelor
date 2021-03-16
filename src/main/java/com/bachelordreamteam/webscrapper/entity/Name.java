package com.bachelordreamteam.webscrapper.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Name")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Name {
    @Id private int ID;
    private String name;

    public int getId() {
        return ID;
    }
    public void setId(int ID_Product) {
        this.ID = ID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}