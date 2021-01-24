package oop;

public class Dog extends Animal{

    public void bark() {
        System.out.println("Hau!");
    }

    @Override
    public void makeSound() {
        bark();
    }
}
