package animals;

import java.util.*;

public class Main {

  public static ArrayList<AbstractAnimal> filteredList = new ArrayList<AbstractAnimal>();
  
  public static void filterList(ArrayList<AbstractAnimal> animals, CheckAnimal tester) {
    
    filteredList.clear();
    for (AbstractAnimal a: animals) {
      if(tester.filter(a)) {
        filteredList.add(a);
      }
    }

  }


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
    System.out.println();

    System.out.println("*** List all the animals in descending order by year named ***");
    animalList.sort((a1, a2) -> a2.getYearDiscovered() - a1.getYearDiscovered());
    animalList.forEach((a) -> System.out.println(a)); 
    System.out.println();

    System.out.println("*** List all the animals alphabetically ***");
    animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
    animalList.forEach((a) -> System.out.println(a));
    System.out.println();

    System.out.println("*** List all the animals order by how they move ***");
    animalList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
    animalList.forEach((a) -> System.out.println(a));
    System.out.println();

    System.out.println("*** List only those animals the breath with lungs ***");
    filterList(animalList, a -> a.breath() == "lungs");
    for (int i = 0; i < filteredList.size(); i++) {
      System.out.println(filteredList.get(i));
    }
    System.out.println();

    System.out.println("*** List only those animals that breath with lungs and were named in 1758 ***");
    filterList(animalList, a -> (a.breath() == "lungs") && (a.getYearDiscovered() == 1758));
    for (int i = 0; i < filteredList.size(); i++) {
      System.out.println(filteredList.get(i));
    }
    System.out.println();

    System.out.println("*** List only those animals that lay eggs and breath with lungs ***");
    filterList(animalList, a -> (a.reproduce() == "eggs") && (a.breath() == "lungs"));
    for (AbstractAnimal a : filteredList) {
      System.out.println(a);
    }
    System.out.println();

    System.out.println("*** List alphabetically only those animals that were named in 1758 ***");
    filterList(animalList, a -> a.getYearDiscovered() == 1758);
    filteredList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
    for (int i = 0; i < filteredList.size(); i++) {
      System.out.println(filteredList.get(i));
    }

    System.out.println("*** Stretch Goal ***");
    System.out.println();
    System.out.println();

    System.out.println("*** For the list of animals, list alphabetically those animals that are mammals ***");
    filterList(animalList, a -> a instanceof Mamal);
    filteredList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
    for (int i = 0; i < filteredList.size(); i++) {
      System.out.println(filteredList.get(i));
    }




  }
}