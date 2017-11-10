package codeclan.com.joaozoo.models;

/**
 * Created by user on 10/11/2017.
 */

public class Elephants extends Animals {
     private String name;

    public Elephants(String name, double price){
        super(price);
        this.name = name;
    }
}
