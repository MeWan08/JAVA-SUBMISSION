// RedheadDuck class
public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        flyBehavior = new Fly();
        swimBehavior = new Swim();
    }

    @Override
    public void display() {
        System.out.println("I am a Redhead Duck.");
    }
}