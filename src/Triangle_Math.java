import java.util.Scanner;
public class Triangle_Instances {
    public static void main(String[] args) {
        Triangle triangleA = new Triangle(15, 8, 15, 8, 17);
        Triangle triangleB = new Triangle(3, 2.598, 3,3,3);
        double triangleAArea = triangleA.triangleArea();
        System.out.println("The Area of Triangle A is: " + triangleAArea);
        double triangleBArea = triangleB.triangleArea();
        System.out.println("The Area of Triangle B is: " + triangleBArea);
        Circle circleA = new Circle(15);
        Circle circleB = new Circle(19.5);
        double circleAArea = circleA.circleArea();
        System.out.println("The Area of Circle A is: " + circleAArea);
        double circleACircumference = circleA.circleCirc();
        System.out.println("The Circumference of Circle A is: " + circleACircumference);
        double circleBArea = circleB.circleArea();
        System.out.println("The Area of Circle B is: " + circleBArea);
        double circleBCircumference = circleB.circleCirc();
        System.out.println("The Circumference of Circle B is: " + circleBCircumference);
        Triangle triangleC = new Triangle();
        System.out.println("What is the length of the base?");
        Scanner input = new Scanner(System.in);
        triangleC.base = input.nextDouble();
        System.out.println("Triangle C's base length is: " + triangleC.base);
        System.out.println("What is the height?");
        triangleC.height = input.nextDouble();
        System.out.println("Triangle C's height is: " + triangleC.height);
        System.out.println("The Area of Triangle C is: " + triangleC.triangleArea());
    }
}