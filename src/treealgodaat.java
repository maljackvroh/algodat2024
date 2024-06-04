class Node {
    int data;
    Node left;
    Node right;
    Node parent;

    public Node(int i) {
        data = i;
    }
}

class Tree {
    Node root;

    public void checkRoot(){
        System.out.println("Nilai root :"+root.data);
    }

    public boolean isEmpty(){
        return root==null;
    }
    
    public void insert(int i) {
        Node temp = new Node(i);
        Node y = null;
        Node x = root;
        
        if (isEmpty()) {
            System.out.println("Nilai " + i + " menjadi root!");
            root = temp;
        } else {
            while (x != null) {
                y = x;
                if (i < x.data) {
                x = x.left;
            } else {
                x = x.right;
            }
       }

        if (i < y.data) {
            y.left = temp;
            System.out.println("Nilai "+i+" masuk sebelah kiri "+y.data);
        } else {
            y.right = temp;
            System.out.println("Nilai "+i+" masuk sebelah kanan "+y.data);
            }
        temp.parent = y;
        }
    }
    
    private void display(Node disp, int level) {
        int k;
        if (disp != null) {
            display(disp.right, level + 1);
            for (int i = 0; i < level; i++) {
              System.out.print("\t");
        }
        System.out.println(disp.data);
        display(disp.left, level + 1);
  }
}
    
    public void searching(int i){
        Node temp = root;
        boolean hasil = false;
        while(temp != null){
            if(temp.data==i){
                hasil = true;
                break;
            }
            if(i<temp.data)
                temp = temp.left;
            else
                temp = temp.right;
        }
        
        if(hasil)
            System.out.println("Data ditemukan!");
        else
            System.out.println("Data tidak ditemukan!");
    }
    
    public void findMin(){
        Node temp = root;
        
        while(temp.left!=null){
            temp = temp.left;
        }
        System.out.println("Nilai mininum  :"+temp.data);
    }
    
    public void findMax(){
        Node temp = root;
        
        while(temp.right!=null){
            temp = temp.right;
        }
        System.out.println("Nilai maksimum :"+temp.data);
    }
    
    public void urutTree(Node i) {
        Node temp = i;
        
        if(temp != null){
            urutTree(temp.left);
            System.out.println(temp.data);
            urutTree(temp.right);
        }
    }

    public void urutRoot() {
        System.out.println("Mengurutkan tree dengan parent:");
        urutTree(root); 
    }
    
    void displayUtama(){
        System.out.println("Tampilan Tree :");
        display(root, 1);
    }
    
    
    public Node minValue(Node i){    
        Node temp = i;
        while(temp.left!=null){
            temp = temp.left;
        }
        return temp;
    }
    public void transplanted(Node del, Node reply){
        if(del.parent==null){
            root=reply;
	}else if(del==del.parent.left){
            del.parent.left=reply;
	}else{
            del.parent.right=reply;
	}	
        
        if(reply!=null)
        {
            reply.parent=del.parent;                    
        }
    }
        
    public void delete(int i) {
        Node y = null;
        Node x = root;

        while ((x != null) && (x.data != i)) {
            y = x;

            if (i < x.data)
                x = x.left;
            else
                x = x.right;
        }

        if (x == null)
            System.out.println("Data tidak ditemukan!");
        else {
            if (x.left == null) {
                transplanted(x, x.right);
            } else if (x.right == null) {
                transplanted(x, x.left);
            } else {
                Node min = minValue(x.right);

                if (min.parent != x) {
                    transplanted(min, min.right);
                    min.right = x.right;
                    min.right.parent = min;
                }

                transplanted(x, min);
                min.left = x.left;
                min.left.parent = min;
            }
            System.out.println("");
            System.out.println("Nilai " + i + " telah dihapus!");
        }
    }
}

public class treealgodaat {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(5);
        tree.insert(2);
        tree.insert(8);
        tree.insert(6);
        tree.insert(1);
        tree.insert(9);
        tree.insert(11);
        tree.insert(13);
        tree.displayUtama(); 
        tree.delete(2);
        tree.displayUtama();
        tree.findMin();
        tree.findMax();
        tree.checkRoot();
    }
}
