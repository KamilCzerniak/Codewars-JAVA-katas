public class StringCounter {
    public static int stringCounter(String inputS, char charS) {
        return (int) inputS.chars().filter(c -> c == charS).count();
    }
}
