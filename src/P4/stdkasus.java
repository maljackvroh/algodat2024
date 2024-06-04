package P4;

import java.util.ArrayList;
import java.util.Scanner;

public class stdkasus {
    public static void main(String[] args) {
        ArrayList<String> daftarBarang = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int pill;

        do{
            System.out.println("Pilih Menu");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Hapus Barang");
            System.out.println("3. Cari Barang");
            System.out.println("4. List Barang");
            System.out.println("0. Keluar");

            System.out.print("Pilih: ");
            pill = in.nextInt();
            in.nextLine();

            switch (pill) {
                case 1:
                    System.out.print("Masukan nama barang: ");
                    String namaBarang = in.nextLine();
                    daftarBarang.add(namaBarang);
                    System.out.println(namaBarang+ " telah ditambahkan!");
                    break;
                case 2:
                    System.out.print("Masukan nama barang ingin dihapus:  ");
                    String hapusBarang = in.nextLine();
                    if (daftarBarang.contains(hapusBarang)) {
                        daftarBarang.remove(hapusBarang);
                        System.out.println("Barang "+hapusBarang+" dihapus!");
                    } else{
                        System.out.println(hapusBarang + " tidak ditemukan");
                    }
                    break;
                case 3:
                    System.out.print("Masukan barang yang ingin dicari: ");
                    String cariBarang = in.nextLine();
                    if (daftarBarang.contains(cariBarang)) {
                        System.out.println("Barang "+cariBarang+" ditemukan!");
                    } else{
                        System.out.println(cariBarang + " tidak ditemukan");
                    }
                    break;

                case 4:
                    System.out.println("DAFTAR BARANG");
                    for(String a : daftarBarang){
                        System.out.println(a);
                    }
                    break;
                case 0:
                    System.out.println("Bye!!");
                    break;
                default:
                    System.out.println("pilihan tidak valid");
                    break;
            }
        } while(pill != 0);
    }
}
