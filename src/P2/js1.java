package P2;
import java.util.Scanner;
import java.util.Stack;

public class js1 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<String> stack = new Stack<>();

        while (stack.size() < 5) {
            System.out.print("Masukan data yang ingin anda masukan: ");
            String input = in.nextLine();
            in.close();
            stack.push(input);
        }
        
        System.out.println("Menampilkan nilai pada stack!!");

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        

    }
}
