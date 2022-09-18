package Homeworks.homework16.main;

import Homeworks.homework16.cat_dog.animal.Animal;
import Homeworks.homework16.cat_dog.cat.Cat;
import Homeworks.homework16.cat_dog.dog.Dog;

import java.util.ArrayList;
import java.util.List;

public class Practice_cat_dog {

    public static void main(String... args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Tuzik"));
        animals.add(new Cat("Vasya"));

        for (Animal animal : animals) {
            animal.sound();
            // expected: I'm a Dog. My name is Tuzik. Gav
            // expected: I'm a Cat. My name is Vasya. Mew
        }
    }
}
