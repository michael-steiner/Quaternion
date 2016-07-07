package Movement;

import java.util.Random;

public class Mover {

  int sizeOfX1;
  int sizeOfX2;
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

        if (currentX1 - 1 > -sizeOfX1) {
          component.setCurrentX1Location((currentX1 - 1));
          component.trackX1((currentX1 - 1));
        }

        break;

      case 1:

        if (currentX1 < sizeOfX1) {
          component.setCurrentX1Location((currentX1 + 1));
          component.trackX1((currentX1 + 1));
        }
        break;
    }

    switch (x2RandomNumber) {

      case 0:

        if (currentX2 - 1 > -sizeOfX2) {

          component.setCurrentX2Location((currentX2 - 1));
          component.trackX2((currentX2 - 1));
        }

        break;

      case 1:

        if (currentX2 < sizeOfX2) {

          component.setCurrentX2Location((currentX2 + 1));

        }

    }

  }

}
