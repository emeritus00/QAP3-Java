package prob2;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    // Constructors
    public Point() {}

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Getter and Setter for x
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    // Getter and Setter for y
    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    // Method to set both x and y
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Method to get x and y as an array
    public float[] getXY() {
        return new float[]{x, y};
    }

    // toString method
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
