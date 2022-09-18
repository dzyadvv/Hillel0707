package Homeworks.homework16.cat_dog.animal;

public class Animal {
    String animalType;
    String animalName;
    String animalVoice;

    public void animal(String type, String name, String voice) {
        this.animalType = type;
        this.animalName = name;
        this.animalVoice = voice;
    }

    public void sound() {
        System.out.println("I'm a " + this.animalType + ". My name is " + this.animalName + ". " + this.animalVoice);
    }
}
