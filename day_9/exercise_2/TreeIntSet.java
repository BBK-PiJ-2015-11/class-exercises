public class TreeIntSet implements IntSet {
    private int value;
    private TreeIntSet left;
    private TreeIntSet right;

    public void add(int n) {
      if (this.contains(n)) {
        return;
      }

      if (n > this.value) {
        if (this.right == null) {
          this.right = new TreeIntSet(n);
        } else {
          this.right.add(n);
        }
      } else {
        if (this.left == null) {
          this.left = new TreeIntSet(n);
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

    public boolean containsVerbose(int n) {
      if (this.value == n) {
        System.out.println(this.value);
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


    public TreeIntSet(int n) {
      this.value = n;
    }

    public static void main(String[] args) {
      TreeIntSet root = new TreeIntSet(11);
      root.add(5);
      root.add(2);
      root.add(7);
      root.add(7);
      root.add(7);
      root.add(7);
      root.add(7);
      root.add(7);
      root.add(7);
      root.add(1);

      System.out.println(root);
    }
}
