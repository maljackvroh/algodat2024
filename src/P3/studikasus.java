// Sebuah bank membutuhkan program untuk melakukan antrian data , buatlah program tersebut dengan metode queue. Dengan syarat: 
//     • Menggunakan array atau linked list 
//     • Ada 2 menu berbeda untuk teller dan nasabah
package P3;

import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.Scanner;

class Queue{
    private String id;
    private String nama;

    public Queue(String id, String nama){
        this.id=id;
        this.nama = nama;
    }

    public String getId(){
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

    // Dequeue = proses pengambilan elemen di posisi depan 
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Antrian kosong, harap masukan data terlebih dahulu");
        } else{
            Queue nam = queue.getFirst();
            queue.pollFirst();
            System.out.println(nam+ " telah keluar dari antrian");
        }
        
    }

    // Enqueue = proses penambahan elemen di posisi belakang 
    public void enqueue(Queue qwq) {
        queue.add(qwq);
        System.out.println("Antrian berhasil ditambahkan");
    }

    // Peek
    public Queue peek(){
        if(isEmpty()){
            Queue qw = queue.getFirst();
            System.out.println("Antrian teratas: " + qw.getId()+".");
            System.out.println("Dengan nama: "+qw.getNama()+".");
            return qw;
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }



    // Display
    public void display(){
        if(!isEmpty()){
            System.out.println("====================");
            System.out.println("Isi antrian");
            for(Queue queue: queue){
                System.out.println("ID: "+queue.getId());
                System.out.println("Nama: "+queue.getNama());
            }
            System.out.println("--------------------");
        } else{
            System.out.println("Antrian Kosong!");
        }
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public int cekUkuran(){
        return queue.size();
    }

    public Queue getFirst() {
        if(isEmpty()){
            System.out.println("Antrian Kosong, silahkan input terlebih dahulu");
            return null;
        } else{
            return queue.getFirst();
        }
    }
}

class User{
    queueProccess queue = new queueProccess();
    Boolean exit = true;
    
    public void teller(){
        Scanner in = new Scanner(System.in);
        Boolean exit = true;

        System.out.println("Anda adalah teller");
        System.out.println("Silahkan pilih menu:");
        System.out.println("1. Melihat isi Antrian");
        System.out.println("2. Melihat data paling depan");
        System.out.println("3. Mengeluarkan data paling depan");
        System.out.println("4. Keluar");
        System.out.print("Pilihan: ");
        int pill = in.nextInt();
        // in.nextLine();
        
        while (exit) {
            switch (pill) {
                case 1:
                    queue.display();
                    System.out.println("--------------------");
                    break;
                case 2:
                    queue.getFirst();
                    System.out.println("--------------------");
                    break;
                case 3:
                    queue.dequeue();
                    System.out.println("--------------------");
                    break;
                case 4:
                    exit = false;
                    System.out.println("Terima kasih telah menjalankan tugas anda dengan baik!");
                    System.out.println("--------------------");
                    break;
                default:
                    System.out.println("Anda salah inputan");
                    System.out.println("--------------------");
                    break;
            }   

            if(pill != 4){
                teller();
            }
        }
    }
    
    public void nasabah(){
        Scanner in = new Scanner(System.in);
        Boolean exit = true;
        int nextId = 0;
        DecimalFormat df = new DecimalFormat("000");

        System.out.println("Anda adalah nasabah");
        System.out.println("Silahkan pilih menu:");
        System.out.println("1. Melihat isi Antrian");
        System.out.println("2. Melihat data paling depan");
        System.out.println("3. Menambah isi antrian");
        System.out.println("4. Keluar");
        System.out.print("Pilihan: ");
        int pill = in.nextInt();
        in.nextLine();

        while (exit) {
            switch (pill) {
                case 1:
                    queue.display();
                    System.out.println("--------------------");
                    break;
                case 2:
                    queue.getFirst();
                    System.out.println("--------------------");
                    break;
                case 3:

                    System.out.print("Masukan nama anda: ");
                    String name = in.nextLine();
                    
                    nextId++;
                    
                    String id = df.format(nextId);

                    Queue qwq = new Queue(name, id);
                    queue.enqueue(qwq);
                    System.out.println("--------------------");
                    break;
                case 4:
                    exit = false;
                    System.out.println("Terima kasih telah menjalankan tugas anda dengan baik!");
                    System.out.println("--------------------");
                    break;

                default:
                    System.out.println("Anda salah inputan");
                    System.out.println("--------------------");
                    break;
            }

            if(pill != 4){
                nasabah();
            }
            
        }   
    }

}

public class studikasus{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        
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
}