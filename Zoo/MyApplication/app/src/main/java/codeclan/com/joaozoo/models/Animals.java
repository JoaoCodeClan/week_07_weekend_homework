package codeclan.com.joaozoo.models;

/**
 * Created by user on 10/11/2017.
 */

public abstract class Animals {
     private int price;

    public Animals(int price){
        this.price = price;
    }

    public int  getPrice(){
     return this.price;
    }

    public void setprice(int newPrice){
       this.price = newPrice;
    }
}
