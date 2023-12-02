package inheritance;

public class AnaimalsRunner {
    public static void main(String[] args) {

        Cat c1=new Cat();
        c1.meaw();
        c1.eat();
        c1.drink();
        System.out.println("------------------");
        Dog d1=new Dog();
        d1.bark();
        d1.drink();
        d1.eat();

    }
}
