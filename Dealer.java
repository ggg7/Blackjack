import java.util.Scanner;
public class Dealer
{
    Scanner sc = new Scanner(System.in);
    int dealerHole;
    int dealerFace;
    int hitCard;

    public Dealer(){}

    public int dealerHoleCard()
    {
        dealerHole = (int)(Math.random() * 10) + 1;
        if(dealerHole == 1)
        {
            System.out.println("Dealer, your hole is an Ace. Shall it be a 1, or an 11? Your other card is " + dealerHole);
            String Ace = sc.nextLine();
            dealerHole = Integer.parseInt(Ace);
        }

        return dealerHole;
    }

    public int dealerFaceCard()
    {
        dealerFace = (int)(Math.random() * 10) + 1;
        if(dealerFace == 1)
        {
            System.out.println("Dealer, your face is an Ace. Shall it be a 1, or an 11? Your other card is " + dealerFace);
            String Ace = sc.nextLine();
            dealerFace = Integer.parseInt(Ace);
        }

        return dealerFace;
    }

    public int Hit()
    {
        hitCard = (int)(Math.random() * 10) + 1;
        if(hitCard == 1)
        {
            System.out.println("Dealer, you pulled an Ace. Shall it be a 1, or an 11? Your other cards are " + dealerFace + "," + dealerHole);
            String Ace = sc.nextLine();
            dealerFace = Integer.parseInt(Ace);
        }

        return hitCard;
    }
}