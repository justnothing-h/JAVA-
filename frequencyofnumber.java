import java.util.Scanner;

public class frequencyofnumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int[] freq= new int[10];
        while(n>0){
            int digit = n%10;
            freq[digit]++;
            n= n / 10;
        }
        System.out.println("\nDigit Frequency:");
        for(int i =0; i<10; i++){
            if(freq[i]>0){
                System.out.println(i+ "Occours"+ freq[i] + "times");
                sc.close();
            }
        }
    }
}
