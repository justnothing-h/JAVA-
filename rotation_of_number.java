import java.util.Scanner;

public class rotation_of_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit: ");
        int n = sc.nextInt();
        System.out.println("Enter the number of rotation: ");
        int k = sc.nextInt();
        int count= 0;
        int temp = n;
        while(temp!= 0 ){
            temp  =temp/10;
            count ++;
        }
        k = k%count;
        int div = (int)Math.pow(10,k);
        int term1 = n%div;
        int term2 = n/div;
        int result = (term1 * (int)Math.pow(10,count-k)) + term2;
        System.out.println(result);
        sc .close();
        
    }
}
