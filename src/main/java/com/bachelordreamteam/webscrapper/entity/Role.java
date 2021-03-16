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
public class Role {
    @Id private int ID;
    private String name;
}