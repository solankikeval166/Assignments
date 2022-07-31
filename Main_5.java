import java.util.*;

public class Main_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1, s2;
        System.out.println("Enter String 1: ");
        s1 = sc.next();
        System.out.println("Enter String 2: ");
        s2 = sc.next();

        logic_5 l = new logic_5();
        System.out.println(l.stringMatch(s1, s2));
    }
}
