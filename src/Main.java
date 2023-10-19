import java.util.Scanner;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        String playAgain = "";
        String totalPoints ="";
        int points = 0;
        int die1 = 0;
        int die2 = 0;

        do {
            System.out.println("Rolling the dice...");
            die1 = rnd.nextInt(6) + 1;
            die2 = rnd.nextInt(6) + 1;
            int diceRoll = die1 + die2;


            if(diceRoll == 2 || diceRoll == 3 || diceRoll == 12)
            {
                System.out.println("Sorry, you crapped out with " + diceRoll + "! Feel free to try your luck again!");
            }
            else if (diceRoll == 7 || diceRoll == 11)
            {
                System.out.println("You rolled a natural " + diceRoll + "! Congrats, you win! Feel free to test your luck again!");
            } else {
                points = diceRoll;
                System.out.println("You now have " + points + " points");

                boolean keepGoing = true;

                while(keepGoing)
                {
                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    diceRoll = die1 + die2;

                    if (diceRoll == 7)
                    {
                        System.out.println("Unlucky, you rolled a 7 and lost :(");
                        keepGoing = false;
                    } else if (diceRoll == points)
                    {
                        System.out.println("You got the point sum you win!");
                        keepGoing = false;
                    }
                    else
                    {
                        System.out.println("Hoping for a point here...");
                    }
                }


            }
            System.out.println("Would you like to play again Y/N?");
            playAgain = in.nextLine().toUpperCase();
        } while (playAgain.equals("Y"));
    }
}
