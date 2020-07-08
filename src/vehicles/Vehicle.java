package vehicles;
import components.Components;
import java.util.ArrayList;

public abstract class Vehicle {
    int id;
    double value;
    long mileage;
    String brand;
    String colour;
    String segment;
    public ArrayList<Components> componentsOfVehicle;
}
