public class Matrix {

  private int[][] matrix;

  public Matrix(int x, int y) {
    this.matrix = new int[x][y];

    for (int i = 0; i < x; i++) {
      for (int j = 0; j < y; j++) {
        this.matrix[i][j] = 1;
      }
    }
  }

  public void setElement(int x, int y, int val) {
    this.matrix[x][y] = val;
  }

  public void setRow(int x, String val) {

  }

  public void setColumn(int y, String val) {
  }


  public void prettyPrint() {
    for (int i = 0; i < this.matrix.length; i++) {

      for (int j = 0; j < this.matrix[i].length; j++) {
        System.out.print(this.matrix[i][j]);

        if (j < this.matrix[i].length) {
          System.out.print("\t");
        }
      }

      if (i < this.matrix.length) {
        System.out.print("\n");
      }
    }
  }

  public String toString() {
    String[] output = new String[this.matrix.length];

    for (int i = 0; i < this.matrix.length; i++) {
      output[i] = "";

      for (int j = 0; j < this.matrix[i].length; j++) {
        output[i] += this.matrix[i][j];

        if (j < this.matrix[i].length - 1) {
          output[i] += ",";
        }
      }
    }

    return "[" + String.join(";", output) + "]";
  }

  private int[] parseArray(in String) {
    int retLength = Math.floor(in.length / 2);
    int[] ret = new int[retLength];

    for (int i = 0; i < in.length; i++) {
      char current = in.charAt(i);

      if (i % 1 == 0) {
        if (current != `,`) {
          System.err.println("Numbers must be comma delimited in string: " + in);
          System.exit(1);
        }
      } else {
        if (current.matches(

      }
    }
  }
}
