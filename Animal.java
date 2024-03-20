class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }

    public void sound(String type) {
        if (type.equalsIgnoreCase("dog")) {
            System.out.println("Dog barks");
        } else if (type.equalsIgnoreCase("cat")) {
            System.out.println("Cat meows");
        } else {
            System.out.println("Unknown animal sound");
        }
    }

    public void sound(int intensity) {
        if (intensity > 5) {
            System.out.println("Loud animal sound!");
        } else {
            System.out.println("Soft animal sound");
        }
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound(); // Animal makes a sound
        animal.sound("dog"); // Dog barks
        animal.sound("cat"); // Cat meows
        animal.sound(7); // Loud animal sound!
    }
}
