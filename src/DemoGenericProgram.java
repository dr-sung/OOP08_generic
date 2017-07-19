
public class DemoGenericProgram {

  public static void main(String[] args) {

    Shape[] a = new Shape[10];

    a[0] = new Circle(0, 0, 2);
    a[1] = new Circle(0, 0, 3);
    a[2] = new Circle(0, 0, 5);
    a[3] = new Circle(0, 0, 1);
    a[4] = new Circle(0, 0, 4);
    a[5] = new Rectangle(0, 0, 1, 1);
    a[6] = new Rectangle(0, 0, 3, 3);
    a[7] = new Rectangle(0, 0, 5, 5);
    a[8] = new Rectangle(0, 0, 2, 2);
    a[9] = new Rectangle(0, 0, 4, 4);

    GenericProgram.sort(a);

    for (Shape s : a)
      System.out.println(s);

    Car[] cars = new Car[5];
    cars[0] = new Car("Mustang", 35000);
    cars[1] = new Car("Corolla", 15000);
    cars[2] = new Car("Escort", 14500);
    cars[3] = new Car("Civic", 16500);
    cars[4] = new Car("Towncar", 41000);

    GenericProgram.sort(cars);

    for (Car c : cars)
      System.out.println(c);

  }
}
