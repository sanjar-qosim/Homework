package interfaces.zoo;

public class Dog implements Animal{
    @Override
    public void makeSound() {
        System.out.println("Dog is barking");
    }

    @Override
    public void move() {
        System.out.println("Dog us running");
    }
}
