public class Main {
    public static void main(String[] args) {
        // Penggunaan kelas Animal
        Animal animal = new Animal();
        animal.sound(); // Output: Animal makes a sound
        animal.sound("dog"); // Output: Dog barks
        animal.sound("cat"); // Output: Cat meows
        animal.sound(7); // Output: Loud animal sound!

        // Penggunaan kelas Shape
        Shape shape = new Shape();
        shape.draw(); // Output: Drawing a shape

        Circle circle = new Circle();
        circle.draw(); // Output: Drawing a circle
    }
}
