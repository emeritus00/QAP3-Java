package prob4;

public class Demo {
    public static void main(String[] args) {
        // Create an array of shapes
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Ellipse(7.0, 4.0);
        shapes[2] = new Triangle(3.0, 4.0, 5.0);
        shapes[3] = new EquilateralTriangle(6.0);

        // Print shapes before scaling
        System.out.println("\nShapes before scaling:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        // Scale shapes
        scaleShapes(shapes, 2.0);

        // Print shapes after scaling
        System.out.println("\nShapes after scaling:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }

    // Method to scale all shapes in the array
    public static void scaleShapes(Scalable[] scalables, double factor) {
        for (Scalable scalable : scalables) {
            scalable.scale(factor);
        }
    }
}

