import java.util.LinkedList;
import java.util.Random;

public class Match {
    private Player player;
    private Dealer dealer ;
    public Match() {
    }

    public Match(Player player, Dealer dealer) {
        this.player = player;
        this.dealer = dealer;
        //random carts and give it to dealer

//         data.createCartes(2,"coeur");
//         data.createCartes(3,"pique");
//         data.createCartes(4,"trèfle");

//        LinkedList<Carte> tableCarte = data.getTableCarte();//get all carts
//        LinkedList<Carte> newRandCarte = new LinkedList<>();//make random carts
//                for(int i = tableCarte.size() ; i>0; i--){
//                    int rand = random.nextInt(tableCarte.size());
//                    newRandCarte.add(tableCarte.get(rand));
//                    tableCarte.remove(rand);
//                }
//        System.out.println(data.getTableCarte());
//        dealer.setRandCarte(data.getTableCarte());
//        dealer.getRandCarte()
//        System.exit(0);
    }

    public void randCartes(){
        Random rand = new Random();
        DataBase data = new DataBase();
        data.createCartes(3,3);
        LinkedList<Carte> cartesIsCreated = data.getTableCarte();
        LinkedList<Carte> remainderCartes = cartesIsCreated;
        LinkedList<Carte> randCartes = new LinkedList<>();
        for(int i = 1;i<=52;i++){
            int int_random = rand.nextInt(remainderCartes.size()-1);
            LinkedList<LinkedList<Carte>>  cartes =  this.dealer.extraire_ieme_carte(int_random ,remainderCartes);
//            randCartes.add(cartes.get(0).get(0));//error are here

        }

        System.exit(0);
        this.dealer.setRandCarte(randCartes);
        System.out.println(this.dealer.getRandCarte().toString());
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }


    public Dealer getDealer() {
        return dealer;
    }

    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }


    @Override
    public String toString() {
        return "Match{" +
                "player=" + player +
                ", dealer=" + dealer +
                '}';
    }
}
