import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    String decyzja;

    do{
      System.out.println("Podaj przedmiot, z którego obliczymy średnią ocen:" + " ");
      String Przedmiot = sc.nextLine();

      ArrayList<Double> oceny = new ArrayList<>();

        System.out.println("Podaj oceny" + ":" + " ");
        double ocena = sc.nextInt();
        sc.nextLine();
        oceny.add(ocena);

      double suma = 0;
      System.out.println("Twoje oceny:");
      for( int i = 0; i < oceny.size(); i++){
        System.out.printf("\n", oceny.get(i));
        suma+= oceny.get(i);
      }
      double srednia = suma/oceny.size();
      if(srednia >= 2.0){
        System.out.println(srednia + " " + "zdałeś");
      }else {
        System.out.println(srednia + " " + "Nie zdałeś");
      }

      System.out.println("Pytanie czy chcesz spróbować jeszcze raz. (tak/nie)");
      decyzja = sc.nextLine();
      switch(decyzja){
        case "tak":
        System.out.println("Świetnie w takim razie zaczynamy ponownie");
        break;
        case "nie":
          System.out.println("Do widzenia");
          break;
        default:
          System.out.println("Podałeś złą wartość zjebie");
          break;
      }
    }while(decyzja.equals("tak"));
}
}