package P4;

import java.util.Random;
import java.util.Scanner;

public class respon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int n = scanner.nextInt();

        int[] data = new int[n];

        // Membaca data input
        System.out.print("Masukkan data:");
        for (int i = 0; i < n; i++) {
            data[i] = scanner.nextInt();
        }

        // Menampilkan data awal
        System.out.print("Data Awal: ");
        for(int Data: data){
            System.out.print(Data+", ");
        }
        System.out.println();
        
        // Mengurutkan data dari minimum ke maksimum
        quickSort(data, 0, n - 1);
        System.out.println("Data urut minimum ke maksimum: ");
        for(int Data: data){
            System.out.print(Data+", ");
        }
        System.out.println();

        // Mengacak data
        shuffleData(data);
        System.out.println("Data acak:");
        for(int Data: data){
            System.out.print(Data+", ");
        }
        System.out.println();

         // Mengurutkan data dari minimum ke maksimum
         maxToMin(data, 0, n - 1);
         System.out.println("Data urut maksimum ke minimum: ");
         for(int Data: data){
             System.out.print(Data+", ");
         }
         System.out.println();
    }

    private static void quickSort(int[] data, int low, int high) {
        for(int i = 0; i < high; i++){
            for(int j = 0; j < high-1; j++){
                if(data[j] >  data[j+1]){
                    int temp= data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
    }

    private static void maxToMin(int[] data, int low, int high) {
        for (int i = 0; i < high; i++) {
          for (int j = 0; j < high - i - 1; j++) {
            if (data[j] < data[j + 1]) { 
              int temp = data[j];
              data[j] = data[j + 1];
              data[j + 1] = temp;
            }
          }
        }
    }

    
    private static void shuffleData(int[] data) {
        Random random = new Random();
        for (int i = data.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            quickSort(data, i, j);
        }
    }
}