package inheritance;

public class Main {


    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal1 = new Cat();
        Cat cat = new Cat();
        Bird bird = new Bird();
        animal.printName();
        animal1.printName();
        cat.printName();
        bird.printName();

    }
}
