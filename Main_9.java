import java.util.*;

public class Main_9 {

    public static void main(String[] argc) {
        Scanner sc = new Scanner(System.in);
        int[][] sudo = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sudo[i][j] = sc.nextInt();
            }
        }

        int[] r = new int[9];
        int[] c = new int[9];

        int sum_r = 0, sum_c = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                r[i] += sudo[i][j];
            }
            if (r[i] == 45) {
                sum_r += r[i];
            } else {
                System.out.println("The Solution isn't valid");
                break;
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                c[i] += sudo[j][i];
            }
            if (c[i] == 45) {
                sum_c += r[i];
            } else {
                System.out.println("The Solution isn't valid");
                break;
            }
        }
        if (sum_r + sum_c == 810) {
            System.out.println("The Solution is valid");
        }
        sc.close();
    }
}

