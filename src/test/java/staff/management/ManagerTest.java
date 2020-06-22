package staff.management;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ManagerTest {

    private Manager manager1;
    private Manager manager2;

    @Before
    public void setUp() throws Exception {
        manager1 = new Manager("Bob","1A",1.0,"English");
    }

    @Test
    public void canGetDeptName() {
        assertEquals("English", manager1.getDeptName());
    }

    @Test
    public void canSetDeptName() {
        manager1.setDeptName("Welsh");
        assertEquals("Welsh", manager1.getDeptName());
    }
    
    @Test
    public void canRaiseSalary(){
        manager1.raiseSalary(100.0);
        assertEquals(101.0,manager1.getSalary(),0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(0.01, manager1.payBonus(),0.01);
    }

}