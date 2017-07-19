
class Rectangle extends Shape {

  public Rectangle(double width, double height) {
    super();
    this.width = width;
    this.height = height;
  }

  public Rectangle(double x, double y, double width, double height) {
    super(x, y);
    this.width = width;
    this.height = height;
  }

  public void setSize(double width, double height) {
    this.width = width;
    this.height = height;
  }

  @Override
  public double getArea() {
    return width * height;
  }

  @Override
  public String toString() {
    return "Rectangle[" + getX() + ", " + getY() + ", " + width + ", "
            + height + ", (" + getArea() + ")]";
  }
  
  private double width;
  private double height;
}

