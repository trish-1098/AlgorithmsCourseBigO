public class BoxesExample {
    public static void main(String[] args) {
        final int[] boxes = new int[]{1,2,3,4,5};
        logAllPairs(boxes);
    }

    public static void logAllPairs(int[] array) {
        for (int n1: array) {
            for (int n2: array) {
                System.out.println(n1 + ", " + n2);
            }
        }
    }
}
