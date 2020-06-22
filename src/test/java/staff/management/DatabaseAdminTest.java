package staff.management;

import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;
import static org.junit.Assert.assertEquals;
public class DatabaseAdminTest {

    private DatabaseAdmin databaseAdmin1;

    @Before
    public void setUp() throws Exception {
        databaseAdmin1 = new DatabaseAdmin("Jim", "1C", 2.0);
    }


    @Test
    public void canGetName(){
        assertEquals("Jim", databaseAdmin1.getName());
    }

    @Test
    public void canSetName(){
        databaseAdmin1.setName("Finn");
        assertEquals("Finn", databaseAdmin1.getName());
    }

    @Test
    public void canGetNI(){
        assertEquals("1C", databaseAdmin1.getNI());
    }

    @Test
    public void canSetNI(){
        databaseAdmin1.setNI("2C");
        assertEquals("2C", databaseAdmin1.getNI());
    }

    @Test
    public void canGetSalary(){
        assertEquals(2.0, databaseAdmin1.getSalary(),0.01);
    }

    @Test
    public void canSetSalarky(){
        databaseAdmin1.setSalary(2.5);
        assertEquals(2.5, databaseAdmin1.getSalary(),0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(0.02, databaseAdmin1.payBonus(),0.01);
    }

}