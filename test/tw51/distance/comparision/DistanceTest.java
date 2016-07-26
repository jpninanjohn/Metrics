package tw51.distance.comparision;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DistanceTest {


    @Test
    public void thousandMetersShouldBeEqualToThousandMeters() {
        assertEquals(Distance.createMeters(1000), Distance.createMeters(1000));
    }

    @Test
    public void oneKilometerShouldBeEqualToOneKilometer() {
        assertEquals(Distance.createKilometers(1), Distance.createKilometers(1));
    }

    @Test
    public void oneInchShouldBeEqualToOneInch() {
        assertEquals(Distance.createInches(1), Distance.createInches(1));
    }

    @Test
    public void oneFootShouldBeEqualToOneFoot() {
        assertEquals(Distance.createFeet(1), Distance.createFeet(1));
    }

    @Test
    public void oneKilometerShouldBeEqualToThousandMeters() {
        assertEquals(Distance.createKilometers(1), Distance.createMeters(1000));
    }

    @Test
    public void thousandMetersShouldBeEqualToOneKilometers() {
        assertEquals(Distance.createMeters(1000), Distance.createKilometers(1));
    }

    @Test
    public void twelveInchesShouldBeEqualToOneFeet() {
        assertEquals(Distance.createInches(12), Distance.createFeet(1));
    }

    @Test
    public void oneKmPlusOneKmIsTwoKm() {
        Distance distance1 = Distance.createKilometers(1.0);
        Distance distance2 = Distance.createKilometers(1.0);
        Distance expected = Distance.createKilometers(2.0);
        assertEquals(expected, distance1.addDistance(distance2));
    }

    @Test
    public void oneKmPlusThousandMeterIsTwoKm() {
        Distance distance1 = Distance.createKilometers(1.0);
        Distance distance2 = Distance.createMeters(1000.0);
        Distance expected = Distance.createKilometers(2.0);
        assertEquals(expected, distance1.addDistance(distance2));
    }

    @Test
    public void oneThousandMeterPlusOneKmIsTwoThousandMeter() {
        Distance distance1 = Distance.createMeters(1000.0);
        Distance distance2 = Distance.createKilometers(1.0);
        Distance expected = Distance.createMeters(2000.0);
        assertEquals(expected, distance1.addDistance(distance2));
    }

    @Test
    public void oneKmSubtractedWithThousandMeterIsZeroKm() {
        Distance distance1 = Distance.createKilometers(1.0);
        Distance distance2 = Distance.createMeters(1000.0);
        Distance expected = Distance.createKilometers(0.0);
        assertEquals(expected, distance1.subtractDistance(distance2));
    }

    @Test
    public void oneFootShouldEqualToTwelveInches() {
        assertEquals(Distance.createFeet(1), Distance.createInches(12));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotAllowNegativeKilometerValues() {
        Distance.createKilometers(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotAllowNegativeMeterValues() {
        Distance.createMeters(-1000);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotAllowNegativeInchValues() {
        Distance.createInches(-1);
    }


}