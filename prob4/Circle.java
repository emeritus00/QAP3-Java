package prob4;

public class Circle extends Ellipse {
    private double radius;

    public Circle(double radius) {
        super(radius, radius);
        this.radius = radius;
        this.name = "Circle";
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void scale(double factor) {
        radius *= factor;
    }
}

