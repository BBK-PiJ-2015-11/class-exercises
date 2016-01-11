public class MobilePhone extends OldPhone {
  private String[] lastNumbersCalled = new String[10];

  public MobilePhone(String brand) {
    super(brand);
  }

  public void ringAlarm(String msg) {
    System.out.println("ALARM: " + msg);
  }

  public void playGame(String name) {
    System.out.println("Playing game: " + name);
  }

  public void call(String number) {
    super.call(number);
    this.rememberCall(number);
  }

  public void printLastNumbers() {
    for(int i = this.lastNumbersCalled.length; i > 0; i--) {
      System.out.println(this.lastNumbersCalled[i - 1]);
    }
  }

  protected void rememberCall(String number) {
    for(int i = this.lastNumbersCalled.length - 1; i > 0; i--) {
      this.lastNumbersCalled[i] = this.lastNumbersCalled[i - 1];
    }

    this.lastNumbersCalled[0] = number;
  }
}
