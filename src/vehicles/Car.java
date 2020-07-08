package vehicles;

public class Car extends Vehicle {
    public Car(Double value, int mileage, String brand, String colour, String segment) {
        this.value = value;
        this.mileage = mileage;
        this.brand = brand;
        this.colour = colour;
        this.segment = segment;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", value=" + value +
                ", mileage=" + mileage +
                ", brand='" + brand + '\'' +
                ", colour='" + colour + '\'' +
                ", segment='" + segment + '\'' +
                ", componentsOfVehicle=" + componentsOfVehicle +
                '}';
    }
}
