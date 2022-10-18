import java.util.LinkedList;
import java.util.Scanner;

public class Menu extends Thread{

    boolean allowedShowCarte = false;
    public void menuPrincipale(LinkedList<Carte> lealerCarts, LinkedList<Carte> playerCarts){

        System.out.print("=== dealer carts : ");
        lealerCarts.forEach((carte -> {
            System.out.print("  |  "+"("+carte.getPoint()+" "+carte.getShape().getNumber()+") -> ");
            System.out.print((carte.getName() == null) ? "" : carte.getName());
            System.out.print(" " + carte.getShape().getName());
           if(lealerCarts.indexOf(carte) == lealerCarts.size()-1 == allowedShowCarte==false){

               System.out.println("***");
               allowedShowCarte = true;
               this.stop();
           }
        }));


        //(12 3)) -> (Dame Pique)
        //
        //​
        //
        //(5 1) -> (5 Carreau)
    }
    public LinkedList insertInfo(){
        LinkedList returnArr = new LinkedList<>();
        Scanner scn = new Scanner(System.in);

        int amountP;
        System.out.println("for make deal - you must into you answers :");
        System.out.println("======> Player :");
        System.out.print("Entre your name : ");
        returnArr.add(scn.nextLine());//name
        do {
            System.out.print("Entre your amount : ");
            amountP = scn.nextInt();
            if ( 25 >= amountP) {
                System.out.println("You must entre more than 25:");

            }
        } while (amountP < 25);
        returnArr.add(amountP);
        return returnArr;

    }

}
