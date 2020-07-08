package components;

public class Engine extends Components {
    public Engine(Double damage) {
        this.type = "Engine";
        this.DoesItWork = damage < 50.00;
        this.priceIncrease = 1.0;
        this.damage = damage;
    }
}
