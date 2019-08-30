import java.util.Scanner;
public class RunBlackJack
{
    Scanner sc = new Scanner(System.in);
    Dealer d1;
    Player p1;
    int dealerSum;
    int playerSum;
    int dhc;
    int dfc;
    int pfc1;
    int pfc2;
    int dh;
    int ph;

    public RunBlackJack(Dealer d2, Player p2)
    {
        d1 = d2;
        p1 = p2;
    }

    public void gameSetup()
    {
        dhc = d1.dealerHoleCard();
        dfc = d1.dealerFaceCard();
        pfc1 = p1.playerFaceCardOne();
        pfc2 = p1.playerFaceCardTwo();

        dealerSum = dhc + dfc;
        playerSum = pfc1 + pfc2;
    }

    public void gameRun()
    {
        if(dealerSum == 17)
        {
            System.out.println("The dealer has 17 and stands. Dealer wins!");
        }

        do
        {
            System.out.println("Player, your current sum is " + playerSum + ". Would you like to hit?");
            String answer = sc.nextLine();
            if(answer.equals("yes")) 
            {
                ph = p1.Hit();
                playerSum += ph;
                if(playerSum > 21)
                {
                    System.out.println("The player has busted. Dealer wins!");
                    System.exit(0);
                }
            }
            else if(answer.equals("no"))
            {
                break;
            }
        }while(playerSum < 21);

        while(dealerSum < 17)
        {
            System.out.println("Dealer, your current sum is " + dealerSum + ". The player's sum is " + playerSum + ". Would you like to hit?");
            String answerDealer = sc.nextLine();
            if(answerDealer.equals("yes"))
            {
                dh = d1.Hit();
                dealerSum += dh;
                if(dealerSum == 17)
                {
                    System.out.println("The dealer has 17 and stands. Dealer wins!");
                }
                else if(dealerSum > 21)
                {
                    System.out.println("Dealer's hand is over 21. Dealer loses!");
                }
            }
            else if(answerDealer.equals("no"))
            {
                if(playerSum < 21 & playerSum > dealerSum)
                {
                    System.out.println("Player is closer to 21. Player wins!");
                }
                else if(playerSum > 21)
                {
                    System.out.println("The player has busted. Dealer wins!");
                }
                else if(playerSum < 21 & playerSum < dealerSum)
                {
                    System.out.println("The dealer is closer to 21. Dealer wins!");
                }
                break;
            }
        }
    }
}