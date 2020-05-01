package animals;

public class Mamal extends AbstractAnimal {

  public Mamal() {
    
    super();

  }

  public Mamal(String name, int yearDiscovered) {
    
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

  // yearDiscovered
  @Override
  public void setYearDiscovered(int yearDiscovered) {
    this.yearDiscovered = yearDiscovered;
  }

  @Override
  public int getYearDiscovered() {
    return yearDiscovered;
  }

  // overrides
  @Override
  String move() {
    return "walk";
  }

  @Override
  String breath() {
    return "lungs";
  }

  @Override
  String reproduce() {
    return "live births";
  }

}