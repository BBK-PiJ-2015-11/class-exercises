public class ArrayCopier {

  public void copy (int[] src, int[] dst) {
    int srcLength = src.length;

    for(int i = 0; i < dst.length; i++) {
      if (srcLength > i) {
        dst[i] = src[i];
      } else {
        dst[i] = 0;
      }
    }
  }

}
