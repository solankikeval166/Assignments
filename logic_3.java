import java.util.*;

public class logic_3 {
    public static boolean lastDigit(int n1, int n2) {
        while (n2 > 10 && n1>10) {
            n1 = n1 %10;
            n2 = n2 % 10;
        }

        if (n1 == n2) {
            return true;
        }
        else {
            return false;
        }
    }
}
