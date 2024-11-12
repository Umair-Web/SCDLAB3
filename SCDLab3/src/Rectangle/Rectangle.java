package Rectangle;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0.0 && length < 20.0) {
            this.length = length;
        } else {
            throw new IllegalArgumentException("Length must be > 0.0 and < 20.0");
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0) {
            this.width = width;
        } else {
            throw new IllegalArgumentException("Width must be > 0.0 and < 20.0");
        }
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public double calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.5, 3.5);

        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.printf("Perimeter: %.2f\n", rectangle.calculatePerimeter());
        System.out.printf("Area: %.2f\n", rectangle.calculateArea());

        // Test setting new values
        rectangle.setLength(10.0);
        rectangle.setWidth(4.0);

        System.out.println("\nAfter setting new values:");
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.printf("Perimeter: %.2f\n", rectangle.calculatePerimeter());
        System.out.printf("Area: %.2f\n", rectangle.calculateArea());
    }
}

