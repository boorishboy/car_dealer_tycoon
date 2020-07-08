package components;

public class Brakes extends Components {
    public Brakes(Double damage) {
        this.type = "Brakes";
        this.DoesItWork = damage < 20.00;
        this.priceIncrease = 0.1;
        this.damage = damage;
    }
}
