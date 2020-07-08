package components;

public class CarBody extends Components {
    public CarBody(Double damage) {
        this.type = "Car Body";
        this.DoesItWork = damage < 50.00;
        this.priceIncrease = 0.50;
        this.damage = damage;
    }
}
