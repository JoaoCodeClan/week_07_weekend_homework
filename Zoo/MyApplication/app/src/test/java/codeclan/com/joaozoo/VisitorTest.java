package codeclan.com.joaozoo;

import org.junit.Before;
import org.junit.Test;

import codeclan.com.joaozoo.models.Visitors;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 10/11/2017.
 */

public class VisitorTest {
    Visitors person;

    @Before
    public void before(){

        person = new Visitors("John", 50.0);
    }

    @Test
    public void canGetName(){
        assertEquals("John", person.getName());
    }

    @Test
    public void canSetname(){
        person.setName("David");
        String actual = person.getName();
        assertEquals("David", actual);
    }

    @Test
    public void canGetMoney(){
        assertEquals(50.0, person.getMoney());
    }

    @Test
    public void canSetmoney(){
        person.setMoney(60.0);
        double actual = person.getMoney();
        assertEquals(60.0, actual);
    }


}
