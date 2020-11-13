// Mike McFadden
// CSC 160
// November 13, 2020 
// Fall Semester Final Project: Dice Game 30 or Bust

	import java.util.Scanner; // scanner to input

	public class Main {
	  public static void main(String[] args) {

	String t;
	      Scanner obj = new Scanner(System.in); // create a object 
	      System.out.print("What is the username of the first player?: "); //
	      t = obj.nextLine(); // Take string input and assign to variable in order to print it to consul     
	      System.out.println("Hello, " + t); // Prints both hello and the user input username of player 1
	      System.out.println("You are player 1");

	String p;
		Scanner ob = new Scanner(System.in); // create a object 
		System.out.print("What is the username of the second player?: "); //
		p = obj.nextLine(); // Take string input and assign to variable in order to print it to consul     
		System.out.println("Welcome, " +p); // Prints both hello and the user input username of player 2
		System.out.println("You are player 2");
	      
	    System.out.println("I am the Game: 30 or Bust. I hope you win, or you DIE! MWAHAHAHA"); // prints out introduction
	    p = obj.nextLine();
	    System.out.println("Each player has two dice. The players take turns rolling their dice. When a player rolls both dice, the player may keep the total of both dice or the face value of either die to add to that players total. A player MUST select either the face value of one of the dice, or the total value of both dice. If a player's score goes over 30, then that player's score is reset to zero and play continues until one player obtains a score of exactly 30. The first player to score exactly 30 is the Winner."); // prints out rules for the player to read
	    p = obj.nextLine();
	    System.out.println("Let's get started. May the best player win."); 

	anything(); 
	
}
	
	    public static void anything() { 

	    int reset1 = 0; // sets player 1 initial reset count to zero
	    int count1 = 0; // sets player 1 initial count to zero
	    int score1 = 0; // sets player 1 initial score to zero
	    int reset2 = 0; // sets player 2 initial reset count to zero
	    int count2 = 0; // sets player 2 initial count to zero
	    int score2 = 0; // sets player 2 initial score to zero
	  
	    while (score1 != 30 || score2 != 30) { // sets up a loop with or statement so if score1 does not equal 30 OR score2

	    int dice1=(int)(Math.random()*6+1); // makes a dice (random numbers between 1-6)
	    int dice2=(int)(Math.random()*6+1); // makes another dice (random numbers between 1-6)
	    int sum= dice1 + dice2; // adds up the total of both dice

	    System.out.println("PLAYER 1 Score is: " + score1); // prints out original score which is zero
	    System.out.println("Roll 1: = " +dice1); // prints out the first roll
	    System.out.println("Roll 2: = " +dice2); // prints out the second roll
	    System.out.println("Roll sum: = " +sum); // prints out the sum of both rolls

      String q; 
      	Scanner objr = new Scanner(System.in); // create an object 
	    System.out.print("Would you like to keep roll 1 (A),roll 2 (B), or keep the sum: (C)?: "); 
	    q = objr.nextLine();    
	
	if (q.equals("A")) // if user chooses A, it will print that score plus previous score
{
	  	score1 += dice1;
	  	System.out.println("PLAYER 1 New score: " +score1);
}
	if (q.equals("B")) // if user chooses B, it will print that score plus previous score
{
		score1 += dice2;
		System.out.println("PLAYER 1 New score: " +score1);
}
	if (q.equals("C")) // if user chooses C it will print the sum of the two rolls plus previous score
{
		score1 += sum;
		System.out.println("PLAYER 1 New score: " + score1);
} 
	   
     	count1++; // increments the counts on each roll 
	
	if (score1 == 30) // when the score is exactly 30, the program lets you know you won, and prints the score, count, times reset, and encouraging note
{
	  System.out.println ("You WON PLAYER 1!! Congrats! I knew you could defeat me! You proved to be the better than player 1!"); // once score1 equals 30 it prints out a winning message
    
	  System.out.println ("Total number of resets PLAYER 1: " +reset1); // prints total number of resets at the end of the game
	  System.out.println("Total number of rolls PLAYER 1: " +count1); // prints the total number of rolls at the end of the game
	  System.out.println ("Total number of resets PLAYER 2: " +reset2); // prints total number of resets at the end of the game
	  System.out.println("Total number of rolls PLAYER 2: " +count2); // prints the total number of rolls at the end of the game

    if (score1 == 30 && reset1 == 0) // if score1 equals 30 AND reset1 equals 0 then print out a message that says the user managed to not reset their score

    	System.out.println("Wow good job PLAYER 1, you are perfect! You managed no resets!"); // just prints out a message if the user never resets the score

    if (count1 == 3 && score1 == 30)  // if count1 equals 3 AND score1 equals 30 then prints out message saying you are really perfect. statistically speaking this would rarely happen, but if the user somehow rolls 3 times and gets 30 total points it is the least times you can roll to reach 30

    	System.out.println("Holy cow PLAYER 1 you are really perfect! The fewest possible number of rolls you can get to reach 30 is 3."); 
    break; // breaks (ends) if condition is met
}
	if (score1 > 30) // when the score is more than 30, the program lets you know that you lost. It resets your score to zero, and restarts the game.
{
		System.out.println("You LOST PLAYER 1! You are now dead MWAHAHAHA I have defeated you... score has now reset.");
	  	score1 = 0;
	  	reset1 += 1;
 }
	if (score1 < 30) // if the score1 is less than 30 it goes to player 2's turn
 {
		System.out.println("Player 2's turn");
 }
	
 {
      	int dice3=(int)(Math.random()*6+1); // makes a dice (random numbers between 1-6)
	    int dice4=(int)(Math.random()*6+1); // makes another dice (random numbers between 1-6)
	    int sum2= dice3 + dice4; // adds up the total of both dice
  
	    System.out.println("PLAYER 2 Score is: " + score2); // prints out original score which is zero
	    System.out.println("Roll 1: = " +dice3); // prints out the first roll
	    System.out.println("Roll 2: = " +dice4); // prints out the second roll
	    System.out.println("Roll sum: = " +sum2); // prints out the sum of both rolls
	    
	    count2++; // increments the counts on each roll 
	
  String p; 
	   Scanner objp = new Scanner(System.in); // create a object 
	   System.out.print("Would you like to keep roll 1 (A),roll 2 (B), or keep the sum: (C)?: "); 
	   p = objp.nextLine();    
	
	if (p.equals("A")) // if user chooses A, it will print that score plus previous score
{
		score2 += dice3;
		System.out.println("PLAYER 2 New score: " +score2);
}
	if (p.equals("B")) // if user chooses B, it will print that score plus previous score
{
		score2 += dice4;
    	System.out.println("PLAYER 2 New score: " +score2);
}
	if (p.equals("C")) // if user chooses C it will print the sum of the two rolls plus previous score
{
		score2 += sum2;
	 	System.out.println("PLAYER 2 New score: " +score2);
}
	
	if (score2 == 30) // when the score is exactly 30, the program lets you know you won, and prints the score, count, times reset, and encouraging note
{
	  System.out.println ("You WON PLAYER 2!! Congrats! I knew you could defeat me! YOu proved to be better than player 1.");
    
	  System.out.println ("Total number of resets PLAYER 2: " +reset2); // prints total number of resets at the end of the game
	  System.out.println("Total number of rolls PLAYER 2: " +count2); // prints the total number of rolls at the end of the game
	  System.out.println ("Total number of resets PLAYER 1: " +reset1); // prints total number of resets at the end of the game
	  System.out.println("Total number of rolls PLAYER 1: " +count1); // prints the total number of rolls at the end of the game

    if (score2 == 30 && reset2 == 0) // if score2 equals 30 and reset equals 0 this just prints out a message if the user never resets the score

    	System.out.println("Wow good job PLAYER 2, you are perfect! You managed no resets!");

    if (count2 == 3 && score2 == 30) // if count1 equals 3 AND score1 equals 30 then prints out message saying you are really perfect. statistically speaking this would rarely happen, but if the user somehow rolls 3 times and gets 30 total points it is the least times you can roll to reach 30

	  	System.out.println("Holy cow PLAYER 2 you are really perfect! The fewest possible number of rolls you can get to reach 30 is 3."); 

    break; // breaks (ends) when condition is met
 }

	if (score2 > 30) // when the score is more than 30, the program lets you know that you lost. It resets your score to zero, and resets the players score.
{
	  System.out.println("You LOST PLAYER 2! You are now dead MWAHAHAHA I have defeated you... score has now reset.");
	  score2 = 0;
	  reset2 += 0;
}
	if (score2 < 30) // if player 2's score is less than 30 it send the turn to player 1 again
{
		System.out.println("Player 1's turn");
}
 
	
}
  }
 }
}
	
    
      
  
 