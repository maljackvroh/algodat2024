// Membuat program tumpukan buku dengan meneraplan stack dimana atribut buku terdiri dari id, nama_buku, nama_pengarang, dan tahun_terbit.
// Kemudian pada stack terdapat operasi sebagai berikut :
// Push() : memasukkan buku ke dalam stack
// Pop() : mengambil buku teratas dari tumpukan
// Peek() : melihat buku teratas tanpa menghapusnya
// Print() : menampilkan isi stack
// cekUkuran() : menampilkan ukuran stack
// isEmpty() dan isFull() : cek kondisi

package P2;

import java.util.ArrayList;
import java.util.Scanner;

class Buku{
    private int id;
    private String namaBuku;
    private String namaPengarang;
    private int tahunTerbit;
    
    // Setter
    Buku(int id, String namaBuku, String namaPengarang, int tahunTerbit){
        this.id = id;
        this.namaBuku = namaBuku;
        this.namaPengarang = namaPengarang;
        this.tahunTerbit = tahunTerbit;
    }

    // Getter
    public int getId(){
        return id;
    }

    public String getnamaBuku(){
        return namaBuku;
    }

    public String getnamaPengarang(){
        return namaPengarang;
    }

    public int gettahunTerbit(){
        return tahunTerbit;
    }
}

class tumpukanBuku{
    private int max;
    private ArrayList<Buku> stack;

    public tumpukanBuku(int max){
        this.max = max;
        stack = new ArrayList<>();
    }

    public void push(Buku buku){
        if (stack.size() < max){
            stack.add(buku);
            System.out.println("Buku dengan ID "+buku.getId() + " berhasil ditambahkan");
        } else {
            System.out.println("Stack sudah penuh, gomennnn....");
        }
    }

    public Buku pop(){
        if(!isEmpty()){
            Buku buku = stack.remove(stack.size()- 1);
            System.out.println("Buku "+ buku.getnamaBuku() +" telah diambil dari stack!");
            return buku;
        } else{
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public Buku peek(){
        if (!isEmpty()) {
            Buku buku = stack.get(stack.size() - 1);
            System.out.println("Buku teratas memiliki ID " + buku.getId() + ".");
            System.out.println("Dengan judul " + buku.getnamaBuku());
            return buku;
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public void print(){
        if (!isEmpty()) {
            System.out.println("---------------------------------------------------------------------------");
            System.out.println(" Isi Stack");
            System.out.println("---------------------------------------------------------------------------");
            for (Buku buku : stack) {
                System.out.println("ID: " + buku.getId());
                System.out.println("Nama Buku: " + buku.getnamaBuku());
                System.out.println("Nama Pengarang: " + buku.getnamaPengarang());
                System.out.println("Tahun Terbit: " + buku.gettahunTerbit() + "\n");
            }
            System.out.println("---------------------------------------------------------------------------");
            } else {
                System.out.println(
                    "Stack kosong. .");
            }
    }
                    
    public int cekUkuran() {
        return stack.size();
    }
                    
    public boolean isEmpty() {            
        return stack.isEmpty();
    }
                    
    public boolean isFull() {
        return stack.size() == max;
    }
}

public class studikasus {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan ukuran stack: ");
        int max = scan.nextInt();  
        System.out.println("Batas stack telah dibuat.....");
        tumpukanBuku tumpuk = new tumpukanBuku(max);

        System.out.println("---------------------------------------------------------------------------");
        
        
        while (true) {
            System.out.println("Pilihan menu: ");
            System.out.println("1. Push buku");
            System.out.println("2. Pop buku");
            System.out.println("3. Tampilkan buku teratas");
            System.out.println("4. Tampilkan semua buku dalam stack");
            System.out.println("5. Cek ukuran stack");
            System.out.println("6. Cek status ukuran stack");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu: ");
            int pill = scan.nextInt();
            System.out.println("---------------------------------------------------------------------------");
        

            switch (pill) {
                case 1:
                    System.out.print("Masukan ID buku: ");
                    int id = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Masukan nama buku: ");
                    String nama = scan.nextLine();
                    System.out.print("Masukan nama pengarang buku: ");
                    String pengarang = scan.nextLine();
                    System.out.print("Masukan tahun terbit buku: ");
                    int tahun = scan.nextInt();
                    
                    Buku buku = new Buku(id, nama, pengarang, tahun);
                    tumpuk.push(buku);
                    break;
                
                case 2:
                    tumpuk.pop();
                    break;

                case 3:
                    tumpuk.peek();
                    break;

                case 4:
                    tumpuk.print();
                    break;

                case 5:
                    System.out.println("Ukuran stack "+tumpuk.cekUkuran());
                    break;
                
                case 6: 
                    System.out.println("Status ukuran stack");
                    if(tumpuk.isFull()){
                        System.out.println("Stack ini penuh!");
                    } else if (tumpuk.isEmpty()) {
                        System.out.println("Stack ini kosong!");
                    } else{
                        System.out.println("Stack ini belum penuh dan tidak kosong!");
                    }
                    break;
                
                case 7:
                    System.exit(0);
                    scan.close();
                default:
                    System.out.println("Pilihan tidak tersedia");
            }
        }
    }
}
