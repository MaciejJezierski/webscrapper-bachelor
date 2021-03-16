package com.bachelordreamteam.webscrapper.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Comment")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    @Id private int ID;
    private String comment;

    public int getId() {
        return ID;
    }
    public void setId(int ID_Product) {
        this.ID = ID;
    }
    public String getComment() {
        return comment;
    }
    public void getComment(String comment) {
        this.comment = comment;
    }
}