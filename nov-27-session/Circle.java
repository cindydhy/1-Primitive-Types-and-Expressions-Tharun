public class Circle {
    double r;
    
    public Circle(double r) {
        this.r = r;
    }

    public double area() {
        double area = Math.PI * Math.pow(this.r, 2);
        return area;
    }

    public double circumference() {
        return 2 * Math.PI * r;
    }

    public double getRadius() {
        return r;
    }

    public String toString() {
        return "Circle(radius = " + r +" )";
    }
}