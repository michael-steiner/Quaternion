package Movement;

import java.util.Random;

public class Automatia {

  public static void main (String args[]) {

    int sizeOfX1 = 2;
    int sizeOfX2 = 2;
    int numberOfMovesToMake = 100;
    int numberOfComponets = 3;

    Polarity polarity;

    Population population = new Population();

    Random random = new Random();

    for (int ii = 0; ii < (numberOfComponets + 1); ii++) {

      int getCharge = random.nextInt(2);

      if (getCharge == 0) {

        population.addToPopulation(new Component(Polarity.NEGATIVE));
      } else {

        population.addToPopulation(new Component(Polarity.POSITIVE));
      }

    }

    Mover mover = new Mover(sizeOfX1, sizeOfX2);
    Interaction interaction = new Interaction();

    for (int i = 0; i < numberOfMovesToMake; i++) {

      System.out.println("move: " + i);

      for (Component component : population.getListOfPopulation()) {

        mover.makeMove(component);
        System.out.println("x1: " + component.getCurrentX1Location() + " x2: " + component.getCurrentX2Location());
        interaction.checkForContact(component, population);
      }

    }
  }

}
