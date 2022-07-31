import java.util.*;

public class logic_4 {

    public boolean check123(int []arr) {
        int cnt =0 ;
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] == 1 && arr[i + 1] == 2 && arr[i + 2] == 3) {
                cnt++;
            }
        }
        if (cnt == 1) {
            return true;

        } else {
            return false;
        }
    }
}
