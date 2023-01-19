package org.example;

public class Products {
    private String name;
    private double cena;
    public Products(String name, double cena){
        this.name = name;
        this.cena = cena;
    }

    public String getName(){
        return name;
    }

    public double getCena(){
        return cena;
    }

    @Override
    public String toString() {
        return String.format("name = %s, cena = %f ", name, cena);
    }
}
