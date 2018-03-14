

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CalculadoraTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CalculadoraTest
{
    Calculadora cal;
    

    Double DELTA = 0.0001;
    /**
     * Default constructor for test class CalculadoraTest
     */
    public CalculadoraTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        cal = new Calculadora();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testSUMAi0()
    {
        // Se pasa por lo alto
        cal.ponNum1(1);
        cal.ponNum2(Integer.MAX_VALUE);
        cal.ponOperacion("SUMAi");
        cal.opera();
        assertEquals("Infinity (result out of range)",cal.dameResultado());
    }
        @Test
    public void testSUMAi1()
    {
        // Se pasa por lo bajo
        cal.ponNum1(-5);
        cal.ponNum2(-(Integer.MAX_VALUE));
        cal.ponOperacion("SUMAi");
        cal.opera();
        assertEquals("-Infinity (result out of range)",cal.dameResultado());
    }
    @Test
    public void testSUMAi2()
    {
        cal.ponNum1(2);
        cal.ponNum2(525);
        cal.ponOperacion("SUMAi");
        cal.opera();
        assertEquals(527,cal.dameResultadod(),DELTA);
        assertEquals("527",cal.dameResultado());
    }
    @Test
    public void testRESTAi0()
    {
        // Se pasa por lo alto
        cal.ponNum1(1);
        cal.ponNum2(-Integer.MAX_VALUE);
        cal.ponOperacion("RESTAi");
        cal.opera();
        assertEquals("Infinity (result out of range)",cal.dameResultado());
    }
        @Test
    public void testRESTAi1()
    {
        // Se pasa por lo bajo
        cal.ponNum1(-5);
        cal.ponNum2(Integer.MAX_VALUE);
        cal.ponOperacion("RESTAi");
        cal.opera();
        assertEquals("-Infinity (result out of range)",cal.dameResultado());
    }
    @Test
    public void testRESTAi2()
    {
        cal.ponNum1(525);
        cal.ponNum2(2);
        cal.ponOperacion("RESTAi");
        cal.opera();
        assertEquals(523,cal.dameResultadod(),DELTA);
        assertEquals("523",cal.dameResultado());
    }
    
    @Test
    public void testMultipplicacion()
    {
        cal.ponNum1(10.5);
        cal.ponNum2(2.5);
        cal.ponOperacion("MULTIPLICA");
        cal.opera();
        assertEquals(26.25,cal.dameResultadod(),DELTA);
        assertEquals("26.25",cal.dameResultado());
    }
    
    @Test
    public void testLog0()
    {
        cal.ponNum1(10);
        cal.ponOperacion("LOG");
        cal.opera();
        assertEquals(1,cal.dameResultadod(),DELTA);
    }
    @Test
    public void testSqrt0()
    {
        cal.ponNum1(16);
        cal.ponOperacion("SQRT");
        cal.opera();
        assertEquals(4,cal.dameResultadod(),DELTA);
        assertEquals("4",cal.dameResultado());
    }
    @Test
    public void testSqrt1()
    {
        cal.ponNum1(0);
        cal.ponOperacion("SQRT");
        cal.opera();
        assertEquals(0,cal.dameResultadod(),DELTA);
        assertEquals("0",cal.dameResultado());
    }
    @Test
    public void testSqrt2()
    {
        cal.ponNum1(-16);
        cal.ponOperacion("SQRT");
        cal.opera();
        assertEquals(Math.sqrt(-16),cal.dameResultadod(),DELTA);
        assertEquals("Operacion no soportada",cal.dameResultado());
    }
    public void testnRoot0()
    {
        cal.ponNum1(16);
        cal.ponNum2(2);
        cal.ponOperacion("nROOT");
        cal.opera();
        assertEquals(4,cal.dameResultadod(),DELTA);
        assertEquals("4",cal.dameResultado());
    }
}

