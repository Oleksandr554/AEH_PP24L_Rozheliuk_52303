package pl.pp;
import java.util.Scanner;
public class mojaCzwartaAplikacja2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Prosze wybrac opcje:");
            System.out.println("1-plus");
            System.out.println("2-minus");
            System.out.println("3-mnozenia");
            System.out.println("4-dzielenia");
            var choise = scanner.nextInt();

            if(choise >4 || choise < 1 ) {
                System.out.println("Niepoprawny wybór. Wybierz ponownie.");
                continue;
            }

            System.out.println("Podaj pierszi libczbe");
            int num1 = scanner.nextInt();
            System.out.println("Podaj droga liczbe");
            int num2 = scanner.nextInt();

            switch (choise){
                case 1:
                    System.out.println("Wynik dodawania: "+(num1 +num2 ));
                    break;
                case 2:
                    System.out.println("Wynik odejmowania: "+ (num1-num2));
                    break;
                case 3:
                    System.out.println("Wynik mnożenia: "+(num1*num2));
                    break;
                case 4:
                    System.out.println("Wynik dzielenia: "+(num1/num2));
                    break;
            }
            break;
        }
    }
}
