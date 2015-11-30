public class SmartPhone extends MobilePhone {
  public SmartPhone(String brand) {
    super(brand);
  }

  public void browseWeb(String url) {
    System.out.println("Browsing " + url);
  }

  public void findPosition() {
    System.out.println("Co-ordinates: 51.5219508,-0.1302037");
  }

  public void call(String number) {
    if (number.trim().substring(0, 2).equals("00")) {
      System.out.println("Calling " + number + " through the Internet to save money");
      this.rememberCall(number);
    } else {
      super.call(number);
    }
  }
}
