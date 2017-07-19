
class Circle extends Shape {

  public Circle(double radius) {
    super();
    this.radius = radius;
  }

  public Circle(double x, double y, double radius) {
    super(x, y);
    this.radius = radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  public double getArea() {
    return radius * radius * Math.PI;
  }

  @Override
  public String toString() {
    return "Circle[" + getX() + ", " + getY() + ", " + radius
            + ", (" + getArea() + ")]";
  }

  private double radius;
}
