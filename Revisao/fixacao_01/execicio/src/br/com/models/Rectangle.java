package br.com.models;

public class Rectangle {
  
  private double width;
  private double height;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public double area() {
    return this.width * this.height;
  }

  public double pemimeter() {
    return 2 * (this.width + this.height);
  }

  public double diagonal() {
    return Math.sqrt(this.width * this.width + this.height * this.height);
  }

  @Override
  public String toString() {
    return "AREA: " + area() + "\n" +
           "PERIMETER: " + pemimeter() + "\n" +
           "DIAGONAL: " + diagonal();
  }
}
