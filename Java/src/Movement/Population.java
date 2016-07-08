package Movement;

import java.util.LinkedList;

public class Population {

  LinkedList<Component> listOfPopulation = new LinkedList<>();

  public void addToPopulation (Component component) {

    listOfPopulation.add(component);
  }

  public void removeFromPopulation(Component component){
    listOfPopulation.remove(component);
  }

  public Component getComponent (int compNumber) {

    return listOfPopulation.get(compNumber);

  }

  public LinkedList<Component> getListOfPopulation(){

    return listOfPopulation;
  }

}
