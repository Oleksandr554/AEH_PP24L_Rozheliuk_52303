package pl.pp;

import java.util.Scanner;

public class mojaTrzeciaAplikacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Podaj liczbę dni lub wpisz liczbę niedodatnią aby zakończyć:");
            int num1 = scanner.nextInt();
            if (num1 <= 0){
                System.out.println("Koniec");
                break;
            }
            int week = 7;
            var result = num1 / 7;
            var result2 = num1 % 7;
            System.out.println(num1+" dni to "+result+" tygodnie i "+result2+" dni");
        }
    }
}
