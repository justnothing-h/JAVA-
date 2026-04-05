import java.util.Scanner;


public class primefactorisation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        for (int div = 2; div*div<=n; div++){
            while(n%div==0){    // if the number is divisible by div, then it is a prime factor
                n = n/div;
                System.out.print(div+" ");
            }
        }
        if(n!=1){
            System.out.print(n);

        }
            sc.close();
    }
}

