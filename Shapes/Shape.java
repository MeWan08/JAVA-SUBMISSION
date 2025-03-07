// Abstract class representing a Shape
abstract class Shape {
    protected String shapeName;

    // Non-abstract method
    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    // Abstract methods
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}