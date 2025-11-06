public class Person {
  // (1)
  protected String name = "name";
  // (2)
  protected String getName() {
    return name;
  }
  // (3)
  protected void setName(String name) {
    this.name = name;
  }
}