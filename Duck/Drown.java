// Drown class implementing SwimBehavior
public class Drown implements SwimBehavior {
    @Override
    public void swim() {
        System.out.println("This duck cannot swim and will drown.");
    }
}