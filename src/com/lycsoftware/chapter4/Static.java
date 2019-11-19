public class Static {
    private static int one;
    private static final int two;
    private static final int three;
    private static final int four; // DOES NOT COMPILE
    static {
        one = 1;
        two = 2;
        three = 3; // DOES NOT COMPILE
        two = 4; // DOES NOT COMPILE
    }
}