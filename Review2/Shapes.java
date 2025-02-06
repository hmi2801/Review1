public class Shapes {
    long area;
    private String shapeName;

    Shapes() {
        System.out.println("Shapes constructor called!!");
    }

    long calArea1(double base, double height) {
        return (long) (0.5 * base * height);
    }

    long calArea2(double radius) {
        return (long) (Math.PI * radius * radius);
    }

    public static void main(String[] args) {
        Triangle t = new Triangle(5, 10);
        System.out.println();
        Circle c = new Circle(7);
    }
}

class Triangle extends Shapes {
    double base;
    double height;

    Triangle() {
        System.out.println("Triangle constructor called!!");
    }

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
        System.out.println("Area of Triangle : " + calArea1(base, height));
    }
}

class Circle extends Shapes {
    double radius;

    Circle() {
        System.out.println("Circle constructor called");
    }

    Circle(double radius) {
        this.radius = radius;
        System.out.println("Area of Circle : " + calArea2(radius));
    }
}


