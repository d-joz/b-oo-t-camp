package com.tw.bootcamp.p5;

import java.util.Objects;

public class Ball {
  private final Color color;

  public Ball(Color color) {
    this.color = color;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Ball ball)) return false;
    return color == ball.color;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(color);
  }
}
