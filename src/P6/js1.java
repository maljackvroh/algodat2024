package P6;

import java.util.Scanner;

class Tree {
    int data;
    Tree nodeKiri;
    Tree nodeKanan;

    public Tree(int dt) {
        data = dt;
        nodeKiri = nodeKanan = null;
    }

    public void sisipDt(int dtSisip) {
        if (dtSisip < data) {
            if (nodeKiri == null)
                nodeKiri = new Tree(dtSisip);
            else
                nodeKiri.sisipDt(dtSisip);
        } else {
            if (nodeKanan == null)
                nodeKanan = new Tree(dtSisip);
            else
                nodeKanan.sisipDt(dtSisip);
        }
    }
}

public class js1 {
    private Tree root;

    public js1() {
        root = null;
    }

    public void sisipDtNode(int dtSisip) {
        if (root == null)
            root = new Tree(dtSisip);
        else
            root.sisipDt(dtSisip);
    }

    public static void main(String[] args) {
        js1 tree = new js1();
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyak nilai: ");
        int jumlah = sc.nextInt();
        int nilai[] = new int[jumlah];
        for (int i = 0; i < nilai.length; i++) {
            Scanner inp2 = new Scanner(System.in);
            System.out.print("Nilai ke-" + (i + 1) + " = ");
            int masuk = inp2.nextInt();
            nilai[i] = masuk;
        }

        System.out.println("Isi data Tree ");
        for (int j = 0; j <= jumlah - 1; j++) {
            System.out.print(" ");
            tree.sisipDtNode(nilai[j]);
            System.out.print(nilai[j]);
        }
        System.out.println("");
    }
}
