package animals;

public abstract class AbstractAnimal {

  // fields
  private static int maxID = 0;
  protected int id;
  protected String name;
  protected int yearDiscovered;

  // constructor
  public AbstractAnimal() {
    
    maxID++;
    this.id = maxID;
    this.name = "Genric Name";
    this.yearDiscovered = 0;

  }

  public AbstractAnimal(String name, int yearDiscovered) {
    
    maxID++;
    this.id = maxID;
    this.name = name;
    this.yearDiscovered = yearDiscovered;
  }

  // getters and setters
  public String getName(){
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getYearDiscovered() {
    return yearDiscovered;
  }

  public void setYearDiscovered(int yearDiscovered) {
    this.yearDiscovered = yearDiscovered;
  }

  // abstract methods
  abstract String move();
  abstract String breath();
  abstract String reproduce();

  public void eatFoood() {
    System.out.println(this.name + " has eaten some food");
  }

  @Override
  public String toString() {
    return "Animal{" + " " +
            "id: " + id + ", " +
            "name: "  + name + ", " +
            "yearDiscovered: " + yearDiscovered + " }";
  }

}