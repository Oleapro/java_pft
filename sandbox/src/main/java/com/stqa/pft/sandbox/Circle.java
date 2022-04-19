package com.stqa.pft.sandbox;

public class Circle {
  public double r;

  public Circle(double r){

    this.r=r;
  }

  public  double areaCrc(){
    return  Math.PI * this.r * this.r;
  }
}
