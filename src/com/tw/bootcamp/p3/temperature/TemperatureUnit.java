package com.tw.bootcamp.p3.temperature;

public enum TemperatureUnit {
  CELSIUS((double value) -> value),
  FAHRENHEIT((double value )-> (value - 32)* ((double) 5 /9) );


  public final Conversion convertor;

  TemperatureUnit(Conversion convertor) {
    this.convertor = convertor;
  }
}
