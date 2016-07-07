package Movement;

import java.util.LinkedList;

public class Population {

  LinkedList<Component> listOfPopulation;

  public void addToPopulation (Component component) {

    listOfPopulation.add(component);
  }

  public Component getComponent (int compNumber) {

    return listOfPopulation.get(compNumber);

  }

}
