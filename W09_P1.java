
    import java.util.Scanner;

public class W09_P1 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // Declare 5x5 array
        int[][] arr = new int[5][5];

        // Read input row by row as string
        for (int i = 0; i < 5; i++) {
            String line = sc.next();
            
            for (int j = 0; j < 5; j++) {
                arr[i][j] = line.charAt(j) - '0';
            }
        }

        // Flip 0 -> 1 and 1 -> 0
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                if (arr[i][j] == 0)
                    arr[i][j] = 1;
                else
                    arr[i][j] = 0;

            }
        }

        // Print output in required format
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}

