package Movement;

public class Interaction {

  Interaction () {

  }

  public void checkForContact (Component component, Population population) {

    Component movingComponent = component;

    for (Component nonMovingComponents : population.getListOfPopulation()) {

      if (!(movingComponent.equals(nonMovingComponents))) {

        if (movingComponent.getCurrentX1Location() == nonMovingComponents.getCurrentX1Location() && movingComponent.getCurrentX2Location() == nonMovingComponents.getCurrentX2Location()) {

          System.out.println("Contact!!!");

          nonMovingComponents.setKeyComponent(false);
          //nonMovingComponents.setNewComponent(true);
          movingComponent.addOuterComponent(nonMovingComponents);
          population.removeFromPopulation(nonMovingComponents);
          int tempX1Location = movingComponent.getCurrentX1Location();
          int tempX2Location = movingComponent.getCurrentX2Location();
          for (Component nonKeyComponent :movingComponent.getListOfOuterComponents()){
            nonKeyComponent.setCurrentX1Location(tempX1Location);
            nonKeyComponent.setCurrentX2Location(tempX2Location);
            System.out.println("Interaction move to: x1 " + tempX1Location + "x2: " + tempX2Location);




          }

        }

      }
    }

  }

}
