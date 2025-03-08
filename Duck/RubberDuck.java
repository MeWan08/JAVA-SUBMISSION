// RubberDuck class
public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new NotFly();
        swimBehavior = new Float();
    }

    @Override
    public void display() {
        System.out.println("I am a Rubber Duck.");
    }
}