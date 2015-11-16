import java.util.Arrays;

class CustomerQueue implements PersonQueue {
  private Person[] customers;
  private static int MAX_QUEUE_SIZE = 5;

  private int customersWaiting;

  public void insert(Person customer) {
    if (this.customersWaiting == MAX_QUEUE_SIZE) {
      System.err.println("No space in this queue, try another shop");
      return;
    }

    this.customers[customersWaiting] = customer;
    this.customersWaiting++;
  }

  public Person retrieve () {
    if (this.customers.length == 0) {
      return null;
    }

    Person ret = this.customers[0];
    for (int i = this.customersWaiting - 1; i > 0; i--){
      this.customers[i] = this.customers[i - 1];
    }

    this.customersWaiting--;
    this.customers[this.customersWaiting] = null;
    return ret;
  }

  public CustomerQueue() {
    this.customers = new Person[MAX_QUEUE_SIZE];
    this.customersWaiting = 0;
  }

  public void print() {
    System.out.print(Arrays.toString(this.customers));
  }
}
