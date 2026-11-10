package project1;

import project1.Test.Convention;
import project1.enums.TemperatureConversionType;
import project1.enums.TemperatureUnit;

public class TemperatureUnitConversion {

    private TemperatureUnit unit;
    private double value;
    private final Convention convention = new Convention();


    public TemperatureUnitConversion(TemperatureUnit setOriginUnit, double setValue) {
        this.unit = setOriginUnit;
        this.value = setValue;
    }

    public TemperatureUnitConversion() {
        this.unit = null;
        this.value = 0.0;
    }

    //convention methode
    public double customizeConventing(TemperatureConversionType type, double defaultOriginValue) {
        double outPut = 0.0;
        if (type != null) {
            switch (type) {
                case CENTIGRADE_TO_KELVIN:
                    outPut = convention.celsiusToKelvin(defaultOriginValue);
                    break;
                case CENTIGRADE_TO_FAHRENHEIT:
                    outPut = convention.celsiusToFahrenheit(defaultOriginValue);
                    break;
                case KELVIN_TO_CENTIGRADE:
                    outPut = convention.KelvinToCelsius(defaultOriginValue);
                    break;
                case KELVIN_TO_FAHRENHEIT:
                    outPut = convention.KelvinToFahrenheit(defaultOriginValue);
                    break;
                case FAHRENHEIT_TO_KELVIN:
                    outPut = convention.FahrenheitToKelvin(defaultOriginValue);
                    break;
                case FAHRENHEIT_TO_CENTIGRADE:
                    outPut = convention.FahrenheitToCelsius(defaultOriginValue);
                    break;
            }
        } else {
            System.err.println("The input \"type\" Must Not be \"Null\" or out of \"TemperatureConversionType\" types!");
        }
        return outPut;
    }



    //getters
    public TemperatureUnit getUnit() {
        return unit;
    }

    public double getValue() {
        return value;
    }

    public double getFahrenheit() {
        double fahrenheitValue = 0.0;
        if (unit != null) {
            switch (unit) {
                case CENTIGRADE:
                    fahrenheitValue = convention.celsiusToFahrenheit(value);
                    break;

                case KELVIN:
                    fahrenheitValue = convention.KelvinToFahrenheit(value);
                    break;
                case FAHRENHEIT:
                    fahrenheitValue = value;
                    break;
            }
        } else {
            System.err.println("------------------------------------------" +
                    "\ngetFahrenheit:\nYou did not initialize Origin \"Unit\" & Origin \"Value\" " +
                    "\n help: You can use \"setUnit\" and \"setValue\" for initializing " +
                    "\n------------------------------------------");
        }
        return fahrenheitValue;
    }

    public double getCentigrade() {
        double centigradeValue = 0.0;
        if (unit != null) {
            switch (unit) {
                case CENTIGRADE:
                    centigradeValue = value;
                    break;

                case KELVIN:
                    centigradeValue = convention.KelvinToCelsius(value);
                    break;
                case FAHRENHEIT:
                    centigradeValue = convention.FahrenheitToCelsius(value);
                    break;
            }
        } else {
            System.err.println("------------------------------------------" +
                    "\ngetCentigrade:\nYou did not initialize Origin \"Unit\" & Origin \"Value\" " +
                    "\n help: You can use \"setUnit\" and \"setValue\" for initializing " +
                    "\n------------------------------------------");
        }
        return centigradeValue;
    }

    public double getKelvin() {
        double kelvinValue = 0.0;
        if (unit != null) {
            switch (unit) {
                case CENTIGRADE:
                    kelvinValue = convention.celsiusToKelvin(value);
                    break;

                case KELVIN:
                    kelvinValue = value;
                    break;
                case FAHRENHEIT:
                    kelvinValue = convention.FahrenheitToKelvin(value);
                    break;
            }
        } else {
            System.err.println("------------------------------------------" +
                    "\ngetKelvin:\nYou did not initialize Origin \"Unit\" & Origin \"Value\" " +
                    "\n help: You can use \"setUnit\" and \"setValue\" for initializing " +
                    "\n------------------------------------------");
        }
        return kelvinValue;
    }

    //setter
    public void setUnitAndValue(TemperatureUnit unit, double value) {
        this.unit = unit;
        this.value = value;
    }
}
