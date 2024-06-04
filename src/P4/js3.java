package P4;

import java.util.Random;

public class js3 {
    public static void main(String[] args) {
        int[] data = new int[14];

        Random random = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(100);
        }

        System.out.println("Data sebelum diurutkan: ");
        for (int i : data) {
            System.out.print(i + " ");
        }

        // Melakukan Selection Sort
        for (int i = 0; i < data.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = data[i];
            data[i] = data[minIndex];
            data[minIndex] = temp;
        }

        System.out.println("\nData setelah diurutkan: ");
        for (int i : data) {
            System.out.print(i + " ");
        }
    }

}
