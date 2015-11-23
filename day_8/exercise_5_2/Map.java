class Map implements SimpleMap {
  private int size;
  private int[] keys;
  private String[] values;

  private static int ARRAY_INCREMENT = 10;

  public Map() {
    this.keys = new int[arrayIncrement];
    this.values = new String[arrayIncrement];
    this.size = 0;
  }

  public void put(int key, String name) {
    if (this.size == this.keys.length()) {
      this.expandArrays();
    }

    this.keys[this.size] = key;
    this.values[this.size] = name;
    this.size++;
  }

  public String get(int key) {
    for (int i = 0; i < this.size; i++) {
      if (this.keys[i] == key)  {
        return this.value[i];
      }
    }
  }

  public void remove(int key) {
    for (int i = 0; i < this.size; i++) {
      if (this.keys[i] == key)  {
        break;
      }
    }

    for (int j = i; j < this.size; j++) {
      this.keys[j] = this.keys[j+1];
      this.values[j] = this.values[j+1];
    }


    this.keys[this.size - 1] = null;
    this.values[this.size - 1] = null;
  }

  public boolean isEmpty() {
    return this.size == 0;
  }

  private expandArrays() {
    int newSize = this.keys.length() + ARRAY_INCREMENT;
    int[] biggerKeyArray = new int[newSize];
    int[] biggerValuesArray = new String[newSize];

    for (int i = 0; i < this.size; i++) {
      biggerKeyArray[i] = this.keys[i];
      biggerValuesArray[i] = this.values[i];
    }

    this.keys = biggerKeyArray;
    this.values = biggerValuesArray;
  }
}
