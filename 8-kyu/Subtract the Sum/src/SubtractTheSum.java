import java.util.Arrays;

public class SubtractTheSum {
    public static String subtractSum(int n) {

        String[] fruits = {
                "kiwi",
                "pear",
                "kiwi",
                "banana",
                "melon",
                "banana",
                "melon",
                "pineapple",
                "apple",
                "pineapple",
                "cucumber",
                "pineapple",
                "cucumber",
                "orange",
                "grape",
                "orange",
                "grape",
                "apple",
                "grape",
                "cherry",
                "pear",
                "cherry",
                "pear",
                "kiwi",
                "banana",
                "kiwi",
                "apple",
                "melon",
                "banana",
                "melon",
                "pineapple",
                "melon",
                "pineapple",
                "cucumber",
                "orange",
                "apple",
                "orange",
                "grape",
                "orange",
                "grape",
                "cherry",
                "pear",
                "cherry",
                "pear",
                "apple",
                "pear",
                "kiwi",
                "banana",
                "kiwi",
                "banana",
                "melon",
                "pineapple",
                "melon",
                "apple",
                "cucumber",
                "pineapple",
                "cucumber",
                "orange",
                "cucumber",
                "orange",
                "grape",
                "cherry",
                "apple",
                "cherry",
                "pear",
                "cherry",
                "pear",
                "kiwi",
                "pear",
                "kiwi",
                "banana",
                "apple",
                "banana",
                "melon",
                "pineapple",
                "melon",
                "pineapple",
                "cucumber",
                "pineapple",
                "cucumber",
                "apple",
                "grape",
                "orange",
                "grape",
                "cherry",
                "grape",
                "cherry",
                "pear",
                "cherry",
                "apple",
                "kiwi",
                "banana",
                "kiwi",
                "banana",
                "melon",
                "banana",
                "melon",
                "pineapple",
                "apple",
                "pineapple",};

        if (n > 100) {
            while (n > 100) {
                n -= Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum();
            }
            return fruits[n - 1];
        }
        return fruits[n - 1 - Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum()];
    }
}
