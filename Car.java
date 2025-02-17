// Car.java
// Implementação concreta de um veículo do tipo carro

public class Car implements Vehicle {
    private String model;
    private String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public void drive() {
        System.out.println("Driving a " + color + " " + model + " car.");
    }
}