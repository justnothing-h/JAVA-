import java.util.Scanner;

public class W09_P2 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();   // e.g. 5+6

        double num1 = 0;
        double num2 = 0;
        char operator = ' ';

        // find operator position
        for (int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i);

            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {

                operator = ch;

                num1 = Double.parseDouble(input.substring(0, i));
                num2 = Double.parseDouble(input.substring(i + 1));

                break;
            }
        }

        double result = 0;

        if (operator == '+')
            result = num1 + num2;

        else if (operator == '-')
            result = num1 - num2;

        else if (operator == '*')
            result = num1 * num2;

        else if (operator == '/')
            result = num1 / num2;

        // round result
        long finalResult = Math.round(result);

        // print in required format
        System.out.println(input + " = " + finalResult);

        sc.close();
    }
}