package codeclan.com.joaozoo.models;

import java.util.ArrayList;

/**
 * Created by user on 10/11/2017.
 */

//Enclosures<Lion> lionEnclosures


    //Enclosure<Pig> lion



    //Enclosures<Animals> anyAnimals
    //anyAnimlas.add(pig)
    //anyAnimlas.add(lion)

public class Enclosures <T extends Animals> {
    private String nameOfEnclosure;
    private ArrayList<T> animals;

    public Enclosures(String nameOfEnclosure) {
        this.nameOfEnclosure = nameOfEnclosure;
        this.animals = new ArrayList();
    }

    public String getNameOfEnclosure() {
        return this.nameOfEnclosure;
    }

    public void setNameOfEnclosure(String newName) {
        this.nameOfEnclosure = newName;

    }

    public int getNumberOfAnimalsInEnclosure() {
        return this.animals.size();
    }

    public void addAnimalToEnclosure(T animal) {
        this.animals.add(animal);
    }

    public void removeAnimalFromEnclosure(T animal) {
        this.animals.remove(animal);
    }

    public double getTotalPriceOfAnimals() {
        double total = 0;
        for (Animals animal : animals) {
            total += animal.getPrice();
        }
        return total;
    }
}

