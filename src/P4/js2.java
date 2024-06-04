package P4;

import java.util.Random;

public class js2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] data = new int[14];

        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(100);
        }

        System.out.println("Unsorted array:");
        printArray(data);

        quickSort(data, 0, data.length - 1);

        System.out.println("\nSorted array:");
        printArray(data);
    }

    private static void quickSort(int[] data, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(data, low, high);
            quickSort(data, low, pivotIndex - 1);
            quickSort(data, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] data, int low, int high) {
        int pivot = data[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (data[j] <= pivot) {
                i++;
                swap(data, i, j);
            }
        }

        swap(data, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    private static void printArray(int[] data) {
        for (int element : data) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

}
