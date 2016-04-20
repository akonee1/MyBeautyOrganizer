import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CustomerTest {
    
    String name;
    String lastName;
    String address;
    String age;
    public CustomerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Customer.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Customer instance = new Customer();
        String expResult = "John";
        instance.setName(expResult);
        
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Customer.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "ME";
        Customer instance = new Customer();
        instance.setName(name);
        assertEquals(name, instance.getName());
    }

    /**
     * Test of getLastName method, of class Customer.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Customer instance = new Customer();
        String expResult = "ME";
        instance.setLastName(expResult);
        String result = instance.getLastName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLastName method, of class Customer.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "John";
        Customer instance = new Customer();
        instance.setLastName(lastName);
        assertEquals(lastName, instance.getLastName());
    }

    /**
     * Test of getAddress method, of class Customer.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Customer instance = new Customer();
        String expResult = "4532";
        instance.setAddress(expResult);
        String result = instance.getAddress();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAddress method, of class Customer.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String address = "4556";
        Customer instance = new Customer();
        instance.setAddress(address);
        assertEquals(address, instance.getAddress());
    }

    /**
     * Test of getAge method, of class Customer.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Customer instance = new Customer();       
        String age = "test";
        String expResult = age;
        instance.setAge(age);
        String result = instance.getAge();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAge method, of class Customer.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        String age = "45";
        Customer instance = new Customer();
        instance.setAge(age);
        assertEquals(age, instance.getAge());
    }
    
}
