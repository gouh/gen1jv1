package gen1.jv1.class411.class001;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
            new Dog("Buddy", 3),
            new Bird("Tweety", 1),
            new Fish("Nemo", 2)
        };
        
        for (Animal animal : animals) {
            animal.displayInfo();
            animal.makeSound();
            animal.move();
            System.out.println();
        }
    }
}
