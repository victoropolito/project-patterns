// Motorcycle.java
// Implementação concreta de um veículo do tipo moto

public class Motorcycle implements Vehicle {
    private String model;
    private String color;

    public Motorcycle(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public void drive() {
        System.out.println("Riding a " + color + " " + model + " motorcycle.");
    }
}