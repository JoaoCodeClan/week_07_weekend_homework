package codeclan.com.joaozoo;

import java.util.ArrayList;

import codeclan.com.joaozoo.models.Enclosures;

/**
 * Created by user on 10/11/2017.
 */

public class Zoo {
    private String name;
    private ArrayList<Enclosures> enclosures;

    public Zoo(String name){
        this.name = name;
        this.enclosures= new ArrayList();

    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name= newName;

    }
}
