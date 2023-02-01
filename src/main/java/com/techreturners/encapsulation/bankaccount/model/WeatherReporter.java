package com.techreturners.encapsulation.bankaccount.model;

import java.text.MessageFormat;

public class WeatherReporter {

    private String location;
    private double temperature; // in Celsius

    public WeatherReporter(String location, double temperature) {
        this.location = location;
        this.temperature = temperature;
    }

    public String GetReport() {
        double newTemp = 1.8 * (temperature) + 32;
        return MessageFormat.format("I am in {0} and it is {1}. {2}. The temperature in Fahrenheit is {3}.", location, checkWeather(), checkTemperature(), newTemp);
    }

    public String checkWeather() {
        if (location.equals("London"))
            return "🌦";
        if (location.equals("California"))
            return "🌅";
        if (location.equals("Cape Town"))
            return "🌤";

        return "🔆";
    }

    public String checkTemperature() {
        if (temperature > 30)
            return "It's too hot 🥵!";
        if (temperature < 10)
            return "It's too cold 🥶!";
        return "Ahhh...it's just right 😊!";
        }
}