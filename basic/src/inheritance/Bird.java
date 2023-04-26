package inheritance;

public class Bird extends Animal{

    public static void printName(){
        Animal.printName();
        System.out.println("bird");
    }
    private void canNotBeOverride(){
        System.out.println("bird override");
    }
}
