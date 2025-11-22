package gen1.jv1.class411.class001;

public class Fish extends Animal {
    
    public Fish(String name, int age) {
        super(name, age);
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " makes bubbles: Blub blub");
    }
    
    @Override
    public void move() {
        System.out.println(name + " swims with fins");
    }
    
    @Override
    public String getSpecies() {
        return "Fish";
    }
}
