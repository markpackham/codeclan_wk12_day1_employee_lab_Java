package staff.management;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DirectorTest {

    private Director director1;

    @Before
    public void setUp() throws Exception {
        director1 = new Director("Greg","Z1",100.0,"Black Ops", 9999.99);
    }

    @Test
    public void canGetBudget() {
        assertEquals(9999.99, director1.getBudget(), 0.01);
    }

    @Test
    public void canSetBudget() {
        director1.setBudget(66.66);
        assertEquals(66.66, director1.getBudget(), 0.01);
    }


    @Test
    public void canGetName(){
        assertEquals("Greg",director1.getName());
    }

    @Test
    public void canSetName(){
        director1.setName("Grog");
        assertEquals("Grog",director1.getName());
    }

    @Test
    public void canGetNI(){
        director1.getNI();
        assertEquals("Z1",director1.getNI());
    }

    @Test
    public void canSetNI(){
        director1.setNI("X2");
        assertEquals("X2",director1.getNI());
    }

    @Test
    public void canGetSalary(){
        assertEquals(100.0, director1.getSalary(),0.01);
    }

    @Test
    public void canSetSalary(){
        director1.setSalary(200.0);
        assertEquals(200.0, director1.getSalary(),0.01);
    }

    @Test
    public void canRaiseSalary(){
        director1.raiseSalary(200.0);
        assertEquals(300.0,director1.getSalary(),0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(2.0, director1.payBonus(),0.01);
    }
}