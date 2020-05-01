package animals;

public class Bird extends AbstractAnimal {

  public Bird() {
    super();
  }

  public Bird(String name, int yearDiscovered) {
    super(name, yearDiscovered);
  }

  // getters and setters

  // name
  @Override
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void setYearDiscovered(int yearDiscovered) {
    this.yearDiscovered = yearDiscovered;
  }

  @Override
  public int getYearDiscovered() {
    return yearDiscovered;
  }

  // overrides
  // abstract methods
  @Override
  public String move() {
    return "fly";
  }

  @Override
  public String breath() {
    return "lungs";
  }

  @Override
  String reproduce() {
    return "eggs";
  }

}