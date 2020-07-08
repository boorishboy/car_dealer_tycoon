package vehicles;

public class Truck extends Vehicle {

    Double max_load_capacity;

    public Truck(Double value, int mileage, String brand, String colour, String segment, Double maxLoad) {
        this.value = value;
        this.mileage = mileage;
        this.brand = brand;
        this.colour = colour;
        this.segment = segment;
        this.max_load_capacity = maxLoad;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "max_load_capacity=" + max_load_capacity +
                ", id=" + id +
                ", value=" + value +
                ", mileage=" + mileage +
                ", brand='" + brand + '\'' +
                ", colour='" + colour + '\'' +
                ", segment='" + segment + '\'' +
                ", componentsOfVehicle=" + componentsOfVehicle +
                '}';
    }
}
