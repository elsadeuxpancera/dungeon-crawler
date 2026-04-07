import java.util.Scanner;

public class Game {   
   public static void main(String[] args) {
      boolean exitGame = false;
      Game game = new Game();
      Map dungeonMap = new Map(5, 6);
            
      Scanner scanner = new Scanner(System.in);
      
      
      // TODO: Create a Map which populates each element of the grid with a Room
      // that contains a random assortment of Monsters and Items
      Map randomMap = new Map(5,6);
      randomMap.populateMap();
      
      // TODO: Create a Player at a random location in the Map
      // HINT: Generate random row/column values using Math.random()
      // and pass them into the Player constructor
      int randomX = (int) (Math.random() * 5);
      int randomY = (int) (Math.random() * 6);
      Player player = new Player(100, "Elsa", randomX, randomY);
            
      while (exitGame != true) {
            System.out.print("Enter command: ");
            String input = scanner.nextLine().toUpperCase();
                        
            if (input.equals("EXIT")) {
                System.out.println("Exiting game. Goodbye!");
                exitGame = true;
            } 
            else if (input.equals("LOOK") || input.equals("SEARCH")) {
               System.out.println(player.look(randomMap));
            }
            // TODO: get the player movement working correctly. It should NOT let the player
            // move beyond the boundaries of the map, and provide the user with descriptions
            // of what is happening. You'll have to change the if/else/if statements here to 
            // do this.
            else if (input.startsWith("MOVE ")) {
               String direction = input.substring(5);
               if (direction.equals("UP")) {
                  if ((randomX - 1) >= 1) {
                     randomX = randomX -1;
                     player.moveTo(randomX, randomY);
                  } else { 
                     System.out.println("Out of bounds, player cannot go up");
                  }
                  System.out.println("Your Position: " + randomX + ", " + randomY);
               } else if (direction.equals("DOWN")) {
                  if ((randomX + 1) <= 5) {
                     randomX = randomX +1;
                     player.moveTo(randomX, randomY);
                  } else {
                     System.out.println("Out of bounds, player cannot go down");
                  }
                  System.out.println("Your Position: " + randomX + ", " + randomY);
               } else if (direction.equals("LEFT")) {
                  if ((randomY - 1) >= 1) {
                     randomY = randomY -1;
                     player.moveTo(randomX, randomY);
                  } else {
                     System.out.println("Out of bounds, player cannot go left");
                  }
                  System.out.println("Your Position: " + randomX + ", " + randomY);    
               } else if (direction.equals("RIGHT")) {
                  if ((randomY + 1) <= 6) {
                     randomY = randomY +1;
                     player.moveTo(randomX, randomY);
                  } else {
                     System.out.println("Out of bounds, player cannot go right");
                  }
                  System.out.println("Your Position: " + randomX + ", " + randomY);
               } else {
                  System.out.println("You're trying to move in an invalid direction. Please choose UP, DOWN, LEFT or RIGHT");
               }
            }
         // TODO: display a message to the user telling them their current coordinates every time they move
       }
   }
}