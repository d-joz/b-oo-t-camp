package com.tw.bootcamp.p3;

public record Feet(double value) implements ConvertableToInches {

  @Override
  public Inches convertToInches() {
    return new Inches(value * 12);
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof ConvertableToInches convertable) {
      return convertToInches().value == (convertable.convertToInches()).value;
    }
    if (!(o instanceof Feet feet)) return false;
    return Double.compare(value, feet.value) == 0;
  }

}
