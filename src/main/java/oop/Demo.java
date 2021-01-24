package oop;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.bark();
        dog.eat();

        feedAnimal(dog);
        feedAnimal(cat);

        List<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);
    }

    public static void feedAnimal(Animal animal) {
        System.out.println("Karmie zwierze");
        animal.eat();
        animal.makeSound();
//        Dog dog = (Dog) animal;
//        dog.bark();
    }




}
