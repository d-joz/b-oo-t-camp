package com.tw.bootcamp.p3.length;

public class Inches extends Length {

  public Inches(double value) {
    super(value);
  }

  @Override
  public boolean compare(ComparableByLength other) {
    if(other instanceof Inches inches){
      return this.value == inches.value;
    }
    return other.compare(new Inches(value));
  }

}
