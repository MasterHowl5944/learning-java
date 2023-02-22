import java.util.Scanner;
public class Shapes {
    public static void main(String[] args) {
        Triangle triangleA = new Triangle(15, 8, 15, 8, 17);
        Triangle triangleB = new Triangle(3, 2.598, 3,3,3);
        triangleA.triangleArea();
        triangleB.triangleArea();
        Circle circleA = new Circle(5);
        Circle circleB = new Circle(9.5);
        circleA.circleCirc();
        circleA.circleArea();
        circleB.circleCirc();
        circleB.circleArea();
        Triangle triangleC = new Triangle();
        System.out.println("What is the length of the base?");
        Scanner input = new Scanner(System.in);
        triangleC.setBase(input.nextDouble());
        System.out.println("What is the height?");
        triangleC.setHeight(input.nextDouble());
        triangleC.triangleArea();
    }
}