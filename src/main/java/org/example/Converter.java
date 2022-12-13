package org.example;

public interface Converter {
    double getConvertedElement(double element);
}
 class CelsiusConverter implements Converter{

     @Override
     public double getConvertedElement(double element) {
         return element;
     }
 }

 class KelvinConverter implements Converter{

     @Override
     public double getConvertedElement(double element) {
         return element + 273.15;
     }


     }

class FahrenheitConverter implements Converter{

    @Override
    public double getConvertedElement(double element) {
        return element +32;
    }
 }