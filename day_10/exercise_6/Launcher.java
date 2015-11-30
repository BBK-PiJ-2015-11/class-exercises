public class Launcher {
  public static void main(String[] args) {
    Lecturer lecturer = new Lecturer("Dirk");
    lecturer.doResearch("Brain surgery");
    System.out.println(lecturer.getName());
  }
}
