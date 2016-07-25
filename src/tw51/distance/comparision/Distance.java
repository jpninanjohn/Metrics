package tw51.distance.comparision;
import static tw51.distance.comparision.Units.Unit;
import static tw51.distance.comparision.Units.Unit.*;

/**
 * Represents how different distances are equated.
 */
public class Distance extends Measurement {

    public Distance(double value, Unit unit) {
        super(value,unit);
    }

    public static Distance createKilometers(double length) {
        return new Distance(length, KM);
    }

    public static Distance createMeters(double length) {
        return new Distance(length, M);
    }

    public static Distance createFeet(double length) {
        return new Distance(length, FT);
    }

    public static Distance createInches(double length) {
        return new Distance(length, INCHES);
    }

    public Measurement addDistance(Distance otherWeight) {
        return super.addMeasurement(otherWeight);

    }

    public Measurement subtractDistance(Distance otherWeight) {
        return super.subtractMeasurement(otherWeight);
    }

    public Unit getBaseUnit(){
        return Unit.CM;
    }


    @Override
    public String toString() {
        return "Distance{" +
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
        if (this.getBaseUnit()!= ((Measurement)(other)).getBaseUnit()) {
            return false;
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
