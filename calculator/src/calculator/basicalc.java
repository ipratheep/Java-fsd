package calculator;
import java.util.Scanner;

public class basicalc {
    public static void main(String [] args){
        int operator;
        double n1, n2;
        System.out.println(" 1 - Add \n 2 - Subtract \n 3 - Multiply \n 4 - Divide");
        System.out.println(" Choose the number");
        Scanner sc = new Scanner(System.in);
        operator = sc.nextInt();
        System.out.println("Enter the first number : ");
        n1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        n2 = sc.nextInt();

        double result = 0;
        switch (operator){
            case 1:
                result = n1 + n2;
                break;

            case 2:
                result = n1 - n2;
                break;

            case 3:
                result = n1 * n2;

            case 4:
                result = n1 / n2;

            default:
                System.out.println("Enter the valid operator");

        }
        System.out.println("The result is : "+result);
    }
}
