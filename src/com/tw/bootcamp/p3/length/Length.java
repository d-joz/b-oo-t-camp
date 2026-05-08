package com.tw.bootcamp.p3.length;

import java.util.Objects;

public class Length  {
  public final double value;
  private final LengthUnit unit;

  public Length(double value, LengthUnit unit) {
    this.value = value;
    this.unit= unit;
  }

  public static Length createInch (double value){
    return new Length(value, LengthUnit.INCHES);
  }

  public static Length createMillimeter(double value) {
    return new Length(value, LengthUnit.MILLIMETER);
  }

  public static Length createCentimeter(double value) {
    return  new Length(value, LengthUnit.CENTIMETERS);
  }

  @Override
  public String toString() {
    return String.format("%s %s",value , unit);
  }

  public static Length createFeet (double value){
    return new Length(value, LengthUnit.FEET);
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Length length)) return false;
    return Double.compare(this.value * this.unit.conversionFactor, length.value * length.unit.conversionFactor) == 0 ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(value* unit.conversionFactor);
  }
  //  @Override
//  public boolean equals(Object o) {
//    if (o instanceof ComparableByLength comparable) {
//      return compare(comparable);
//    }
//    return false;
//  }
//
//  @Override
//  public abstract boolean compare(ComparableByLength other);
//
//  @Override
//  public int hashCode() {
//    return Objects.hashCode(value);
//  }
}
