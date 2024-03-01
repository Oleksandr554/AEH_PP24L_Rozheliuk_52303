import java.util.Scanner;

public class kalkulator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int operand1 = nextInt();
        int operand2 = nextInt();
        char operation = getOperation();
        int result = calc(operand1,operand2,operation);
        System.out.println("result: "+result);
    }

    public static int nextInt(){
        System.out.println("num:");
        int operand;
        if(scanner.hasNextInt()){
            operand = scanner.nextInt();
        } else {
            System.out.println("error");
            scanner.next();//рекурсия
            operand = nextInt();
        }
        return operand;
    }

    public static char getOperation(){
        System.out.println("operation:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("try again");
            scanner.next();//рекурсия
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int operand1, int operand2, char operation){
        int result;
        switch (operation){
            case '+':
                result = operand1+operand2;
                break;
            case '-':
                result = operand1-operand2;
                break;
            case '*':
                result = operand1*operand2;
                break;
            case '/':
                result = operand1/operand2;
                break;
            default:
                System.out.println("try again");
                result = calc(operand1, operand2, getOperation());//рекурсия
        }
        return result;
    }
}