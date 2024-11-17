package prob2;

public class Demo {
    public static void main(String[] args) {
        // Creating Point instance
        Point point = new Point(2.5f, 3.5f);
        System.out.println("\nPoint: " + point);

        // Creating MovablePoint instance
        MovablePoint movablePoint = new MovablePoint(2.5f, 3.5f, 1.0f, 1.5f);
        System.out.println("MovablePoint before move: " + movablePoint);

        // Moving the MovablePoint
        movablePoint.move();
        System.out.println("MovablePoint after move: " + movablePoint + "\n");
    }
}
