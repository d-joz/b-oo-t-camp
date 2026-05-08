package com.tw.bootcamp.p3.volume;

public class Gallon extends Volume {
  public Gallon(double value) {
    super(value);
  }

  @Override
  public boolean compare(ComparableByVolume other) {
    if(other instanceof Gallon gallon){
      return this.value == gallon.value;
    }
    return other.compare(this);
  }

}
