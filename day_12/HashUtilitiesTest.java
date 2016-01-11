import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class HashUtilitiesTest {
  @Test
  public void testsNormalName() {
    for(int i = 1000000; i > 0; i--) {
      int actual = HashUtilities.shortHash(i);
      assertTrue("out of range", 0 <= actual && actual <= 1000);
    }
  }
}
