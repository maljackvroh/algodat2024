package P5;

import java.util.Scanner;

public class studikasus {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);

        System.out.print("Masukan nilai A: ");
        int a = inpt.nextInt();

        System.out.print("Masukan nilai B: ");
        int b = inpt.nextInt();

        
        System.out.println("Hasil A dikali B = " + perkalian(a, b));

        inpt.close();
    }

    private static int perkalian(int a, int b){
        

        if (b == 1){
            return a*b;
        }
        return b*perkalian(a, b-1);
    }
}
