import java.util.Arrays;

public class Exercise2 {

  public static void main(String[] args) {
    ArrayCopier arrayCopier = new ArrayCopier();

    int[] src = {1, 2, 3};
    int[] dst = {-1, -2, -3};

    arrayCopier.copy(src, dst);
    System.out.println(Arrays.toString(dst));

    int[] foo = {1, 2, 3, 4, 5};
    int[] bar = {-1, -2, -3};

    arrayCopier.copy(foo, bar);
    System.out.println(Arrays.toString(bar));

    int[] bibble = {1, 2, 3};
    int[] bobble = {-1, -2, -3, -4, -5};

    arrayCopier.copy(bibble, bobble);
    System.out.println(Arrays.toString(bobble));
  }

}
