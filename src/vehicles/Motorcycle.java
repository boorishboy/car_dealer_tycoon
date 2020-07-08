package vehicles;

public class Motorcycle extends Vehicle{
        public Motorcycle(Integer id, Double value, Integer mileage, String colour, String segment) {
            this.id = id;
            this.value = value;
            this.mileage = mileage;
            this.colour = colour;
            this.segment = segment;
            }

    @Override
    public String toString() {
        return "Motorcycle{" +
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