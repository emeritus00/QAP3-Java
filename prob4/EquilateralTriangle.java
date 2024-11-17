package prob4;

public class EquilateralTriangle extends Triangle {
    private double side;

    public EquilateralTriangle(double side) {
        super(side, side, side);
        this.side = side;
        this.name = "Equilateral Triangle";
    }

    @Override
    public void scale(double factor) {
        side *= factor;
        super.side1 = side;
        super.side2 = side;
        super.side3 = side;
    }
}

