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

    public Unit getBaseUnit(){
        return Unit.G;
    }


    @Override
    public String toString() {
        return "Weight{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (!(other instanceof Measurement)) {
            return false;
        }
        /*if(this.getClass()!=other.getClass()){
            return false;
        }*/

        return toBaseUnit() == ((Measurement) other).toBaseUnit();
    }



    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(value);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        return result;
    }


}
