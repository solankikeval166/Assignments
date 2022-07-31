import java.util.*;

public class logic_6 {

    logic_6(String[] words, String target) {
        int cnt = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                cnt++;
            }
        }
        cnt = words.length - cnt;
        int place = 0;
        String[] str = new String[cnt];

        for (int j = 0; j < words.length; j++) {
            if (!words[j].equals(target)) {
                str[place] = words[j];
                place++;
            }
        }
        System.out.println(Arrays.toString(str));
    }
}


