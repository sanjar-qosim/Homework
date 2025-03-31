package interfaces.zoo;

public class TestAnimals {

    public static void main(String[] args) {
        Animal [] animals = {new Dog(), new Bird(), new Fish()};

        for (Animal tmp : animals) {
            tmp.makeSound();
            tmp.move();
        }
    }
}
