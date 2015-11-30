public class PhoneLauncher {
  public static void main(String[] args) {
    PhoneLauncher launcher = new PhoneLauncher();
    launcher.launch();
  }

  public void launch() {
    SmartPhone phone = new SmartPhone();
    phone.browseWeb("https://example.com");
    phone.findPosition();
    phone.call("555 12345");
    phone.call("555 39745");
    phone.call("555 12193");
    phone.call("555 22193");
    phone.call("555 32193");
    phone.call("555 42193");
    phone.call("555 52193");
    phone.call("555 52193");
    phone.call("555 72193");
    phone.call("555 82193");
    phone.call("555 92193");
    phone.ringAlarm("foo");
    phone.playGame("bar");
    phone.printLastNumbers();
  }
}
