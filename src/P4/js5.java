package P4;

import java.util.Random;
import java.util.Scanner;

public class js5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] data = new int[14];
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(100);
        }

        System.out.print("Data: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }

        // Get the number to search for
        System.out.print("\nMasukkan data yang ingin dicari: ");
        int target = scanner.nextInt();

        int index = sequentialSearch(data, target);

        if (index != -1) {
            System.out.println("Data " + target + " ditemukan pada indeks " + index);
        } else {
            System.out.println("Data " + target + " tidak ditemukan.");
        }
        scanner.close();
    }

    private static int sequentialSearch(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
