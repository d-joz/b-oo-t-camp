package com.tw.bootcamp.p1;

public class Square {
  private final double side;

  public Square(double side) {
    this.side = side;
  }

  public static Square create(double side) {

    return new Square(side);
  }

  public double area() {
    return side * side;
  }

  public double perimeter() {
    return side * 4;
  }
}
