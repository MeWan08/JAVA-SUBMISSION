// RubberDuck class
public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new NotFly();
        swimBehavior = new Float();
    }
}