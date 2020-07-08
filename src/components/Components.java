package components;

import vehicles.Vehicle;

import java.util.concurrent.ThreadLocalRandom;

public abstract class Components {
    String type;
    Boolean DoesItWork;
    Double priceIncrease;
    Double damage;

    public static void addComponents(Vehicle vehicle) {
        vehicle.componentsOfVehicle.add(new Brakes(ThreadLocalRandom.current().nextDouble(40.00, 100.00)));
        vehicle.componentsOfVehicle.add(new Dampers(ThreadLocalRandom.current().nextDouble(40.00, 100.00)));
        vehicle.componentsOfVehicle.add(new Engine(ThreadLocalRandom.current().nextDouble(40.00, 100.00)));
        vehicle.componentsOfVehicle.add(new CarBody(ThreadLocalRandom.current().nextDouble(40.00, 100.00)));
        vehicle.componentsOfVehicle.add(new Gearbox(ThreadLocalRandom.current().nextDouble(40.00, 100.00)));
    }
}
