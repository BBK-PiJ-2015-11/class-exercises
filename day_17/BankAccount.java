public class BankAccount {
  private int balance = 0;

  public int getBalance() {
    return balance;
  }

  public synchronized void deposit(int money) {
    balance = balance + money;
  }

  public int retrieve(int money) {
    int result = 0;
    Object lock = new Object();
    synchronized(lock) {
      if (balance > money) {
        result = money;
      } else {
        result = balance;
      }
      balance = balance - result;
    }
    return result;
  }
}
