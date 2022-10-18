import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

public class DataBase {

    private ArrayList<Shape> tableShape = new ArrayList<>();
    private LinkedList<Carte> tableCarte = new LinkedList<>();
    private LinkedList<Carte> tableCarteTest = new LinkedList<>();

public void createCartes(int num , int numOfShape) {
    int inNum = num;

    tableShape.add(new Shape(1, "carreau"));
    tableShape.add(new Shape(2, "coeur"));
    tableShape.add(new Shape(3, "pique"));
    tableShape.add(new Shape(4, "trefle"));

    for (int i = numOfShape; i <= 4; i++) {

        for (int j = inNum; j <= 13; j++) {
            tableCarte.add(new Carte((j<10)?j:10, tableShape.get(i-1) ));
            if (j == 1) tableCarte.get(tableCarte.size() - 1).setName("L’as");
            else if (j > 10) {
                if (j == 11) tableCarte.get(tableCarte.size() - 1).setName("Valet");
                if (j == 12) tableCarte.get(tableCarte.size() - 1).setName("Dame");
                if (j == 13) tableCarte.get(tableCarte.size() - 1).setName("Roi");
            }
        } inNum = 1;
    }
//    ___________________________ create cartes reverse
    if (num != 1 || numOfShape != 1) {
        for (int i = 1; i <= numOfShape; i++) {
            int end = 13;
            if (i == numOfShape) end = num-1;

            for (int j = 1; j<=end ; j++) {
                tableCarte.add(new Carte((j<10)?j:10, tableShape.get(i-1)));
                if (j == 1) tableCarte.get(tableCarte.size() - 1).setName("L’as");
                else if (i > 10) {
                    if (j == 11) tableCarte.get(tableCarte.size() - 1).setName("Valet");
                    if (j == 12) tableCarte.get(tableCarte.size() - 1).setName("Dame");
                    if (j == 13) tableCarte.get(tableCarte.size() - 1).setName("Roi");
                }
            }
        }
    }
}

    public ArrayList<Shape> getTableShape() {
        return tableShape;
    }

    public void setTableShape(ArrayList<Shape> tableShape) {
        this.tableShape = tableShape;
    }

    public LinkedList<Carte> getTableCarte() {
        return tableCarte;
    }

    public void setTableCarte(LinkedList<Carte> tableCarte) {
        this.tableCarte = tableCarte;
    }

    @Override
    public String toString() {
        return "DataBase{" +
                "tableShape=" + tableShape +
                ", tableCarte=" + tableCarte +
                '}';
    }

   /* public void chihaja2(int number, int shape) {

        AtomicInteger index = new AtomicInteger();
//        LinkedList<Carte//////////
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 13; j++) {
                tableCarteTest.add(new Carte(j, tableShape.get(i - 1)));

            }
        }
        tableCarteTest.forEach((carte->{

            if(carte.getPoint() == number && carte.getShape().getNumber() == shape){
                index.set(tableCarteTest.indexOf(carte));

            }
        }));
        for(){

        }
    }*/
    public static void creatCartes2(int number, int shape){
        int end = 4;
        int startJ = number;
        int endJ = 13;
        int v = shape;
        for( int i= shape; i<=end; i++){
            for (int j=startJ; j<=endJ; j++){
                System.out.printf("("+j+"--"+i+")*******");
            }
            System.out.println("-----");
        }
        endJ=13;
        if (number!=1 || shape!=1){
            for( int i= 1; i<=shape; i++){
                if(i==shape) endJ=number-1;

                for (int j=1; j<=endJ; j++){
                    System.out.printf("("+j+"--"+i+")*******");

                }
                System.out.println("-----");
            }
        }


    }
}
