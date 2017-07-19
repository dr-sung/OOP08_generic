
public class GenericProgram {

  // bubble sort
  // generic program since it's independent of any specific object type
  public static void sort(MyComparable[] o) {

    for (int i = o.length - 1; i >= 0; i--) {
      for (int k = 0; k < i; k++) {
        if (o[k].compareTo(o[k+1]) > 0) {
          // swap o[k] and o[k+1]
          MyComparable temp = o[k];
          o[k] = o[k+1];
          o[k+1] = temp;
        }
      }
    }

  }

}
