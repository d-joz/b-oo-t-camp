package com.tw.bootcamp.p3.volume;

import com.tw.bootcamp.p3.length.Length;

import java.util.Objects;

public class Volume {
  private final double value;
  private final VolumeUnit unit;

  public Volume(double value, VolumeUnit unit) {
    this.value = value;
    this.unit = unit;
  }

  public static Volume createGallon(double value) {
    return  new Volume(value, VolumeUnit.GALLON);
  }

  public static Volume createLiters(double value) {
    return new Volume(value, VolumeUnit.LITER);
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Volume volume)) return false;
    double difference = value * this.unit.conversionFactor - volume.value * volume.unit.conversionFactor;
    double delta = 0.000001;
    return difference > -delta && difference < delta ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, unit);
  }

  @Override
  public String toString() {
    return  String.format("%s %s",value , unit )
        ;
  }

  public Volume add(Volume other) {
    double sum = ((this.value * this.unit.conversionFactor) + (other.value * other.unit.conversionFactor)) ;

    return new Volume(sum, VolumeUnit.LITER);
  }
}
