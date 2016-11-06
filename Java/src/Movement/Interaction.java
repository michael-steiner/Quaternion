package Movement;

import java.util.LinkedList;

public class Interaction {

  Interaction () {

  }

  public void checkForContact (Component component, Population population) {

    Component movingComponent = component;

    LinkedList<Component> listOfNonMovingComponents = population.getListOfPopulation();

    //for (Component nonMovingComponents : population.getListOfPopulation()) {

    for (int k = 0; k < listOfNonMovingComponents.size(); k++) {

      Component nonMovingComponents = listOfNonMovingComponents.get(k);
      if (!(movingComponent.equals(nonMovingComponents))) {

        if (movingComponent.getCurrentX1Location() == nonMovingComponents.getCurrentX1Location() && movingComponent.getCurrentX2Location() == nonMovingComponents.getCurrentX2Location()) {
          if (!(movingComponent.getPolarity().equals(nonMovingComponents.getPolarity()))) {
            System.out.println("Contact!!!");

            nonMovingComponents.setKeyComponent(false);
            //nonMovingComponents.setNewComponent(true);
            movingComponent.addOuterComponent(nonMovingComponents);
            population.removeFromPopulation(nonMovingComponents);
            int tempX1Location = movingComponent.getCurrentX1Location();
            int tempX2Location = movingComponent.getCurrentX2Location();
            //for (Component nonKeyComponent :movingComponent.getListOfOuterComponents()){
            //  nonKeyComponent.setCurrentX1Location(tempX1Location);
            //  nonKeyComponent.setCurrentX2Location(tempX2Location);
            //  System.out.println("Interaction move to: x1 " + tempX1Location + "x2: " + tempX2Location);
            LinkedList<Component> listOfNonKeyComponents = movingComponent.getListOfOuterComponents();
            for (int i = 0; i < movingComponent.getListOfOuterComponents().size(); i++) {
              listOfNonKeyComponents.get(i).setCurrentX1Location(tempX1Location);
              listOfNonKeyComponents.get(i).setCurrentX2Location(tempX2Location);
              System.out.println("Interaction Opposite charge move to: x1 " + tempX1Location + " x2: " + tempX2Location);
              System.out.println("Polarity: " + movingComponent.getPolarity());

            }

          } else{
            movingComponent.setCurrentX1Location(movingComponent.getX1Trajectory().get(movingComponent.getX1Trajectory().size()-2));
            movingComponent.setCurrentX2Location(movingComponent.getX2Trajectory().get(movingComponent.getX2Trajectory().size()-2));
            System.out.println("Interaction Equal charge move to: x1 " + movingComponent.getCurrentX1Location() + "x2: " + movingComponent.getCurrentX2Location());
            System.out.println("Polarity: " + movingComponent.getPolarity());
            System.out.println("Polarity: " + nonMovingComponents.getPolarity());

          }
        }

      }

    }
  }

}


