package tw51.distance.comparision;

/**
 *Holds Different Units.
 */
class Units {
    public enum Unit{
        KM(100000.0),
        M(100),
        FT(30),
        INCHES(2.5),
        CM(1),
        KG(1000),
        G(1);

        final double conversionFactor;
        Unit(double conversionFactor){
            this.conversionFactor = conversionFactor;
        }
        public double getConversionFactor() {
            return conversionFactor;
        }
    }
}
