// DecoyDuck class
public class DecoyDuck extends Duck {
    public DecoyDuck() {
        flyBehavior = new NotFly();
        swimBehavior = new Drown();
    }
}