import java.util.Scanner;
public class Multiples {
    static void printmultiples(int n, int k){
        if (k==1){
            System.out.println(n);
            return;
        }
        printmultiples(n,k-1);
        System.out.println(n*k);

    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        printmultiples(n,k);
    }
}
