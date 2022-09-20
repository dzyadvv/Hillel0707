package Homeworks.homework16v2.cat_dog.cat;

import Homeworks.homework16v2.cat_dog.animal.Animal;

public class Cat extends Animal {

    String catType = "Cat";
    String catVoice = "Meow";

    public Cat(String name) {
        super.animal(this.catType, name, this.catVoice);
    }


}

