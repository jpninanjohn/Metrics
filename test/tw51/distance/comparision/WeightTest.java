package tw51.distance.comparision;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ninan on 7/25/16.
 */
public class WeightTest {


    @Test
    public void thousandgramsShouldBeEqualToOneKilogram() {
        assertEquals(Weight.createGram(1000),Weight.createKilogram(1));
    }

    @Test
    public void oneKilogramShouldBeEqualToTenMeters() {
        assertEquals(Weight.createKilogram(1),Distance.createMeters(10));
    }

    @Test
    public void oneKilogramPlusOneKilogramIsTwoKilogram(){
        Weight weight1=Weight.createKilogram(1);
        Weight weight2=Weight.createKilogram(1);
        Weight expected=Weight.createKilogram(2);
        assertEquals(expected,weight1.addWeight(weight2));
    }

    @Test
    public void oneKilogramPlusThousandGramsIsTwoKilogram(){
        Weight weight1=Weight.createKilogram(1);
        Weight weight2=Weight.createGram(1000);
        Weight expected=Weight.createGram(2000);
        assertEquals(expected,weight2.addWeight(weight1));
    }

}
