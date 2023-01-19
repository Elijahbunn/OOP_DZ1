package org.example;

public class Main {
    public static void main(String[] args) {
        Mashine mashine = new Mashine();
        mashine.getProductsList().add(new Products("mause", 300));
        mashine.getProductsList().add(new Products("monitor", 10000));
        mashine.getProductsList().add(new Products("processor", 15000));
        mashine.getProductsList().add(new Clickers("clava coka", 3000, Types.OFICE));
        mashine.getProductsList().add(new Videocards("GIGABITE", 3000, "GeForce RTX 3090"));
        for(Products products : mashine.getProductsList()){
            System.out.println(products);
        }
        System.out.println(mashine.getProductsByName("mause"));
    }
}