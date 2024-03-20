//overloading

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Addition of 5 and 3: " + calculator.add(5, 3));
        System.out.println("Addition of 4.5 and 2.5: " + calculator.add(4.5, 2.5));
        System.out.println("Addition of 2, 3, and 4: " + calculator.add(2, 3, 4));
    }
}