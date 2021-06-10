package com.company.entity;

public class Plane {
    private int id;
    private String brand;
    private String model;
    private int number_Passenger;
    private int number ;

    public Plane(int id, String brand, String model, int number_Passenger, int number) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.number_Passenger = number_Passenger;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getNumberPassenger() {
        return number_Passenger;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", number_Passenger=" + number_Passenger +
                ", number=" + number +
                '}'+"\n";
    }
}
