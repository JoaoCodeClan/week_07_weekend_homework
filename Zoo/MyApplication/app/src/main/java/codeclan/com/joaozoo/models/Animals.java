package codeclan.com.joaozoo.models;

/**
 * Created by user on 10/11/2017.
 */

public abstract class Animals {
     private double price;

    public Animals(double price){
        this.price = price;
    }

    public double getPrice(){
     return this.price;
    }

    public void setprice(double newPrice){
       this.price = newPrice;
    }
}
