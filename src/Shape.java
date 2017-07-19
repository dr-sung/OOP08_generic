
// Superclass of Rectangle and Circle
abstract class Shape implements MyComparable {

  public Shape() {
    x = y = 0;
  }

  public Shape(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public void setLocation(double x, double y) {
    this.x = x;
    this.y = y;
  }

  abstract public double getArea(); // abstract method

  @Override
  public int compareTo(MyComparable o) {

    assert o instanceof Shape: "object not Shape type";

    Shape other = (Shape) o;
    double myArea = getArea();
    double yourArea = other.getArea();
    if (myArea < yourArea) {
      return -1;
    } else if (myArea > yourArea) {
      return 1;
    } else {
      return 0;
    }
  }

  private double x;
  private double y;

}
