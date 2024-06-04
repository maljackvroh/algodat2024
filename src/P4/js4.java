package P4;

import java.util.Random;

public class js4 {
    public static void main(String[] args) {
        int[] data = new int[14];

        Random random = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(100);
        }

        System.out.println("Array sebelum diurutkan:");
        for (int i : data) {
            System.out.print(i + " ");
        }

        insertionSort(data);

        System.out.println("\nArray setelah diurutkan:");
        for (int i : data) {
            System.out.print(i + " ");
        }
    }

    private static void insertionSort(int[] data) {
        for (int i = 1; i < data.length; i++) {
            int key = data[i];
            int j = i - 1;

            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j--;
            }

            data[j + 1] = key;
        }
    }

}
