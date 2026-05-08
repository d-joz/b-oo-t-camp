package com.tw.bootcamp.p3.length;

public enum LengthUnit {
  FEET(30.48),
  INCHES(2.54),
  CENTIMETERS(1),
  MILLIMETER(0.10),
  ;

  public final double conversionFactor;

  LengthUnit(double conversionFactor) {
    this.conversionFactor = conversionFactor;
  }
}
