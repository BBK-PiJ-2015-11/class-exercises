public class IntegerTreeNode {
    private int value;
    private IntegerTreeNode left;
    private IntegerTreeNode right;

    public void add(int n) {
      if (n > this.value) {
        if (this.right == null) {
          this.right = new IntegerTreeNode(n);
        } else {
          this.right.add(n);
        }
      } else {
        if (this.left == null) {
          this.left = new IntegerTreeNode(n);
        } else {
          this.left.add(n);
        }
      }
    }

    public boolean contains(int n) {
      if (this.value == n) {
        return true;
      }

      if (n > this.value) {
        if (this.right == null) {
          return false;
        } else {
          return this.right.contains(n);
        }
      } else {
        if (this.left == null) {
          return false;
        } else {
          return this.left.contains(n);
        }
      }
    }

    public int getMax() {
      if (this.right == null) {
        return this.value;
      } else {
        return this.right.getMax();
      }
    }

    public int getMin() {
      if (this.left == null) {
        return this.value;
      } else {
        return this.left.getMin();
      }
    }

    public String toString() {
      String ret = "[" + this.value;

      if (this.left != null) {
        ret += " ";
        ret += this.left;
      }

      if (this.right != null) {
        ret += " ";
        ret += this.right;
      }

      ret += "]";

      return ret;
    }

    public IntegerTreeNode(int n) {
      this.value = n;
    }

    public static void main(String[] args) {
      IntegerTreeNode root = new IntegerTreeNode(11);
      root.add(5);
      root.add(2);
      root.add(7);
      root.add(1);

      System.out.println(root.contains(11));
      System.out.println(root.contains(5));
      System.out.println(root.contains(2));
      System.out.println(root.contains(9));
      System.out.println(root.contains(3));

      System.out.println(root.getMin());
      System.out.println(root.getMax());

      System.out.println(root);
    }
}
