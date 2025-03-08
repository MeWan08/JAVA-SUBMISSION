// DecoyDuck class
public class DecoyDuck extends Duck {
    public DecoyDuck() {
        flyBehavior = new NotFly();
        swimBehavior = new Drown();
    }

    @Override
    public void display() {
        System.out.println("I am a Decoy Duck.");
    }
}