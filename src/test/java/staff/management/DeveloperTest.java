package staff.management;

import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer developer1;

    @Before
    public void setUp() throws Exception {
        developer1 = new Developer("Bob","1A",1.0);
    }

    @Test
    public void canGetName(){
        assertEquals("Bob",developer1.getName());
    }

    @Test
    public void canSetName(){
        developer1.setName("Jim");
        assertEquals("Jim",developer1.getName());
    }

    @Test
    public void canGetNI(){
        developer1.getNI();
        assertEquals("1A",developer1.getNI());
    }

    @Test
    public void canSetNI(){
        developer1.setNI("2B");
        assertEquals("2B",developer1.getNI());
    }

    @Test
    public void canGetSalary(){
        assertEquals(1.0, developer1.getSalary(),0.01);
    }

    @Test
    public void canSetSalary(){
        developer1.setSalary(2.0);
    assertEquals(2.0, developer1.getSalary(),0.01);
    }

    @Test
    public void canRaiseSalary(){
        developer1.raiseSalary(100.0);
        assertEquals(101.0,developer1.getSalary(),0.01);
    }

    @Test
    public void canRaiseSalary__ignore_negative(){
        developer1.raiseSalary(-1000.111);
        assertEquals(1.0,developer1.getSalary(),0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(0.01, developer1.payBonus(),0.01);
    }

}
