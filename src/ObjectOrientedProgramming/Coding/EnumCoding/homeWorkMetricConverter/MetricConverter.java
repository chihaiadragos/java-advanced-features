package ObjectOrientedProgramming.Coding.EnumCoding.homeWorkMetricConverter;



public enum MetricConverter {
    KM_M("KM", "M", lengthValueIn -> lengthValueIn * 1000),
    KM_CM("KM", "CM", lengthValueIn -> lengthValueIn * 100000),
    KM_MM("KM", "MM", lengthValueIn -> lengthValueIn * 1000000),
    M_KM("M", "KM", lengthValueIn -> lengthValueIn / 1000),
    M_CM("M", "CM", lengthValueIn -> lengthValueIn * 100),
    M_MM("M", "MM", lengthValueIn -> lengthValueIn * 100),
    CM_KM("CM", "KM", lengthValueIn -> lengthValueIn / 10000),
    CM_M("CM", "M", lengthValueIn -> lengthValueIn / 100),
    CM_MM("CM", "MM", lengthValueIn -> lengthValueIn * 10),
    MM_KM("MM", "KM", lengthValueIn -> lengthValueIn / 1000000),
    MM_M("MM", "M", lengthValueIn -> lengthValueIn / 1000),
    MM_CM("MM", "CM", lengthValueIn -> lengthValueIn / 10);

    final String inputLengthUnit;
    final String outputLengthUnit;
    final Converter converter;

    MetricConverter(String inputLengthUnit, String outputLengthUnit, Converter converter) {
        this.inputLengthUnit = inputLengthUnit;
        this.outputLengthUnit = outputLengthUnit;
        this.converter = converter;
    }
    static float convertLengthUnit(String inputTemperatureUnit, String outputTemperatureUnit, float lengthValue) {
        for (MetricConverter metricConverter : values()) {
            if (inputTemperatureUnit.equals(metricConverter.inputLengthUnit) && outputTemperatureUnit.equals(metricConverter.outputLengthUnit)) {
                return metricConverter.converter.convert(lengthValue);
            }
        }
        return 0;
    }
}
