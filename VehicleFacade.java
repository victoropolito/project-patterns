// VehicleFacade.java
// Simplifica a criação e personalização de veículos.

public class VehicleFacade {
    private VehicleBuilder builder;

    public VehicleFacade() {
        builder = new VehicleBuilder();
    }
    
    // Neste caso, passa como parâmetro um 'boolean' para saber se o carro é elétrico
    public Vehicle createCustomVehicle(String type, String model, String color, boolean isElectric) {
        Vehicle vehicle = builder.setType(type).setModel(model).setColor(color).build();
        if (isElectric) {
            vehicle = new ElectricVehicleDecorator(vehicle);
        }
        return vehicle;
    }
}
