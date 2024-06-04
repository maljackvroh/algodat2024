package P4;

import java.util.Random;
import java.util.Scanner;

public class js6 {
    public static void main(String[] args) {
        int[] data = new int[14];
        Random random = new Random();
        
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(100);
        }

        System.out.print("Data: ");
        for (int i : data) {
            System.out.print(i + " ");
        }

        int nilaiCari = 0;
        System.out.print("\nMasukkan nilai yang ingin dicari: ");
        nilaiCari = new Scanner(System.in).nextInt();

        int indeks = binarySearch(data, 0, data.length - 1, nilaiCari);

        if (indeks != -1) {
            System.out.println("\nNilai " + nilaiCari + " ditemukan pada indeks " + indeks);
        } else {
            System.out.println("\nNilai " + nilaiCari + " tidak ditemukan.");
        }
    }

    private static int binarySearch(int[] data, int low, int high, int nilaiCari) {
        if (high >= low) {
            int mid = (low + high) / 2;

            if (data[mid] == nilaiCari) {
                return mid;
            } else if (data[mid] > nilaiCari) {
                return binarySearch(data, low, mid - 1, nilaiCari);
            } else {
                return binarySearch(data, mid + 1, high, nilaiCari);
            }
        }
        return -1;
    }

}
