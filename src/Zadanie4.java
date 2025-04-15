import java.util.Scanner;
import java.util.ArrayList;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> zadania = new ArrayList<>();
        zadania.add("Zrób pranie");
        zadania.add("Ugotuj obiad");
        zadania.add("Znajdź dziewczynę (Sorry zadanie nie do wykonania)");

        System.out.println(zadania);
        System.out.println("Dobra, które zadanie chcesz usunąć tylko nie ostatnie :)");
        int wybor = sc.nextInt();
        switch (wybor) {
            case 1:
                zadania.remove(0);
                break;
            case 2:
                zadania.remove(1);
                break;
            case 3:
                zadania.remove(2);
                break;
            default:
                System.out.println("Nieznane polecenie");
                break;
        }
        System.out.println(zadania);
    }
}
