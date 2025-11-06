package oop.ex1B4;

public class Rectangle extends Figure {
  private final double width;
  private final double height;
  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public double getArea() {
    return width * height;
  }
  public double getPerimeter() {
    return 2 * (width + height);
  }
}
