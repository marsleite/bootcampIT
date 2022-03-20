package br.com.exemplo;

public class Rectangle {
  private double width;
  private double height;

  public void setWidth(double w) {
    this.width = w;
  }

  public double getWidth() {
    return width;
  }

  public void setHeight(double h) {
    this.height = h;
  }

  public double getHeight() {
    return height;
  }

  public double area() {
    return getWidth() * getHeight();
  }

  public double diagonal() {
    return Math.sqrt((Math.pow(getWidth(), 2)) + Math.pow(getHeight(), 2));
  }

  public double perimeter() {
    return (getWidth() * 2) + (getHeight() * 2);
  }

  @Override
  public String toString() {
    return "AREA: " + area() + "\n" +
           "PERIMETER: " + perimeter() + "\n" +
           "DIAGONAL: " + diagonal();
  }

}
