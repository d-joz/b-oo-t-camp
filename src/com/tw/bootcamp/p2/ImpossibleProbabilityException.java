package com.tw.bootcamp.p2;

public class ImpossibleProbabilityException extends Throwable {
  ImpossibleProbabilityException(){
    super("Probability should be between 0 and 1");
  }
}
