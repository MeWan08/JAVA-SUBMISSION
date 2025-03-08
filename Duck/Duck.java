// Abstract Duck class
public abstract class Duck {
    FlyBehavior flyBehavior;
    SwimBehavior swimBehavior;
    public void performFly() {
        flyBehavior.fly();
    }

    public void performSwim() {
        swimBehavior.swim();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setSwimBehavior(SwimBehavior sb) {
        swimBehavior = sb;
    }
}