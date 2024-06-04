// Sebuah bank membutuhkan program untuk melakukan antrian data , buatlah program tersebut dengan metode queue. Dengan syarat: 
//     • Menggunakan array atau linked list 
//     • Ada 2 menu berbeda untuk teller dan nasabah
package P3;

import java.util.LinkedList;
import java.util.Scanner;

class Queue{
    private int id;
    private String nama;

    public Queue(int id, String nama){
        this.id=id;
        this.nama = nama;
    }

    public int getId(){
        return id;
    }

    public String getNama(){
        return nama;
    }
}

class queueProccess{
    private LinkedList<Queue> queue;

    public queueProccess(){
        queue = new LinkedList<>();
    }

    // Dequeue
    public static void dequeue(){

    }

    // Peek
    public static void peek(){

    }

    // Enqueue atau status
    public static void enqueue() {
        
    }


    // Display
    public static void display(){

    }

    // input
    public static void input(){

    }
}

class User{
    
    public static void teller(){
        Scanner in = new Scanner(System.in);

        System.out.println("Anda adalah teller");
        System.out.println("Silahkan pilih menu:");
        System.out.println("1. Melihat isi Antrian");
        System.out.println("2. Melihat data paling depan");
        System.out.println("3. Mengeluarkan data paling depan");
        System.out.println("4. Membatalkan data antrian");
        System.out.println("5. Keluar");
        System.out.print("Pilihan: ");
        int pill = in.nextInt();
        
        while (pill != 5) {
            switch (pill) {
                case 1:
                    System.out.println("case 1");
                    break;
                case 2:
                System.out.println("case 2");
                    break;
                case 3:
                    System.out.println("case 3");
                    break;
                case 4:
                    System.out.println("case 4");
                    break;
    
                case 5:
    
                    in.close();
                    break;
                default:
                    System.out.println("Anda salah inputan");
                    break;
            }
        }
        
    }
    
    public static void nasabah(){
        Scanner in = new Scanner(System.in);

        System.out.println("Anda adalah nasabah");
        System.out.println("Silahkan pilih menu:");
        System.out.println("1. Melihat isi Antrian");
        System.out.println("2. Melihat data paling depan");
        System.out.println("3. Mengeluarkan data paling depan");
        System.out.println("4. Membatalkan data antrian");
        System.out.println("5. Keluar");
        System.out.print("Pilihan: ");
        int pill = in.nextInt();

        switch (pill) {
            case 1:
                
                break;
            case 2:

                break;
            case 3:
            
                break;
            case 4:

                break;

            case 5:

                in.close();
                break;
            default:
                break;
        }
    }

}

public class studikasus{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        queueProccess queue = new queueProccess();
        User user = new User();

        System.out.println("====================================");

        while (true) {
            System.out.println("SELAMAT DATA DI BANK JAGOO!");
            System.out.println("Apakah anda adalah Teler?");
            System.out.println("1. Bank");
            System.out.println("2. Nasabah");
            System.out.println("3. Keluar");
            System.out.print("Pilih: ");
            int pill = in.nextInt();
            switch (pill) {
                case 1:
                    user.teller();
                    break;

                case 2:
                    user.nasabah();
                    break;

                case 3:
                    System.exit(0);
                    in.close();
                    break;

                default:
                    System.out.println("Inputan anda salah!");
                    System.out.println("Jika anda ingin keluar pilih 3");
                    System.out.println("Coba lagi!");
                    break;
            }
        }
    }

    public static void bank(){
        
    }

    public static void nasabah(){

    }
}