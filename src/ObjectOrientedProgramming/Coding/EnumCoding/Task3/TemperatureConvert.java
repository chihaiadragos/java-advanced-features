package ObjectOrientedProgramming.Coding.EnumCoding.Task3;

public enum TemperatureConvert {
    C_F('C', 'F', new CelsiusToFaFahrenheitConverter()),
    C_K('C', 'K', new CelsiusToKelvinConverter()),
    K_C('K', 'C', new KelvinToCelsiusConverter()),
    F_C('F', 'C', new FahrenheitToCelsiusConverter()),
    F_K('F', 'K', new FahrenheitToKelvinConverter()),
    K_F('K', 'F', new KelvinToFahrenheitConverter());

    char inputTemperatureUnit;
    char outputTemperatureUnit;
    Converter converter;


    TemperatureConvert(char inputTemperatureUnit, char outputTemperatureUnit, Converter converter) {
        this.inputTemperatureUnit = Character.toUpperCase(inputTemperatureUnit);
        this.outputTemperatureUnit = Character.toUpperCase(outputTemperatureUnit);
        this.converter = converter;
    }
    static float convertTemperature(char inputTemperatureUnit, char outputTemperatureUnit, float temperature) throws ConvertorNotFoundException{
        for (TemperatureConvert conversionType : TemperatureConvert.values()) {
            if (conversionType.inputTemperatureUnit == Character.toUpperCase(inputTemperatureUnit) && conversionType.outputTemperatureUnit == Character.toUpperCase(outputTemperatureUnit)) {
                return conversionType.converter.conver(temperature);
            }
        }
        throw new ConvertorNotFoundException("Convertor for this input does not exist");
    }



}
