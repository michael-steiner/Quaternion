package Movement;

import java.util.Random;

public class Mover {

  int sizeOfX1;
  int sizeOfX2;
  int x1Move;
  int x2Move;
  Random randomGenerator = new Random();

  Mover (int sizeX1, int sizeX2) {

    sizeOfX1 = sizeX1;
    sizeOfX2 = sizeX2;

  }

  public void makeMove (Component component) {

    int x1RandomNumber = randomGenerator.nextInt(2);
    int x2RandomNumber = randomGenerator.nextInt(2);
    int currentX1 = component.getCurrentX1Location();
    int currentX2 = component.getCurrentX2Location();

    switch (x1RandomNumber) {

      case 0:

        x1Move = -1;

        if (currentX1 + x1Move > -sizeOfX1) {
          component.setCurrentX1Location((currentX1 + x1Move));
          component.trackX1((currentX1 + x1Move));
        }

        break;

      case 1:

        x1Move = 1;

        if (currentX1 < sizeOfX1) {
          component.setCurrentX1Location((currentX1 + x1Move));
          component.trackX1((currentX1 + x1Move));
        }
        break;
    }

    switch (x2RandomNumber) {

      case 0:

        x2Move = -1;

        if (currentX2 + x2Move > -sizeOfX2) {

          component.setCurrentX2Location((currentX2 + x2Move));
          component.trackX2((currentX2 + x2Move));
        }

        break;

      case 1:

        x2Move = 1;

        if (currentX2 < sizeOfX2) {

          component.setCurrentX2Location((currentX2 + x2Move));

        }

    }

    for(Component outerComponent: component.getListOfOuterComponents()){

      outerComponent.setCurrentX1Location(component.getCurrentX1Location());
      outerComponent.setCurrentX2Location(component.getCurrentX2Location());

      System.out.println("Outer Component Move to x1: " + component.getCurrentX1Location() + " x2: " + component.getCurrentX2Location());


    }

  }


}


