package tw51.distance.comparision;

import static tw51.distance.comparision.Units.*;

/**
 * Created by ninan on 7/25/16.
 */
public class Measurement {

    protected double value;
    protected Unit unit;

    public Measurement(double value, Unit unit) {
        checkFeasibility(value);
        this.value=value;
        this.unit=unit;
    }

    private void checkFeasibility(double value) {
        if(value<0){
            throw new IllegalArgumentException();
        }
    }


    protected double toBaseUnit() {
        return this.value * unit.getConversionFactor();

    }

    public Measurement addMeasurement(Measurement otherMeasurement) {
        this.value = this.toBaseUnit();
        otherMeasurement.value = otherMeasurement.toBaseUnit();
        double addedMeasurement = this.value + otherMeasurement.value;
        return new Measurement(addedMeasurement / this.unit.getConversionFactor(), this.unit);
    }

    public Measurement subtractMeasurement(Measurement otherMeasurement) {
        this.value = this.toBaseUnit();
        otherMeasurement.value = otherMeasurement.toBaseUnit();
        double addedMeasurement = this.value - otherMeasurement.value;
        return new Measurement(addedMeasurement / this.unit.getConversionFactor(), this.unit);
    }
    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (!(other instanceof Measurement)) {
            return false;
        }

        if(this.unit.getTypeOfUnit()!=((Measurement) other).unit.getTypeOfUnit()){
            throw new IllegalArgumentException();
        }

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
