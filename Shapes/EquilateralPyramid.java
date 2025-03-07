// EquilateralPyramid class extending Shape and implementing Volume
class EquilateralPyramid extends Shape implements Volume {
    private double baseEdge;
    private double height;

    public EquilateralPyramid(double baseEdge, double height) {
        super("Equilateral Pyramid (Square Base)");
        this.baseEdge = baseEdge;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        double baseArea = baseEdge * baseEdge;
        double slantHeight = Math.sqrt(Math.pow(height, 2) + Math.pow(baseEdge / 2, 2));
        double lateralArea = 4 * (0.5 * baseEdge * slantHeight);
        return baseArea + lateralArea;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * baseEdge;
    }

    @Override
    public double calculateVolume() {
        return (1.0 / 3.0) * Math.pow(baseEdge, 2) * height;
    }

    @Override
    public void displayShape() {
        super.displayShape();
        System.out.println("Volume: " + calculateVolume());
    }
}