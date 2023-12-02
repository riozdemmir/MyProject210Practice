package inheritance;

public class Cat extends Animals{

    public void meaw(){
        System.out.println("Cats meaw..");
    }

    @Override
    public void eat() {
        System.out.println("Kediler balık yer..");
    }

    @Override
    public void drink() {
        System.out.println("Kediler süt içer..");
    }
}
