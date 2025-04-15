import java.util.Scanner;
import java.util.ArrayList;

public class Zadanie3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<String> zakupy = new ArrayList<>();
        zakupy.add("masło");
        zakupy.add("kiłbasa");
        zakupy.add("szynka");
        zakupy.add("ser");

        while(true){
            System.out.println("Podaj produkt z listy:" + " ");
            String produkt = sc.nextLine();

            if(zakupy.contains(produkt)){
                System.out.println("Szulany produkt"+  " " + produkt + " " + "jest na liście");
            }else if(produkt.equals("nic")){
                break;
            }else{
                System.out.println("Produkt, króego szukasz nie ma na liście");
            }
        }
    }
}
