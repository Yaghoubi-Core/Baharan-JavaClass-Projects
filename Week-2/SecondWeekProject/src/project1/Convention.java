package project1.Test;

public class Convention {

    //Celsius conventions
    public double celsiusToFahrenheit(double celsiusValue) {
        double fahrenheitValue = celsiusValue * 1.8 + 32;
        return fahrenheitValue;
    }

    public double celsiusToKelvin(double celsiusValue) {
        double kelvinValue = celsiusValue + 273.15;
        return kelvinValue;
    }

    //Fahrenheit conventions
    public double FahrenheitToKelvin(double fahrenheitValue) {
        double kelvinValue = (fahrenheitValue - 32) / 1.8 + 273.15;
        return kelvinValue;
    }

    public double FahrenheitToCelsius(double fahrenheitValue) {
        double celsiusValue = (fahrenheitValue - 32) / 1.8;
        return celsiusValue;
    }

    // Kelvin conventions
    public double KelvinToCelsius(double kelvinValue) {
        double celsiusValue = kelvinValue - 273.15;
        return celsiusValue;
    }

    public double KelvinToFahrenheit(double kelvinValue) {
        double fahrenheitValue = (kelvinValue - 273.15) * 1.8 + 32;
        return fahrenheitValue;
    }

}
