public class NewString extends String {
  public void printEven() {
    for(int i = this.length() - 1; i > -1; i--) {
      if (i % 2 == 0) {
        System.out.println(this.charAt(i));
      }
    }
  }

  public static void main(String[] args) {
    NewString str = (NewString) "foo";
    str.printEven();
  }
}
