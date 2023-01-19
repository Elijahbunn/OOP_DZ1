package org.example;

public class Videocards extends Products{
    private String processor;
    public Videocards(String name, double cena, String processor) {
        super(name, cena);
        this.processor = processor;
    }

    public String getProcessor() {
        return processor;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + "processor= %s", processor);
    }
}
