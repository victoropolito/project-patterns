// VehicleFactory.java (Singleton)
// Responsável por criar veículos do tipo Carro ou Moto

public class VehicleFactory {
    private static VehicleFactory instance;

    private VehicleFactory() {}

    public static VehicleFactory getInstance() {
        if (instance == null) {
            instance = new VehicleFactory();
        }
        return instance;
    }

    public Vehicle createVehicle(String type, String model, String color) {
        if (type.equalsIgnoreCase("car")) {
            return new Car(model, color);
        } else if (type.equalsIgnoreCase("motorcycle")) {
            return new Motorcycle(model, color);
        }
        return null;
    }
}