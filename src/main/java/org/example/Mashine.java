package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.SimpleTimeZone;

public class Mashine {
    private List<Products> productsList;

    public Mashine(List<Products> productsList) {
        this.productsList = productsList;
    }

    public List<Products> getProductsList(){
        return productsList;
    }
    public Products getProductsByName(String name){
        for(Products products : productsList){
            if(products.getName().contains(name)){
                return products;
            }
        }
        return null;
    }

    public Products getProductsByCena(double cena){
        for(Products products : productsList){
            if(products.getCena() == cena){
                return products;
            }
        }
        return null;
    }

    public Mashine(){
        this.productsList = new ArrayList<Products>();
    }

}
