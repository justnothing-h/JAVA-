
public class maxofarray {
    static int findmax(int[] arr, int i){
        if (i==arr.length - 1){// base case: if it's the last element, return it
            return arr[i];
        }

            int maxrest = findmax(arr,i+1);
            return Math.max(arr[i], maxrest);
        }

        
        public static void main(String[]args){
        int[]arr = {2,34,45,5,6,9};
            System.out.println("Max:- "+findmax(arr,0));
        }
}
