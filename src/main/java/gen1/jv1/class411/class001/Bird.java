package gen1.jv1.class411.class001;

public class Bird extends Animal {
    
    public Bird(String name, int age) {
        super(name, age);
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " chirps: Tweet! Tweet!");
    }
    
    @Override
    public void move() {
        System.out.println(name + " flies with wings");
    }
    
    @Override
    public String getSpecies() {
        return "Bird";
    }
}
