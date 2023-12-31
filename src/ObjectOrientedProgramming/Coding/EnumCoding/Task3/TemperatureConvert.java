package ObjectOrientedProgramming.Coding.EnumCoding.Task3;

public enum TemperatureConvert {
    C_F('C', 'F', new CelsiusToFaFahrenheitConverter()),
    C_K('C', 'K', new CelsiusToKelvinConverter()),
    K_C('K', 'C', new KelvinToCelsiusConverter()),
    F_C('F', 'C', new FahrenheitToCelsiusConverter()),
    F_K('F', 'K', new FahrenheitToKelvinConverter()),
    K_F('K', 'F', new KelvinToFahrenheitConverter());

    //Putem implementa cu clasa anonima P.S. <- este mai buna varianta cu clase anonime pentru salvarea memoriei
//    K_F('K', 'F', new Converter{
//    @Override
//    public float convert(float temp) {
//    return 10000;
//    });

    final char inputTemperatureUnit;
    final char outputTemperatureUnit;
    final Converter converter;


    TemperatureConvert(char inputTemperatureUnit, char outputTemperatureUnit, Converter converter) {
        this.inputTemperatureUnit = Character.toUpperCase(inputTemperatureUnit);
        this.outputTemperatureUnit = Character.toUpperCase(outputTemperatureUnit);
        this.converter = converter;
    }
    static float convertTemperature(char inputTemperatureUnit, char outputTemperatureUnit, float temperature) throws ConvertorNotFoundException{
        for (TemperatureConvert conversionType : TemperatureConvert.values()) {
            if (conversionType.inputTemperatureUnit == Character.toUpperCase(inputTemperatureUnit) && conversionType.outputTemperatureUnit == Character.toUpperCase(outputTemperatureUnit)) {
                return conversionType.converter.convert(temperature);
            }
        }
        throw new ConvertorNotFoundException("Convertor for this input does not exist");
    }



}
