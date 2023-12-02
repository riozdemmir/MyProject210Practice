package inheritance;

public class Dog extends Animals{

    public void bark(){
        System.out.println("Dogs bark..");
    }

    @Override
    public void eat() {
        System.out.println("Köpekler kemik yer..");
    }

    @Override
    public void drink() {
        System.out.println("Köpekler su içer..");
    }
}
