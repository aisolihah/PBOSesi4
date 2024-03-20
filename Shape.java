class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    public void draw(int radius) {
        System.out.println("Drawing a circle with radius " + radius);
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        shape1.draw(); // Mengakses overriding method
        Circle circle = new Circle();
        circle.draw(5); // Mengakses overloading method
        
  }
}