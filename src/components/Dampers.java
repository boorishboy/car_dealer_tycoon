package components;

public class Dampers extends Components {
    public Dampers(Double damage) {
        this.type = "Dampers";
        this.DoesItWork = damage < 50.00;
        this.priceIncrease = 0.2;
        this.damage = damage;
    }
}
