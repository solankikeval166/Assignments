import java.util.*;

public class Main_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.print("Enter Num1:");
        num1 = sc.nextInt();
        System.out.print("Enter Num2:");
        num2 = sc.nextInt();

        logic_3 l = new logic_3();
        System.out.println(l.lastDigit(num1, num2));

    }
}
