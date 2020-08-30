import java.util.*;

public class BigONemoExample {
    public static void main(String[] args) {
        final String[] nemo = new String[]{"nemo"};
        final String[] everyone = new String[]{"dory","bruce","marlin",
                "nemo","gill","bloat","nigel","squirt","darla","hank"};
        final String[] largeArray = new String[100000];
        Arrays.fill(largeArray, "nemo");
        findNemo(everyone);
    }
    public static void findNemo(String[] array) {
        for (String s : array) {
            System.out.println("running");
            if (s.equals("nemo")) {
                System.out.println("Found Nemo!!");
                break;
            }
        }
    }
}
