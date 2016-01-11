class HashUtilities {
  public static int shortHash (int n) {
    return Math.abs(n % 1000);
  }
}
