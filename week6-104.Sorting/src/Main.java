
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // indexes:    0  1  2  3   4
        int[] values = {3, -5, 6, 1, -11, 1, 3, 7, 5};
        System.out.println(indexOfTheSmallestStartingFrom(values, 1));
        System.out.println(indexOfTheSmallestStartingFrom(values, 2));
        System.out.println(indexOfTheSmallestStartingFrom(values, 4));

    }

    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }

        }

        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        int smallest = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i] <= smallest(array)) {
                smallest = i;
            }

        }

        return smallest;

    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {

        int smallest = index;

        for (int i = index; i < array.length; i++) {
            if (array[i] < array[smallest]) {
                smallest = i;

            }

        }

        return smallest;
    }
    
   
    public static void swap(int[] array, int index1, int index2) {
        int first = array[index1];
        int second = array[index2];

        array[index1] = second;
        array[index2] = first;

    }

     public static void sort(int[] array) {

        for (int i = 0; i < array.length-1; i++) {
            int smallest = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, smallest);

            
        }
    }


        /*int n = array.length;
         int temp = 0;
               
         for(int i=0; i < n; i++){
         for(int j=1; j < (n-i); j++){
                               
         if(array[j-1] > array[j]){
         //swap the elements!
         temp = array[j-1];
         array[j-1] = array[j];
         array[j] = temp;
         }
                               
         }
         }
         */
    }

