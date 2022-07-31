import java.util.*;

public class Main_7 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = new String(" ");
        int num = 0, c= 0,r=0;
        for (r = 0; r <= 6; r++) {

            for (c = 1; c <= 6 - r; c++) {
                System.out.printf("%3s", s);
            }

            for (c = 0; c <= r; c++) {
                num = (int) Math.pow(2, c);

                System.out.printf("%3d", num);
            }

            for (c = r - 1; c >= 0; c--) {
                num = (int) Math.pow(2, c);

                System.out.printf("%3d", num);
            }
            System.out.println();
        }
    }
}
