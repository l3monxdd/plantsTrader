package com.plants.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Stage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int number;

    public Stage() {
    }

    public Stage(int number) {
        this.number = number;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Stage{" +
                "id=" + id +
                ", number=" + number +
                '}';
    }
}
