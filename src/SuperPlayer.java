import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class SuperPlayer {
    private static AtomicInteger _ID = new AtomicInteger(0);
    private int id;
    private String name;
    private int points = 0;

    private LinkedList<Carte> playerCartes = new LinkedList<>();

    public SuperPlayer(String name) {
        this.name = name;
        this.id = _ID.incrementAndGet();
    }
    public void addCarteToPlayer(Carte carte){
        this.points += carte.getPoint();
        this.playerCartes.add(carte);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public LinkedList<Carte> getPlayerCartes() {
        return playerCartes;
    }

    public void showAllCarts(){
        System.out.println("=====> : "+this.name);
        System.out.println("Total points : "+getPoints());
        this.playerCartes.forEach((carte -> {
            System.out.print("  |  "+"("+carte.getPoint()+" "+carte.getShape().getNumber()+") -> ");
            System.out.print((carte.getName() == null) ? "" : carte.getName());
            System.out.print(" " + carte.getShape().getName());
        }));

        System.out.println();
    }
    public int youMustPlayed(){
        Scanner scn = new Scanner(System.in);
        System.out.println("=====> : You must played : "+this.name);
        System.out.println("Stand :"+1);
        System.out.println("Hit   :"+2);
        return scn.nextInt();
    }
    public void chickIfYouAreWin(){
        if (getPoints() == 21) System.out.println(getName() + " You Are Win");

    }

    public void setPlayerCartes(LinkedList<Carte> playerCartes) {
        this.playerCartes = playerCartes;
    }

}
