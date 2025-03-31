package interfaces.zoo;

public class Bird implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Bird is tweeting");
    }

    @Override
    public void move() {
        System.out.println("Bird is flying");
    }
}
