import java.util.Scanner;
public class factorial {
    static int Factorial(int n){
        if (n==0||n==1)
            return 1;
        else
            return n* Factorial(n-1);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :- ");
        int n= sc.nextInt();
        int result = Factorial(n);
        System.out.println("The factorial of the number is :-"+result);
    }

}
