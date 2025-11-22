package gen1.jv1.class411.class001;

public abstract class Animal {
    protected String name;
    protected int age;
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public abstract void makeSound();
    public abstract void move();
    public abstract String getSpecies();
    
    public void displayInfo() {
        System.out.println(name + " is a " + age + " year old " + getSpecies());
    }
}
