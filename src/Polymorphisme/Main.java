package Polymorphisme;

class Animal {
    public void makeSound(){
        System.out.println("has sound");
    }
}

class Cat extends Animal{
    public void makeSound(){
        System.out.println("Mew Mew");
    }

}
class Dog extends Animal{
    public void makeSound(){
        System.out.println("how how");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal c1 = new Cat();
        Animal d1 = new Dog();
        c1.makeSound();
        d1.makeSound();
    }
}