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

    // Display shape details
    public void displayShape() {
        System.out.println("\nShape: " + shapeName);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}