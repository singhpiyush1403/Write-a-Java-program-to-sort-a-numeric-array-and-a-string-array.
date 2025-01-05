import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        
        int[] numericArray = {34, 7, 23, 32, 5, 62};
    
        String[] stringArray = {"Apple", "Orange", "Banana", "Grapes", "Mango"};

        Arrays.sort(numericArray);
    
        Arrays.sort(stringArray);


        System.out.println("Sorted Numeric Array: " + Arrays.toString(numericArray));
        System.out.println("Sorted String Array: " + Arrays.toString(stringArray));
    }
}
