
import java.util.Scanner;
public class sumrec {
    static int seriesofsum(int n){
        if (n==0)return 0;
        if (n%2==0){
            return seriesofsum(n-1) -n;
        }
        else
            return seriesofsum(n-1)+n;
    }
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value you want to ulternate plus minus:- ");
        int n= sc.nextInt();
        System.out.println(seriesofsum(n));

    }
}
