package org.example;

public class Main {
    public static void  main(String[]args){
        double temperature = 30;

        System.out.println("Celcius t  = " + new CelsiusConverter().getConvertedElement(temperature));
        System.out.println("Celsius to Kelvin = " + new KelvinConverter().getConvertedElement(temperature));
        System.out.println("Celsius to Fahrenheit = " + new FahrenheitConverter().getConvertedElement(temperature));
    }
}