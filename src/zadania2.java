import java.util.Scanner;
import java.util.ArrayList;

public class zadania2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> oceny = new ArrayList<>();
        System.out.println("Podaj oceny:" + " ");

        while (true) {
            double ocena = sc.nextDouble();
            if (ocena == 0) {
                break;
            }
            oceny.add(ocena);
        }
                    System.out.println("Lista ocen:");
                    for (double o : oceny) {
                        System.out.println(o);
                    }

        }
    }
