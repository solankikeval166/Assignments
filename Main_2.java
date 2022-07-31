import java.util.Scanner;

public class Main_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t;
        System.out.print("Enter Number Of strings:");
        t = sc.nextInt();
        while (t-- > 0) {
            String s;
            System.out.print("Enter a String :");
            s = sc.next();

            logic_2 l =new logic_2();
            l.checkOz(s);
        }
    }
}
