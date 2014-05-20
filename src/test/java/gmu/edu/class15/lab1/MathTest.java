package gmu.edu.class15.lab1;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class MathTest {

    private Math _math;
    @Before
    public void setUp() throws Exception {
        _math = new Math();
    }
    @Test
    public void testAddInts() {
        assertEquals(42, _math.add(30, 12));
    }
    @Test
    public void testAddDoubles() {
        assertThat(_math.add(1.2, 6.5), is(7.7));
    }
    @Test
    public void testMaxDouble() {
        assertThat(_math.max(1.2,7.6,2.8,22.1), is(22.1));
    }

}



