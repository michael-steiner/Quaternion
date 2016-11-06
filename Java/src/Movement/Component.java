package Movement;

import java.util.LinkedList;

public class Component {

  public Population population;
  private int currentX1Location;
  private int currentX2Location;
  private LinkedList<Integer> x1Trajectory = new LinkedList<>();
  private LinkedList<Integer> x2Trajectory = new LinkedList<>();
  private boolean keyComponent;
  private LinkedList<Component> listOfOuterComponents = new LinkedList<>();
  private boolean newComponent = false;
  private Component myKeyComponent;
  private Polarity polarity;



  Component (Polarity charge) {

    currentX1Location = 0;
    currentX2Location = 0;
    x1Trajectory.add(currentX1Location);
    x2Trajectory.add(currentX2Location);
    keyComponent = true;
    myKeyComponent = this;
    polarity = charge;

  }

  public Polarity getPolarity () {

    return polarity;
  }

  public void setPolarity (Polarity polarity) {

    this.polarity = polarity;
  }

  public Component getMyKeyComponent () {

    return myKeyComponent;
  }

  public void setMyKeyComponent (Component myKeyComponent) {

    this.myKeyComponent = myKeyComponent;
  }

  public LinkedList<Component> getListOfOuterComponents () {

    return listOfOuterComponents;
  }

  public void setListOfOuterComponents (LinkedList<Component> listOfOuterComponents) {

    this.listOfOuterComponents = listOfOuterComponents;
  }

  public boolean isNewComponent () {

    return this.newComponent;
  }

  public void setNewComponent (boolean newComponent) {

    this.newComponent = newComponent;
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

    return this.keyComponent;
  }

  public void setKeyComponent (boolean keyComponent) {

    this.keyComponent = keyComponent;
  }

  public void trackX1 (int x1Move) {

    x1Trajectory.add(x1Move);
  }

  public void trackX2 (int x2Move) {

    x2Trajectory.add(x2Move);
  }

  public void addOuterComponent (Component component) {

    listOfOuterComponents.add(component);

  }
}
