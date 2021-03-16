package com.bachelordreamteam.webscrapper.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Reference;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Product")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id private int ID;
    public String name;


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