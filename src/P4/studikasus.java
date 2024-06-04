package P4;

import java.util.Scanner;



public class studikasus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("PROGRAM SHORTING");
        
        System.out.print("Masukan banyak data yang ingin anda masukan: ");
        int qty = in.nextInt();
        int[] data = new int[qty];
        
        System.out.println("Masukan elemen elemen");
        for (int i = 0; i < qty; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            data[i]=in.nextInt();
        }
        
        

        System.out.println("Pilih metode shorting yg ingin anda gunakan");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Insertion Sort");
        System.out.print("Pilih: ");
        int pil = in.nextInt();


            
        switch (pil) {
            case 1:
                bubbleSort(data);
                break;
        
            case 2:
                insertionSort(data);
                break;

            default:
                System.out.println("Inputan tidak  valid");

        }    
    }

    public static void bubbleSort(int[] data){
        int n = data.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-1; j++){
                if(data[j] >  data[j+1]){
                    int temp= data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }

                System.out.println("Iterasi ke- "+j);
                print(data);
            }
        }

        System.out.println("HASIL SORTING DENGAN BUBBLE SORT!!");
        print(data);
        System.exit(0);

    }

    public static void insertionSort(int[] data){
        int n = data.length;

        for(int i = 1; i < n; i++){
            int key = data[i];
            int j = i-1;


            while (j >= 0 && data[j] > key) {
                data[j+1] = data[j];
                j--;
            }

            data[j+1] = key;

            System.out.println("Iterasi ke- "+j + ": ");
        }
        System.out.println("HASIL SORTING DENGAN INSERTION SORT!!");
        print(data);
        System.exit(0);
    }

    public static void print(int[] data){
        
        for(int i : data){
            System.out.print(i+", ");
        }

        System.out.println();
    }
}

