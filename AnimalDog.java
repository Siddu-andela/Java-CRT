class Animal{
    void makeSound(){
        System.out.println("animals language is not understand");
    }

}
class Dog extends Animal{
    void makeSound(){
        System.out.println("dog make sound like Bark! Bark!");
    }

}
public class AnimalDog {
    public static void main(String[] args) {
        Dog dog= new Dog();
        dog.makeSound();
    }
    
}