import java.util.Scanner;

public class VirtualPet {

   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      int happiness = 5;
      int hunger = 5;
      int energy = 5;
      
      int choice = 0;
      String petName = new String("");
      int rand = 0;
      
      System.out.println("Welcome to Virtual Pet Simulator!");
      System.out.print("Name your pet: ");
      petName = input.nextLine();
      
      System.out.println("\nYour pet's name is " + petName + ".");
      
      System.out.println("\n");

      // TODO 1 done:
      // Create a while loop that continues while:
      // happiness < 15
      // hunger < 10
      // energy > 0
      // choice != 5
      while (happiness < 15 && hunger < 10 && energy > 0 && choice != 5) {

         // TODO 2 done:
         // Display happiness, hunger, and energy.
         System.out.println("-------------------------");
         System.out.println("Happiness: " + happiness);
         System.out.println("Hunger: " + hunger);
         System.out.println("Energy: " + energy);
         System.out.println("-------------------------");
         
         System.out.println("\n");
         
         System.out.println("What would you like to do?");
         System.out.println("1. Feed");
         System.out.println("2. Play");
         System.out.println("3. Sleep");
         System.out.println("4. Bath");
         System.out.println("5. Quit");
         
         System.out.print("\nEnter your choice: ");
         choice = input.nextInt();
         
         System.out.println("\n");
         
         // TODO 3 done:
         // Create an if / else if / else statement
         // to handle the player's choice.
         //
         // Update the three statistics according
         // to the table in the instructions.
         //
         // Print a funny message for each action.
         if (choice == 1) {
            happiness += 1;
            hunger -= 3;
            energy += 0;
            System.out.println(petName + " loved that meal!");
         } else if (choice == 2) {
            happiness += 3;
            hunger += 2;
            energy -= 2;
            System.out.println(petName + " had so much fun playing!");
         } else if (choice == 3) {
            happiness -= 1;
            hunger += 1;
            energy += 3;
            System.out.println("Shhhh... " + petName + " is sleeping...");
         } else if (choice == 4) {
            happiness += 2;
            hunger += 1;
            energy -= 1;
            System.out.println(petName + " is nice and clean!");
         } else if (choice == 5) {
            // nothing
         } else if (choice == 6) {
            happiness += 2;
            hunger -= 5;
            energy += 1;
            System.out.println(petName + " found John and Cody's Emotional Support Peanut Butter!");
         } else {
            System.out.println("Invalid selection: " + choice);
         }
         
         System.out.println("\n");
         
         // random function
         rand = (int)Math.random()*10;
         if (rand = 7) {
            happiness += 1;
            hunger += 1;
            energy -= 1;
            System.out.println(petName + " went to the bathroom!");
            System.out.println("\n");
         }
      }
      
      // TODO 4 done:
      // After the loop, determine WHY the game ended.
      //
      // Did the pet become happy enough?
      // Did it get too hungry?
      // Did it run out of energy?
      // Did the player quit?
      //
      // Print the appropriate ending message.
      input.close();
      
      if (happiness >= 15) {
         System.out.println("--- YOU WIN ---");
         System.out.print(petName + " is super happy!");
      }
      
      if (hunger >= 10) {
         System.out.println("--- GAME OVER ---");
         System.out.print(petName + " got too hungry and ran away!");
      }
      
      if (energy <= 0) {
         System.out.println("--- GAME OVER ---");
         System.out.print(petName + " got too tired!");
      }
      
      if (choice == 5) {
         System.out.print("Goodbye!");
      }
   }
}