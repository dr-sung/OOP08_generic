
public class Car implements MyComparable {

  public Car(String model, int price) {
    this.model = model;
    this.price = price;
  }

  public int getPrice() {
    return price;
  }

  @Override
  public int compareTo(MyComparable other) {

    assert other instanceof Car: "not Car type";
    
    int otherPrice = ((Car)other).getPrice();
    if (price > otherPrice)
      return 1;
    else if (price < otherPrice)
      return -1;
    else
      return 0;
  }

  @Override
  public String toString() {
    return "Model: " + model + " Price: " + price;
  }

  private final String model;
  private final int price;

}
