import java.util.ArrayList;
import java.util.LinkedList;

public class Dealer extends SuperPlayer {
    private LinkedList<Carte> randCarte = new LinkedList<>();
    private boolean allowed;
    public Dealer(String name) {
        super(name);
        System.out.println(randCarte);
    }

    public void shoeFirstCarteDealer(){
        System.out.println("=====> : "+getName());
        System.out.println("Total points : "+getPlayerCartes().get(0).getPoint());

        System.out.print("  |  "+"("+getPlayerCartes().get(0).getPoint()+" "+getPlayerCartes().get(0).getShape().getNumber()+") -> ");
        System.out.print((getPlayerCartes().get(0).getName() == null) ? "" : getPlayerCartes().get(0).getName());
        System.out.print(" " + getPlayerCartes().get(0).getShape().getName());
        System.out.print("  |  "+"***");

        System.out.println();
    }
    public Carte getOneCarte(){
        Carte carte = randCarte.get(0);
        randCarte.remove(0);
        return carte;

    }
    public LinkedList<LinkedList<Carte>> extraire_ieme_carte(int n , LinkedList<Carte> cartes){
        LinkedList<LinkedList<Carte>> newCartes = new LinkedList<LinkedList<Carte>>();

        LinkedList<Carte> gotCarte  = new LinkedList<>();
        gotCarte.add(cartes.get(n));

        cartes.remove(n);
        newCartes.add( gotCarte);
        newCartes.add(cartes);
        System.out.println(n);
        return newCartes;
    }
    /*public ArrayList melanger(ArrayList arr) {
        extraire_ieme_carte;
        return tirerUneCarte(arr);
    }
    public ArrayList tirerUneCarte(ArrayList arr) {
        Random random = new Random();
        int n = random.nextInt(52);
        return extraireCarte(arr, n);
    }*/

    public ArrayList extraireCarte(ArrayList arr,int n) {
        return arr;
    }

    public LinkedList<Carte> getRandCarte() {
        return randCarte;
    }

    public void setRandCarte(LinkedList<Carte> randCarte) {
        this.randCarte = randCarte;
    }
    public void setOneRandCarte(Carte carte){
        this.randCarte.add(carte);
    }
    public void extraire_ieme_carte(){

    }

    public boolean isAllowed() {
        return allowed;
    }

    public void setAllowed(boolean allowed) {
        this.allowed = allowed;
    }
}
