package com.gwazasoftwares.models;

public class Vehicle {
    private String noPlate;
    private String color;
    private String model;
    private String type;

    public Vehicle() {
    }

    public Vehicle(String noPlate, String color, String model, String type) {
        this.noPlate = noPlate;
        this.color = color;
        this.model = model;
        this.type = type;
    }

    public String getNoPlate() {
        return noPlate;
    }

    public void setNoPlate(String noPlate) {
        this.noPlate = noPlate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "noPlate='" + noPlate + '\'' +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
