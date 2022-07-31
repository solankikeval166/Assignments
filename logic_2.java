import java.util.*;

public class logic_2 {

    public void checkOz(String a) {
        if (a.charAt(0) == 'o' || a.charAt(0) == 'O') {
            if (a.charAt(1) == 'z' || a.charAt(1) == 'Z') {
                System.out.println("oz");
            } else {
                System.out.println("o");
            }
        } else if (a.charAt(1) == 'z' || a.charAt(1) == 'Z') {
            System.out.println("z");
        } else {
            System.out.println("The character o and z isn't found in inputted string.");
        }
    }
}
