package animals;

import java.util.*;

public class Main {

  public static void main(String[] args) {
    
    // Mamals
    Mamal panda = new Mamal("Panda", 1869);
    Mamal zebra = new Mamal("Zebra", 1778);
    Mamal koala = new Mamal("Koala", 1816);
    Mamal sloth = new Mamal("Sloth", 1804);
    Mamal armadillo = new Mamal("Armadillo", 1758);
    Mamal raccoon = new Mamal("Raccoon", 1758);
    Mamal bigfoot = new Mamal("Bigfoot", 2021);

    // Birds
    Bird pigeon = new Bird("Pigeon", 1837);
    Bird peacock = new Bird("Peacock", 1821);
    Bird toucan = new Bird("Toucan", 1758);
    Bird parrot = new Bird("Parrot", 1824);
    Bird swan = new Bird("Swan", 1758);

    // Fish
    Fish salmon = new Fish("Salmon", 1758);
    Fish catfish = new Fish("Catfish", 1817);
    Fish perch = new Fish("Perch", 1758);

    // create array list for all the animals
    ArrayList<AbstractAnimal> animalList = new ArrayList<AbstractAnimal>();
    animalList.add(panda);
    animalList.add(zebra);
    animalList.add(koala);
    animalList.add(sloth);
    animalList.add(armadillo);
    animalList.add(raccoon);
    animalList.add(bigfoot);
    animalList.add(pigeon);
    animalList.add(peacock);
    animalList.add(toucan);
    animalList.add(parrot);
    animalList.add(swan);
    animalList.add(salmon);
    animalList.add(catfish);
    animalList.add(perch);

    for (AbstractAnimal a: animalList) {
      System.out.println(a);
    }
    
  }
}