import java.util.ArrayList;

public class Room {
   private ArrayList<Item> itemsInRoom;
   private ArrayList<Monster> monstersInRoom;
   private final int maxNumberOfMonsters = 2;
   private final int maxNumberOfItems = 2;
   
   public Room() {
      // TODO: Generate a random number of monsters and items between 1 and max (inclusive)
      itemsInRoom = new ArrayList<Item>();
      monstersInRoom = new ArrayList<Monster>();
      int numItems = (int) (Math.random() * maxNumberOfMonsters + 1);
      int numMonsters = (int) (Math.random() * maxNumberOfItems + 1);
      for (int i = 0; i < numItems; i ++) {
         Item item = new Item();
         itemsInRoom.add(new Item());
      }
      for (int i = 0; i < numMonsters; i ++) {
         Monster monster = new Monster();
         monstersInRoom.add(new Monster());
      }
      // TODO: Create the ArrayLists to hold the Items and Monsters in the Room and populate them with Monsters and Items
   }
   
   public String toString() {
      String returnString = "Items and monsters in room: ";
      for (Item item : itemsInRoom) {
         returnString = returnString + "\n" + item;
      }
      for (Monster monster : monstersInRoom) {
         returnString = returnString + "\n" + monster;
      } returnString = returnString + "\n";

      // TODO: build a returnString that nicely formats the Monsters and Items in the Room
      // HINT: Use a for-each loop to go through the ArrayLists
      return returnString;
   }
   
   public static void main(String[] args) {
      Room room = new Room();
      System.out.println(room);
   }

}