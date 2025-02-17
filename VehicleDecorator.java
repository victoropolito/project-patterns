// VehicleDecorator.java
// Classe abstrata que permite "decorar" veículos com funcionalidades extras

public abstract class VehicleDecorator implements Vehicle {
    protected Vehicle decoratedVehicle;

    public VehicleDecorator(Vehicle vehicle) {
        this.decoratedVehicle = vehicle;
    }

    public void drive() {
        decoratedVehicle.drive();
    }
}