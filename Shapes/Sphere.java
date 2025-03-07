// Sphere class extending Shape and implementing Volume
class Sphere extends Shape implements Volume {
    private double radius;

    public Sphere(double radius) {
        super("Sphere");
        this.radius = radius;
    }

}