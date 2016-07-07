package Movement;

import java.util.LinkedList;

public class Component {

  private int currentX1Location;
  private int currentX2Location;
  private LinkedList<Integer> x1Trajectory = new LinkedList<>();
  private LinkedList<Integer> x2Trajectory = new LinkedList<>();
  private boolean keyComponent;

  public Population population;

  Component () {

    currentX1Location = 0;
    currentX2Location = 0;
    x1Trajectory.add(currentX1Location);
    x2Trajectory.add(currentX2Location);
    keyComponent = true;
    population.addToPopulation(this);

  }

  public int getCurrentX1Location () {

    return currentX1Location;
  }

  public void setCurrentX1Location (int currentX1Location) {

    this.currentX1Location = currentX1Location;
  }

  public int getCurrentX2Location () {

    return currentX2Location;
  }

  public void setCurrentX2Location (int currentX2Location) {

    this.currentX2Location = currentX2Location;
  }

  public LinkedList<Integer> getX1Trajectory () {

    return x1Trajectory;
  }

  public void setX1Trajectory (LinkedList<Integer> x1Trajectory) {

    this.x1Trajectory = x1Trajectory;
  }

  public LinkedList<Integer> getX2Trajectory () {

    return x2Trajectory;
  }

  public void setX2Trajectory (LinkedList<Integer> x2Trajectory) {

    this.x2Trajectory = x2Trajectory;
  }

  public boolean isKeyComponent () {

    return keyComponent;
  }

  public void setKeyComponent (boolean keyComponent) {

    this.keyComponent = keyComponent;
  }

  public void trackX1 (int x1Move){
    x1Trajectory.add(x1Move);
  }

  public void trackX2 (int x2Move){
    x2Trajectory.add(x2Move);
  }
}
