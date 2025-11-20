package gen1.jv1.class411.animals;

public class Dog extends Animal {
    
    public Dog(String name, int age) {
        super(name, age);
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " barks: Woof! Woof!");
    }
    
    @Override
    public void move() {
        System.out.println(name + " runs on four legs");
    }
    
    @Override
    public String getSpecies() {
        return "Dog";
    }
}
