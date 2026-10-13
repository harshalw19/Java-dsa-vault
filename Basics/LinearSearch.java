import java.util.Scanner;

public class LinearSearch {

    public static int search(int[] arr, int target){

        for (int i=0; i<arr.length; i++){
            
            if(arr[i] == target){
                return i;
            }
        }

         return -1;
    }
    
    static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Result  for linear search: ");
        int[] arr= {1,22, 4,54, 67};
        System.out.println("Enter the Target: ");
        int target= input.nextInt();

        int result = search(arr, target);

        if(result != -1){
            System.out.println("Target found at index "+ result);
        }
        else{
            System.out.println("Target not found!");
        }


    }


}
