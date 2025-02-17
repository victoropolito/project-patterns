// VehicleBuilder.java (Builder)
// Constrói veículos personalizados passo a passo

public class VehicleBuilder {
    private String type;
    private String model;
    private String color;

    public VehicleBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public VehicleBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public VehicleBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public Vehicle build() {
        VehicleFactory factory = VehicleFactory.getInstance();
        return factory.createVehicle(type, model, color);
    }
}