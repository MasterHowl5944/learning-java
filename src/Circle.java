import java.lang.Math;
public class Circle {
    double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double circleCirc() {
        return 2 * Math.PI * this.radius;
    }
    public double circleArea() {
        return Math.PI * (this.radius * this.radius);
    }
}