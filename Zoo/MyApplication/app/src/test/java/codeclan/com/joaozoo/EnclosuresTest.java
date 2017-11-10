package codeclan.com.joaozoo;

import org.junit.Before;
import org.junit.Test;

import codeclan.com.joaozoo.models.Enclosures;
import codeclan.com.joaozoo.models.Lions;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 10/11/2017.
 */

public class EnclosuresTest {

    Enclosures enclosure;
    Lions lion1;
    Lions lion2;


    @Before

    public void before(){
        enclosure = new Enclosures("Lion Pit");
        lion1 = new Lions("Asian", 5000.0);
        lion2 = new Lions("African", 3000.0);

    }



    @Test

    public void testCanGetEnclosureName(){
        assertEquals("Lion Pit", enclosure.getNameOfEnclosure());
    }


    @Test
    public void canChangeEnclosureName(){
        enclosure.setNameOfEnclosure("Simba's Home");
        assertEquals("Simba's Home", enclosure.getNameOfEnclosure());
    }

    @Test
    public void TestEnclosureStartsEmpty(){
         int actual= enclosure.getNumberOfAnimalsInEnclosure();
        assertEquals(0, actual);

    }

    @Test
    public void testCanAddLionToEnclosure(){
        enclosure.addAnimalToEnclosure(lion1);
        int actual= enclosure.getNumberOfAnimalsInEnclosure();
        assertEquals(1, actual);

    }

    @Test
    public void testCanAddTwoLionsToEnclosure(){
        enclosure.addAnimalToEnclosure(lion1);
        enclosure.addAnimalToEnclosure(lion2);
        int actual= enclosure.getNumberOfAnimalsInEnclosure();
        assertEquals(2, actual);

    }

    @Test
    public void canRemoveOneLionOutOfEnclosure(){
        enclosure.addAnimalToEnclosure(lion1);
        enclosure.addAnimalToEnclosure(lion2);
        enclosure.removeAnimalFromEnclosure(lion1);
        int actual= enclosure.getNumberOfAnimalsInEnclosure();
        assertEquals(1, actual);

    }

    @Test
    public void canCalculatePriceOfAnimalsInEnclosure(){
        enclosure.addAnimalToEnclosure(lion1);
        enclosure.addAnimalToEnclosure(lion2);
         double actual = enclosure.getTotalPriceOfAnimals();
        assertEquals(8000.0, actual);
    }

}
