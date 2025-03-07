// EquilateralPyramid class extending Shape and implementing Volume
class EquilateralPyramid extends Shape implements Volume {
    private double baseEdge;
    private double height;

    public EquilateralPyramid(double baseEdge, double height) {
        super("Equilateral Pyramid (Square Base)");
        this.baseEdge = baseEdge;
        this.height = height;
    }
}