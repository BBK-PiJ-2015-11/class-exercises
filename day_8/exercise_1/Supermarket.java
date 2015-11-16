class Supermarket {
  private CustomerQueue queue;

  private void addPerson(Person person) {
    this.queue.insert(person);
  }

  private Person servePerson() {
    return this.queue.retrieve();
  }

  private Supermarket () {
    this.queue = new CustomerQueue();
  }

  public static void main(String[] args) {
    Supermarket supermarket = new Supermarket();
    supermarket.run();
  }

  private void run() {
    Person amy = new Person("Amy");
    Person bob = new Person("Bob");
    Person cat = new Person("Cat");

    this.addPerson(amy);
    this.addPerson(bob);
    this.addPerson(cat);

    this.queue.print();
    System.out.println("");

    Person served = this.servePerson();

    System.out.println(served.getName() + " has been served");
    this.queue.print();
  }
}
