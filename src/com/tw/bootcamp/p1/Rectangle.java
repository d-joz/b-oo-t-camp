package com.tw.bootcamp.p1;

public class Rectangle {

  private final double length;
  private final double breadth;

  private Rectangle(double length, double breadth) {
    this.length = length;
    this.breadth = breadth;
  }

  public static Rectangle create(int length, int breadth) {

    return new Rectangle(length, breadth);
  }

  public double area() {
    return length * breadth;
  }


  public double perimeter() {
    return 2 * (length + breadth);
  }
}
