package com.uninter.model.entities;

public class Player {

    private Integer id;
    private String name;


    public Player(String name) {
        this.name = name;
        id = getNextId();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() { return id; }

    private static int nextId = 0;

    private static int getNextId() {
        return nextId++;
    }
}
