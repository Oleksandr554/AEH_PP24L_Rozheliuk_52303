package pl.pp;
import java.util.Scanner;
public class mojaDrugaAplikacja {
    public static void main(String[] args) {
        int x;
        x = 10;
        var relust = x * x;
        System.out.println("| x | x="+ x +" | x kwadrat = "+ relust +" |");

        System.out.println("---------------------------------------------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile masz lat?: ");
        int age = scanner.nextInt();

        int year = 365;
        int hours = 24;
        int minute = 60;
        int seconds  = 60;
        var result1 = year * hours; // ile godzin trwa rok
        var result2 = result1 * minute;// ile minut trwa rok
        var result3 = result2 * seconds;//ile sekund trwa rok

        System.out.println("To jest pana wiek przeliczony na sekundy: "+ age * result3);
        System.out.println("---------------------------------------------------------------------------------------------");
    }
}
