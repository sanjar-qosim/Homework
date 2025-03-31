package interfaces.zoo;

public class Fish implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Fish is silent...");
    }

    @Override
    public void move() {
        System.out.println("Fish is swimming");
    }
}
