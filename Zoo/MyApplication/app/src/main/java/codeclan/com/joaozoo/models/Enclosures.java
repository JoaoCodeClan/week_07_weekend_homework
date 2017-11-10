package codeclan.com.joaozoo.models;

import java.util.ArrayList;

/**
 * Created by user on 10/11/2017.
 */

public class Enclosures <T> {
    private String nameOfEnclosure;
    private ArrayList<T>animals;

    public Enclosures(String nameOfEnclosure){
        this.nameOfEnclosure = nameOfEnclosure;
        this.animals = new ArrayList();
    }

 public String getNameOfEnclosure(){
     return this.nameOfEnclosure;
 }
 public void setNameOfEnclosure(String newName){
     this.nameOfEnclosure = newName;

 }

 public int getNumberOfAnimalsInEnclosure(){
     return this.animals.size();
 }

 public void addAnimalToEnclosure(T animal){
     this.animals.add(animal);
 }

 public void removeAnimalFromEnclosure(T animal){
        this.animals.add(animal);
    }
}
