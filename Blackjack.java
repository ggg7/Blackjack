import java.util.Scanner;
public class Blackjack
{
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        Dealer d1 = new Dealer();
        Player p1 = new Player();

        RunBlackJack rbj = new RunBlackJack(d1, p1);
        rbj.gameSetup();
        rbj.gameRun();
    }
}