package Movement;

public class Automatia {

  public static void main(String args[]){


    Component player1 = new Component();
    Mover mover = new Mover(10,10);

    for(int i = 0; i < 100; i++){

      mover.makeMove(player1);
      System.out.println("Moved to: " + "(" + player1.getCurrentX1Location() + "," + player1.getCurrentX2Location() + ")");


    }


  }

}
