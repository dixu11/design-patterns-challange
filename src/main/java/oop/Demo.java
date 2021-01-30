package oop;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        // to w takim razie Animal animal = new Dog()
        // to jest obiekt klasy Animal ale ma właściwości klasy Dog?

        Dog dog = new Dog();
        Cat cat = new Cat();

        Animal animal = dog;

        animal = new Cat();
        //animal.bark();

        dog.bark();
        dog.eat();
        dog.toString();

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
