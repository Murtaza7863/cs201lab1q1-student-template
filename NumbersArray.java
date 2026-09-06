import java.util.*;

public class NumbersArray {
    public static void main(String[] args) {
        Integer[] input = {1,2,3,4,1,5};

        System.out.println("Input : " + Arrays.toString(input));
        System.out.println("Max number : " + findMax(input));
        System.out.println("Duplicate numbers : " + Arrays.toString(findDuplicates(input)));
        System.out.println("Unique numbers : " + Arrays.toString(findUnique(input)));       
        
        System.out.println();

        input = new Integer[] {1,2,3,4,1,2,5,3};

        System.out.println("Input : " + Arrays.toString(input));
        System.out.println("Max number : " + findMax(input));
        System.out.println("Duplicate numbers : " + Arrays.toString(findDuplicates(input)));
        System.out.println("Unique numbers : " + Arrays.toString(findUnique(input))); 
    }

    // Write your methods here
    public static int findMax(Integer[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static Integer[] findDuplicates(Integer[] array) {
        int size = 0;
        Integer[] temp = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    count++;
                }
            }
            if (count > 1) {
                boolean alreadyAdded = false;
                for (int k = 0; k < size; k++) {
                    if (temp[k].equals(array[i])) {
                        alreadyAdded = true;
                        break;
                    }
                }
                if (!alreadyAdded) {
                    temp[size] = array[i];
                    size++;
                }
            }
        }
        Integer[] result = new Integer[size];
        for (int i = 0; i < size; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    public static Integer[] findUnique(Integer[] array) {
        int size = 0;
        Integer[] temp = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    count++;
                }
            }
            if (count == 1) {
                temp[size] = array[i];
                size++;
            }
        }
        Integer[] result = new Integer[size];
        for (int i = 0; i < size; i++) {
            result[i] = temp[i];
        }
        return result;
    }
}
