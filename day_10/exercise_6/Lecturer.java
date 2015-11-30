/**
 * A lecturer has both teaching and research responsibilities
 */
public class Lecturer extends Teacher {
  public void doResearch(String topic) {
    System.out.println("Doing research on: " + topic);
  }
}
