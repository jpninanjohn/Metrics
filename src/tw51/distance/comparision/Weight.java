package tw51.distance.comparision;

import static tw51.distance.comparision.Units.*;

/**
 * * Represents how different weights are equated.
 */

public class Weight extends Measurement{

    public Weight(double value, Unit unit) {
        super(value,unit);
    }

    public static Weight createKilogram(double value) {
        return new Weight(value, Unit.KG);
    }


    public static Weight createGram(double value) {
        return new Weight(value, Unit.G);
    }

    public Measurement addWeight(Weight otherWeight) {
        return super.addMeasurement(otherWeight);

    }


    public Measurement subtractWeight(Weight otherWeight) {
        return super.subtractMeasurement(otherWeight);
    }

    @Override
    public String toString() {
        return "Weight{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }



}
