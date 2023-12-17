package ObjectOrientedProgramming.Coding.EnumCoding.homeWorkMetricConverter;



public enum MetricConverter {
    KM_M("KM", "M", new Converter() {
        @Override
        public float convert(float lengthValueIn) {
            return lengthValueIn * 1000;
        }
    }),
    KM_CM("KM", "CM", new Converter() {
        @Override
        public float convert(float lengthValueIn) {
            return lengthValueIn * 100000;
        }
    }),
    KM_MM("KM", "MM", new Converter() {
        @Override
        public float convert(float lengthValueIn) {
            return lengthValueIn * 1000000;
        }
    }),
    M_KM("M", "KM", new Converter() {
        @Override
        public float convert(float lengthValueIn) {
            return lengthValueIn / 1000;
        }
    }),
    M_CM("M", "CM", new Converter() {
        @Override
        public float convert(float lengthValueIn) {
            return lengthValueIn * 100;
        }
    }),
    M_MM("M", "MM", new Converter() {
        @Override
        public float convert(float lengthValueIn) {
            return lengthValueIn * 100;
        }
    });

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
