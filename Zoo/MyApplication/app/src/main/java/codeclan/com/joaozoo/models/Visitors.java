package codeclan.com.joaozoo.models;

/**
 * Created by user on 10/11/2017.
 */

public class Visitors {
     private String name;
     private double money;


    public Visitors(String name, Double money){
        this.name= name;
        this.money =money;

    }

    public String getName(){
        return this.name;
    }

    public void setName(String visitorName){
        this.name = visitorName;

    }

    public double getMoney(){
        return this.money;

    }

    public void setMoney(double newMoney){
        this.money = newMoney;
    }
}
