/**
 *
 * @author devjay
 */
 import java.util.Arrays;
public class QuickSort {
    public static void quickSort(int[] input, int from, int to) {
        if (from < to) {
            int indexOfPivot = partition(input, from, to);
            quickSort(input, from, indexOfPivot - 1);
            quickSort(input, indexOfPivot + 1, to);
        }
    }

    public static int partition(int[] input, int from, int to) {
        int pivot = input[to];
        int wall = from;
        for (int i = from; i < to; i++) {
            if (input[i] <= pivot) {
                int temp = input[wall];
                input[wall] = input[i];
                input[i] = temp;
                wall++;
            }
        }
        input[to] = input[wall];
        input[wall] = pivot;

        return wall;
    }

    public static void main(String[] args) {
        //initialize
        int[] input = {10, 8, 1, 88, 64, 21, 19, 4, 3, 2};

        // sort
        quickSort(input,0,input.length-1);
        // print
        System.out.println(Arrays.toString(input));

    }

}
