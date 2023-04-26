package inheritance;

public class Animal {
    public static void printName() {
        System.out.println("animal");
    }
    private void canNotBeOverride(){
        System.out.println("can not override private method");
    }
}
