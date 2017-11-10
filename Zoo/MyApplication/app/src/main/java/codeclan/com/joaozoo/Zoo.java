package codeclan.com.joaozoo;

import java.lang.reflect.Array;
import java.util.ArrayList;

import codeclan.com.joaozoo.models.Animals;
import codeclan.com.joaozoo.models.Enclosures;
import codeclan.com.joaozoo.models.Lions;
import codeclan.com.joaozoo.models.Visitors;

/**
 * Created by user on 10/11/2017.
 */

public class Zoo {
    private String name;
    private double funds;
    private double ticketPrice;
    private ArrayList<Enclosures> enclosures;
    private ArrayList<Visitors> clients;

    public Zoo(String name, double funds, double ticketPrice){
        this.name = name;
        this.funds = funds;
        this.ticketPrice = ticketPrice;
        this.enclosures= new ArrayList();

    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name= newName;

    }

    public double getFunds(){
        return this.funds;
    }

    public void setFunds(double newfunds) {
        this.funds = newfunds;
    }
    public double getTicketPrice(){
        return this.ticketPrice;
    }

    public void setTicket(double newPrice) {
        this.ticketPrice = newPrice;
    }


    public int getNumberOfEnclosures() {
         return this.enclosures.size();
    }

    public void addEnclosure(Enclosures enclosure) {
        this.enclosures.add(enclosure);
    }

    public void removeEnclosure(Enclosures enclosure) {
        this.enclosures.remove(enclosure);
    }

    public int calculateTotalAnimals() {
         int total = 0;
        for(Enclosures enclosure : enclosures){
           total += enclosure.getNumberOfAnimalsInEnclosure();
        }
        return total;
    }

    public void sellAnimal(Animals animal) {
        for (Enclosures enclosure : enclosures) {
            if (enclosure.constainAnimal(animal)) {
                this.funds += animal.getPrice();
                enclosure.removeAnimalFromEnclosure(animal);
            }
        }
    }

    public double calculateTotalprofit() {
        double profit = 0;
        for (Enclosures enclosure : enclosures) {
            profit += enclosure.getTotalPriceOfAnimals();
        }
        return profit;
    }

}
