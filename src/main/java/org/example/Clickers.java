package org.example;

public class Clickers extends Products{
    private Types type_cl;
    public Clickers(String name, double cena, Types type_cl){
        super(name, cena);
        this.type_cl = type_cl;
    }
    public Types getType_cl(){
        return type_cl;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + " type: %s", type_cl);
    }
}
