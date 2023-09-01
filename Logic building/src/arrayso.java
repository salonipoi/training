import java.util.ArrayList;
import java.util.List;

public class arrayso {

    public static List<Integer> quickSort(List<Integer> sequence) {
        int length = sequence.size();
        if (length <= 1) {
            return sequence;
        } else {
            int pivot = sequence.remove(length - 1);

            List<Integer> itemsGreater = new ArrayList<>();
            List<Integer> itemsLower = new ArrayList<>();

            for (Integer item : sequence) {
                if (item > pivot) {
                    itemsGreater.add(item);
                } else {
                    itemsLower.add(item);
                }
            }

            List<Integer> sortedLower = quickSort(itemsLower);
            List<Integer> sortedGreater = quickSort(itemsGreater);

            sortedLower.add(pivot);
            sortedLower.addAll(sortedGreater);

            return sortedLower;
        }
    }

    public static void main(String[] args) {
        List<Integer> inputSequence = new ArrayList<>();
        inputSequence.add(5);
        inputSequence.add(6);
        inputSequence.add(7);
        inputSequence.add(8);
        inputSequence.add(9);
        inputSequence.add(8);
        inputSequence.add(7);
        inputSequence.add(6);
        inputSequence.add(5);
        inputSequence.add(6);
        inputSequence.add(7);
        inputSequence.add(8);
        inputSequence.add(9);
        inputSequence.add(0);

        List<Integer> sortedSequence = quickSort(inputSequence);
        System.out.println(sortedSequence);
    }
}
/**
import java.util.Arrays;

public class QuickSort {

    public static int[] quickSort(int[] sequence) {
        int length = sequence.length;
        if (length <= 1) {
            return sequence;
        } else {
            int pivot = sequence[length - 1];
            int[] itemsGreater = new int[length - 1];
            int[] itemsLower = new int[length - 1];
            int greaterCount = 0;
            int lowerCount = 0;

            for (int i = 0; i < length - 1; i++) {
                int item = sequence[i];
                if (item > pivot) {
                    itemsGreater[greaterCount++] = item;
                } else {
                    itemsLower[lowerCount++] = item;
                }
            }

            int[] sortedLower = Arrays.copyOfRange(quickSort(itemsLower), 0, lowerCount);
            int[] sortedGreater = Arrays.copyOfRange(quickSort(itemsGreater), 0, greaterCount);

            int[] sortedSequence = new int[length];
            System.arraycopy(sortedLower, 0, sortedSequence, 0, lowerCount);
            sortedSequence[lowerCount] = pivot;
            System.arraycopy(sortedGreater, 0, sortedSequence, lowerCount + 1, greaterCount);

            return sortedSequence;
        }
    }

    public static void main(String[] args) {
        int[] inputSequence = {5, 6, 7, 8, 9, 8, 7, 6, 5, 6, 7, 8, 9, 0};

        int[] sortedSequence = quickSort(inputSequence);
        System.out.println(Arrays.toString(sortedSequence));
    }
}
*/