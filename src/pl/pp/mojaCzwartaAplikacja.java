package pl.pp;
import java.util.Scanner;
public class mojaCzwartaAplikacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Podaj dolny limit");
            int limit1 = scanner.nextInt();

            System.out.println("Podaj gorny limit");
            int limit2 = scanner.nextInt();

            int result1 = limit1 * limit1;
            int result2 = limit2 * limit2;
            int result3 = result1 + result2;

            if(limit1 >= limit2 ){
                System.out.println("Koniec");
                break;
            }

            System.out.println("suma wszystkich kwadratów liczb: "+result1+" i "+result2+" to "+result3);

        }
    }
}
