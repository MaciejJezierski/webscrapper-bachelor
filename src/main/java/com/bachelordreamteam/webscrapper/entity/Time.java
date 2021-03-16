package com.bachelordreamteam.webscrapper.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Time")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Time {
    @Id private int ID;
    private String link;

    public int getId() {
        return ID;
    }
    public void setId(int ID_Product) {
        this.ID = ID;
    }
    public String getName(String name) {
        return name;
    }
    public void setName(String name) {
        this.link = name;
    }
}