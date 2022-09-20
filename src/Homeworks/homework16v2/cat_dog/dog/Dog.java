package Homeworks.homework16v2.cat_dog.dog;

import Homeworks.homework16v2.cat_dog.animal.Animal;

public class Dog extends Animal {

    String dogType = "Dog";
    String dogVoice = "Gav";

    public Dog(String name) {
        super.animal(this.dogType, name, this.dogVoice);
    }

}
