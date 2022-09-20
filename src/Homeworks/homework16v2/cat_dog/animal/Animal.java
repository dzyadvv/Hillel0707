
package Homeworks.homework16v2.cat_dog.animal;

public class Animal {
    String animalType;
    String animalName;
    String animalVoice;

    public void animal(String type, String name, String voice) {
        this.animalType = type;
        this.animalName = name;
        this.animalVoice = voice;
    }

    public void sayType(String type) {
        System.out.print("I'm a " + type + ". ");
    }

    public void sayName(String name) {
        System.out.print("My name is " + name + ". ");
    }

    public void sayVoice(String voice) {
        System.out.print(voice + ". ");
    }

    public void sound() {
        sayType(animalType);
        sayName(animalName);
        sayVoice(animalVoice);
        System.out.println();
    }


}