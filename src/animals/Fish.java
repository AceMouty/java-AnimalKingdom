package animals;

public class Fish extends AbstractAnimal {

  public Fish() {
    super();
  }

  public Fish(String name, int yearDiscovered) {
    super(name, yearDiscovered);
  }

  // getters and setters
  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setYearDiscovered(int yearDiscovered) {
    this.yearDiscovered = yearDiscovered;
  }

  public int getYearDiscovered() {
    return yearDiscovered;
  }

  // abstract methods
  @Override
  public String move() {
    return "swim";
  }

  @Override
  public String breath() {
    return "gills";
  }

  @Override
  public String reproduce() {
    return "eggs";
  }
}