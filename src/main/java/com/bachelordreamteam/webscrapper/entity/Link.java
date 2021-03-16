package com.bachelordreamteam.webscrapper.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Link")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Link {
    @Id private int ID;
    private String link;

    public int getId() {
        return ID;
    }
    public void setId(int ID_Product) {
        this.ID = ID;
    }
    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }
}