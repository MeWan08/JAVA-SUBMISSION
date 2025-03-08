// MallardDuck class
public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new Fly();
        swimBehavior = new Swim();
    }
}