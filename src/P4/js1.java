package P4;

import java.util.Random;

public class js1 {
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

    for (int i = 0; i < data.length - 1; i++) {
      for (int j = 0; j < data.length - i - 1; j++) {
        if (data[j] > data[j + 1]) {
          int temp = data[j];
          data[j] = data[j + 1];
          data[j + 1] = temp;
        }
      }
    }

    System.out.println("\nArray setelah diurutkan:");
    for (int i : data) {
      System.out.print(i + " ");
    }
  }    
}
