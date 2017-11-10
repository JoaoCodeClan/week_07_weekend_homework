package codeclan.com.joaozoo.models;

/**
 * Created by user on 10/11/2017.
 */

public class Elephants extends Animals {
    String name;

    public Elephants(String name, int price){
        super(price);
        this.name = name;
    }
}
