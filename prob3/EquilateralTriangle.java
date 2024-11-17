package prob3;

public class EquilateralTriangle extends Triangle {
    private double side;

    public EquilateralTriangle(double side) {
        super(side, side, side);
        this.side = side;
        this.name = "Equilateral Triangle";
    }
}
