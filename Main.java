/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main {
    public static void main(String[] args) {
        // Chain of Responsibility
        Vehicle car = new Car("Sedan", "Red");
        ApprovalHandler safetyApproval = new SafetyApproval();
        ApprovalHandler emissionApproval = new EmissionApproval();

        safetyApproval.setNextHandler(emissionApproval);
        safetyApproval.approve(car);

        // State Pattern
        VehicleContext vehicleContext = new VehicleContext();
        vehicleContext.applyState();  // Stopped by default
        vehicleContext.setState(new MovingState());
        vehicleContext.applyState();  // Now moving

        // Observer Pattern
        VehicleSubject vehicle = new VehicleSubject();
        MonitoringSystem monitor = new MonitoringSystem();

        vehicle.addObserver(monitor);
        vehicle.setState("Moving");
        vehicle.setState("Stopped");
    }
}