package pl.pp;
import java.util.Scanner;
public class mojaTrzeciaAplikacja2 {
    public static void main(String[] args) {
        double celsjusza, kelwin;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Wprowadź liczbę w skali Fahrenheit");
            double num1 = scanner.nextDouble();
            if (num1 <= 0){
                System.out.println("Koneic");
                break;
            }
            celsjusza = (num1 - 32.0) / 1.8;
            kelwin = celsjusza + 273.16;
            System.out.printf("Temperatura w Fahrenheitach: %.2f\n", num1);
            System.out.printf("Temperatura w stopniach Celsjusza: %.2f\n", celsjusza);
            System.out.printf("Temperatura w stopniach Kelwina: %.2f\n", kelwin);
        }
    }
}
