package com.ds;

import com.ds.interfaces.Animal;
import com.ds.interfaces.Bird;
import com.ds.interfaces.Dog;
import com.ds.interfaces.Pet;

public class MainInterfaces {

    public static void main(String[] args) {
        Dog dog = new Dog("Soko", Animal.Gender.MALE, "Gray");
        System.out.println(dog.getType());
        System.out.println(dog.color);
        printAnimal(dog);
        speak(dog);

        Bird bird = new Bird();
        bird.name = "Perico";
        printAnimal(bird);
        speak(bird);
    }

    private static void printAnimal(Animal animal) {
        System.out.println(animal.name);
    }

    private static void speak(Pet pet) {
        System.out.println(pet.speak());
    }
}
