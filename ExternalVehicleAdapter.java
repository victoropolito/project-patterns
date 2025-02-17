// ExternalVehicleAdapter.java (Adapter para integrar ao sistema)
// Adapta um veículo externo para ser compatível com o sistema.

public class ExternalVehicleAdapter implements Vehicle {
    private ExternalVehicle externalVehicle;

    public ExternalVehicleAdapter(ExternalVehicle externalVehicle) {
        this.externalVehicle = externalVehicle;
    }

    @Override
    public void drive() {
        externalVehicle.move();
    }
}