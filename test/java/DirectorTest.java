import Managment.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setUp(){
        director = new Director("Betsy", "7783", 600000.00, "Stocks", 10000.00);
    }

    @Test
    public void canGetBuget() {
        assertEquals(10000, director.getBuget(), 0.0);
    }

    @Test
    public void willNotAcceptNegativeNumber(){
        director.increaseSalary(-1000.00);
        assertEquals(600000.00, director.getSalary(), 0.0);
    }

    @Test
    public void hasDiffenetBonus(){
        assertEquals(12000.00, director.payBonus(), 0.0);
    }
}
