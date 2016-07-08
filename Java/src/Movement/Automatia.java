package Movement;

public class Automatia {

  public static void main(String args[]){


    Component player1 = new Component();
    Component player2 = new Component();
   
    Population population = new Population();
    population.addToPopulation(player1);
    population.addToPopulation(player2);

    Mover mover = new Mover(2,2);
    Interaction interaction = new Interaction();

    for(int i = 0; i < 40; i++){

      System.out.println("move: " + i);

    for(Component component : population.getListOfPopulation()){

      mover.makeMove(component);
      System.out.println("x1: " + component.getCurrentX1Location() + " x2: " + component.getCurrentX2Location());
      interaction.checkForContact(component,population);
    }

    }}




}
