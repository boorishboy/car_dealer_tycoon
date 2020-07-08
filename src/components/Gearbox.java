package components;

public class Gearbox extends Components {
    public Gearbox(Double damage) {
        this.type = "Gearbox";
        this.DoesItWork = damage < 50.00;
        this.priceIncrease = 0.50;
        this.damage = damage;
    }
}
