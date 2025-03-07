// Sphere class extending Shape and implementing Volume
class Sphere extends Shape implements Volume {
    private double radius;

    public Sphere(double radius) {
        super("Sphere");
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 0; // Perimeter is not applicable for a sphere
    }
}