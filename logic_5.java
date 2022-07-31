import java.util.*;

public class logic_5 {

    public int stringMatch(String a, String b) {
        int len = Math.min(a.length(), b.length());
        int count = 0;
        for (int i = 0; i < len - 1; i++) {

            String Sub1 = a.substring(i, i + 2);
            String Sub2 = b.substring(i, i + 2);

            if (Sub1.equals(Sub2)) {
                count++;
            }
        }
        return count;
    }

}
