import java.lang.Math;
public class Circle {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double circleCirc() {
        double circleCirc = 2 * Math.PI * radius;
        return circleCirc;
        // System.out.println("The circumference of this circle is: " + circleCirc);
    }
    public double circleArea() {
        double circleArea = Math.PI * (radius * radius);
        System.out.println("The area of this circle is: " + circleArea);
        return circleArea;
    }
    public Circle() {
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
}