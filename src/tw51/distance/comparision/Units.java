package tw51.distance.comparision;

/**
 *Holds Different Units.
 */
class Units {
    public enum Unit{
        KM(100000.0,"distance"),
        M(100,"distance"),
        FT(30,"distance"),
        INCHES(2.5,"distance"),
        CM(1,"distance"),
        KG(1000,"weight"),
        G(1,"weight");

        final double conversionFactor;
        private final String typeOfUnit;

        Unit(double conversionFactor, String typeOfUnit){
            this.conversionFactor = conversionFactor;
            this.typeOfUnit= typeOfUnit;
        }
        public double getConversionFactor() {
            return conversionFactor;
        }
        public String getTypeOfUnit(){
            return typeOfUnit;
        }
    }
}
