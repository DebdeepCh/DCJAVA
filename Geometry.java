 import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        Square s = new Square();
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        s.acceptInput();
        s.compute();
        s.disp();

        r.acceptInput();
        r.compute();
        r.disp();

        c.acceptInput();
        c.compute();
        c.disp();

    }
}

// rectangle class
class Rectangle {

    float length;
    float breadth;
    float area;

    public void acceptInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF RECTANGLE : ");
        length = sc.nextFloat();
        System.out.println("ENTER THE BREADTH OF RECTANGLE : ");
        breadth = sc.nextFloat();

    }

    public void compute() {
        area = length * breadth;
    }

    public void disp() {
        System.out.println("THE AREA OF RECTANGLE  IS : " + area);
    }
}

// square class
class Square {
    float length;
    float area;

    public void acceptInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF SQUARE : ");
        length = sc.nextFloat();

    }

    public void compute() {
        area = length * length;
    }

    public void disp() {
        System.out.println("THE AREA OF SQUARE IS : " + area);
    }

}
// circle class

class Circle {
    float radius;
    float area;

    public void acceptInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE RADIUS OF CIRCLE : ");
        radius = sc.nextFloat();

    }

    public void compute() {
        area = 3.14f * radius * radius;
    }

    public void disp() {
        System.out.println("THE AREA OF CIRCLE  IS : " + area);
    }
    
}
    
