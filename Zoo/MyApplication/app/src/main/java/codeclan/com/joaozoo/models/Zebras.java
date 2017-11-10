package codeclan.com.joaozoo.models;

/**
 * Created by user on 10/11/2017.
 */

public class Zebras extends Animals {
     private String name;

    public Zebras(String name, int price){
        super(price);
        this.name = name;
    }
}
