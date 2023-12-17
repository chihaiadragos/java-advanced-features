package ObjectOrientedProgramming.Coding.EnumCoding.homeWorkMetricConverter;



public enum MetricConverter {
    KM_M("KM", "M", new Converter() {
        @Override
        public float convert(float lengthValueIn) {
            return 0;
        }
    }),
    KM_CM("KM", "CM", new Converter() {
        @Override
        public float convert(float lengthValueIn) {
            return 0;
        }
    }),
    KM_MM("KM", "MM", new Converter() {
        @Override
        public float convert(float lengthValueIn) {
            return 0;
        }
    }),
    M_KM("M", "KM", new Converter() {
        @Override
        public float convert(float lengthValueIn) {
            return 0;
        }
    }),
    M_CM("M", "CM", new Converter() {
        @Override
        public float convert(float lengthValueIn) {
            return 0;
        }
    }),
    M_MM("M", "MM", new Converter() {
        @Override
        public float convert(float lengthValueIn) {
            return 0;
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
