import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

public class MatchLogic {

    private Match match ;

//    public MatchLogic() {
//        this.match = match;
//    }

    public MatchLogic(String nameP , int amountP) {
        this.match = new Match(new Player(nameP , amountP) , new Dealer("Dealer"));

    }
    public void startMatch(){

        this.match.getPlayer().addCarteToPlayer(this.match.getDealer().getOneCarte());
//        this.match.getDealer().addCarteToPlayer(this.match.getDealer().getOneCarte());
        this.match.getPlayer().addCarteToPlayer(this.match.getDealer().getOneCarte());
//        this.match.getDealer().addCarteToPlayer(this.match.getDealer().getOneCarte());
//        new Carte((j<10)?j:10, tableShape.get(i-1)
        this.match.getDealer().addCarteToPlayer(new Carte(1 , new Shape(1,"pique")));
        this.match.getDealer().getPlayerCartes().get(0).setName("L’as");
        this.match.getDealer().addCarteToPlayer(new Carte(10 , new Shape(1,"pique")));
//        this.match.getDealer().getPlayerCartes().get(0).setName("L’as");


                match.getDealer().shoeFirstCarteDealer();
        match.getPlayer().showAllCarts();

        while (match.getPlayer().youMustPlayed() == 2){
            match.getPlayer().addCarteToPlayer(match.getDealer().getOneCarte());
            match.getPlayer().showAllCarts();
            if(chickWin())System.exit(0);

        }match.getDealer().showAllCarts();
        winWithBlackjack();
        while (match.getDealer().youMustPlayed() == 2){
            match.getDealer().addCarteToPlayer(match.getDealer().getOneCarte());
            match.getDealer().showAllCarts();
            if(chickWin())System.exit(0);
        }

    }
    public boolean chickWin(){
        if(match.getDealer().getPoints() >=17) {
            if(match.getDealer().getPoints() > 21){System.out.println(match.getPlayer().getName()+" ARE WIN");return true;}
            if(match.getDealer().getPoints() == 21){System.out.println(match.getDealer().getName()+" ARE WIN");return true;}
            if(match.getPlayer().getPoints() > match.getDealer().getPoints()) System.out.println(match.getPlayer().getName()+" ARE WIN");
            else System.out.println(match.getDealer().getName()+" ARE WIN");
            return true;

        }
        if(match.getPlayer().getPoints()==21){System.out.println(match.getPlayer().getName()+" ARE WIN");return true;}
        if(match.getPlayer().getPoints() > 21){System.out.println(match.getDealer().getName()+" ARE WIN");return true;}


        return false;
    }
    public void winWithBlackjack(){
        AtomicBoolean black = new AtomicBoolean(false);
        AtomicBoolean jack = new AtomicBoolean(false);
        match.getDealer().getPlayerCartes().forEach((carte->{
            if(carte.getName() == "L’as") black.set(true);
            else if (carte.getPoint()==10)jack.set(true);
        }));
        if(jack.get() && black.get()){
            System.out.println(match.getDealer().getName()+" ARE WIN");
            System.exit(0);
        }
    }
    public void Shuffled(LinkedList<Carte> arr) {

        LinkedList<Carte> cartesIsCreated = arr;
        LinkedList<Carte> remainderCartes = cartesIsCreated;
        LinkedList<Carte> shuffledCards = new LinkedList<>();
        for(int i =0;i<100;i++){
            LinkedList card = tirerUneCarte(arr);
            shuffledCards =(LinkedList<Carte>) card.get(1);
            shuffledCards.add((Carte) card.get(0));

        }

        shuffledCards.forEach((item)->{
            this.match.getDealer().setOneRandCarte( item);
        });


    }
    public LinkedList tirerUneCarte(LinkedList<Carte> arr) {
        Random random = new Random();
        int n = random.nextInt(52);
        return extraireCarte(arr, n);
    }


    public LinkedList extraireCarte(LinkedList<Carte> arr1, int n) {
        LinkedList cardlist = new LinkedList<>();
        Carte carteTire;
        carteTire = arr1.get(n);
        arr1.remove(n);
        cardlist.add(carteTire);
        cardlist.add(arr1);
        return cardlist;
    }
    public void in_progressMatch(){

    }


    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }
}
