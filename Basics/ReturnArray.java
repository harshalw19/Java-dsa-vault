import java.lang.reflect.Array;
import java.util.Arrays;

public class ReturnArray{

    public static void main(String[] args) {
        
        System.out.println(Arrays.toString(returnArray()));

    }


    static int[] returnArray(){

        int[] arr = {1,2,4};
        return(arr);
    
    }
}