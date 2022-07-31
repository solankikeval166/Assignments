import java.util.*;


public class Main_10 {

    public static void main(String[] arg) {
        logic_10 l = new logic_10();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the text : ");
        String text = sc.next();

        System.out.print("Enter the shift : ");
        int s = sc.nextInt();

        System.out.println("Text : " + text);
        System.out.println("Shift : " + s);
        System.out.println("Cipher : " + l.encrypt(text, s));

        sc.close();
    }
}

