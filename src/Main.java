import java.io.PrintStream;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Hello world!");

        DataBase data = new DataBase();
        Menu menu = new Menu();
        LinkedList info = menu.insertInfo();
        data.createCartes(1,2);
        MatchLogic matchLogic = new MatchLogic((String)info.get(0) , (int)info.get(1));
        matchLogic.Shuffled(data.getTableCarte());
        matchLogic.startMatch();

//        menu.menuPrincipale(matchLogic.getMatch().getDealer().getPlayerCartes() , matchLogic.getMatch().getPlayer().getPlayerCartes());


//        System.out.println(matchLogic);
//        matchLogic.Shuffled(data.getTableCarte());
//        matchLogic.deal();
//        matchLogic.getMatch().getDealer().setRandCarte( matchLogic.Shuffled(data.getTableCarte()));
//        matchLogic.deal();
//        System.out.println(matchLogic.getMatch().toString());

    }

}