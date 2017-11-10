package codeclan.com.joaozoo;

import org.junit.Before;
import org.junit.Test;

import codeclan.com.joaozoo.models.Enclosures;
import codeclan.com.joaozoo.models.Lions;
import codeclan.com.joaozoo.models.Visitors;
import codeclan.com.joaozoo.models.Zebras;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 10/11/2017.
 */

public class ZooTest {

    Zoo eden;
    Enclosures enclosure1;
    Enclosures enclosure2;
    Lions lion1;
    Lions lion2;
    Lions lion3;

    Zebras zebra1;
    Zebras zebra2;

    Visitors person1;
    Visitors person2;



    @Before
    public void before(){
        eden= new Zoo("Eden", 0.0, 10.0);
        enclosure1= new Enclosures("LionsDen");
        enclosure2 = new Enclosures("StripTheStripe");
        lion1 = new Lions("Albino", 5000.0);
        lion2 = new Lions("African", 3000.0);
        lion3 = new Lions("Simba", 4000.0);


        zebra1 = new Zebras("Stripy", 1000.0);
        zebra2 = new Zebras("B&W", 1000.0);

        person1= new Visitors("Mario", 50.0);
        person2= new Visitors("Luigi", 100.0);


    }


    @Test
    public void canGetZooname(){
        assertEquals("Eden", eden.getName());

    }

    @Test
    public void canSetZooName(){
        eden.setName("Lil' Paradise");
        String actual = eden.getName();
        assertEquals("Lil' Paradise", actual);
    }


    @Test
    public void canGetZooFunds(){
        assertEquals(0.0, eden.getFunds());

    }

    @Test
    public void canSetZooFunds(){
        eden.setFunds(100.0);
        double actual = eden.getFunds();
        assertEquals(100.0, actual);
    }
 @Test
 public void canGetTicketPrice(){
     assertEquals(10.0, eden.getTicketPrice());
 }

 @Test
 public void canSetNewTicketprice(){
     eden.setTicket(12.0);
     double actual= eden.getTicketPrice();
     assertEquals(12.0, actual);
 }

    @Test
     public void testZooStartsEmpty(){
        int actual = eden.getNumberOfEnclosures();
        assertEquals(0, actual);

    }

    @Test
    public void canAddEnclosuresToZoo(){
        eden.addEnclosure(enclosure1);
        int actual = eden.getNumberOfEnclosures();
        assertEquals(1, actual);
    }

    @Test
    public void canRemoveEnclosureFromZoo(){
        eden.addEnclosure(enclosure1);
        eden.addEnclosure(enclosure2);
        eden.removeEnclosure(enclosure1);
        int actual2=  eden.getNumberOfEnclosures();
        assertEquals(1,actual2 );
    }

    @Test

    public void canCalculateTotalanimals(){
        enclosure1.addAnimalToEnclosure(lion1);
        enclosure1.addAnimalToEnclosure(lion2);
        enclosure1.addAnimalToEnclosure(lion3);
        enclosure2.addAnimalToEnclosure(zebra1);
        enclosure1.addAnimalToEnclosure(zebra2);
        eden.addEnclosure(enclosure1);
        eden.addEnclosure(enclosure2);

         int actual = eden.calculateTotalAnimals();
        assertEquals(5,actual);
    }

    @Test
    public void canSellAnimalFromEnclosureAndgetMoney(){
        enclosure1.addAnimalToEnclosure(lion1);
        enclosure1.addAnimalToEnclosure(lion2);
        enclosure1.addAnimalToEnclosure(lion3);
        enclosure2.addAnimalToEnclosure(zebra1);
        enclosure2.addAnimalToEnclosure(zebra2);
        eden.addEnclosure(enclosure1);
        eden.addEnclosure(enclosure2);
        eden.sellAnimal(lion2);
         double actual = eden.getFunds();
        assertEquals(3000.0,actual);

        int actual2 = eden.calculateTotalAnimals();
         assertEquals(4, actual2);

    }

    @Test

    public void canCalculateTotalvalueofAnimals(){
        enclosure1.addAnimalToEnclosure(lion1);
        enclosure1.addAnimalToEnclosure(lion2);
        enclosure1.addAnimalToEnclosure(lion3);
        enclosure2.addAnimalToEnclosure(zebra1);
        enclosure2.addAnimalToEnclosure(zebra2);
        eden.addEnclosure(enclosure1);
        eden.addEnclosure(enclosure2);
        double actual = eden.calculateTotalprofit();
        assertEquals(14000.0, actual);

    }


    @Test
    public void clientsStartsEmpty(){
        int actual = eden.clientCount();
        assertEquals(0, actual);

    }

    @Test

    public void canAddPersonsToClients(){
        eden.addClient(person1);
        int actual = eden.clientCount();
        assertEquals(1, actual);
        double actual2= eden.getFunds();
        assertEquals(10.0, actual2);
        double actual3= person1.getMoney();
        assertEquals(40.0, actual3);
    }

    @Test
    public void canRemovePersonFromClients(){
        eden.addClient(person1);
        eden.addClient(person2);
        int actual = eden.clientCount();
        assertEquals(2, actual);
        eden.removeClient(person1);
        int actual2 =  eden.clientCount();
        assertEquals(1, actual2);
    }



}
