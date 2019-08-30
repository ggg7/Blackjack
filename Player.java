import java.util.Scanner;
public class Player
{
    Scanner sc = new Scanner(System.in);
    int playerFaceOne;
    int playerFaceTwo;
    int hitCard;

    public Player(){}

    public int playerFaceCardOne()
    {
        playerFaceOne = (int)(Math.random() * 10) + 1;
        if(playerFaceOne == 1)
        {
            System.out.println("Player, your first card is an Ace. Shall it be a 1, or an 11? Your other card is " + playerFaceTwo);
            String Ace = sc.nextLine();
            playerFaceOne = Integer.parseInt(Ace);
        }

        return playerFaceOne;
    }

    public int playerFaceCardTwo()
    {
        playerFaceTwo = (int)(Math.random() * 10) + 1;
        if(playerFaceTwo == 1)
        {
            System.out.println("Player, your second card is an Ace. Shall it be a 1, or an 11? Your other card is " + playerFaceOne);
            String Ace = sc.nextLine();
            playerFaceTwo = Integer.parseInt(Ace);
        }

        return playerFaceTwo;
    }

    public int Hit()
    {
        hitCard = (int)(Math.random() * 10) * 1;
        if(hitCard == 1)
        {
            System.out.println("Player, you pulled an Ace. Shall it be a 1, or an 11? Your current cards are " + playerFaceOne + ", " + playerFaceTwo);
            String Ace = sc.nextLine();
            hitCard = Integer.parseInt(Ace);
        }

        return hitCard;
    }
}