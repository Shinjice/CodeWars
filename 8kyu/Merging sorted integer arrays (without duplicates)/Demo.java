import java.util.Arrays;

public class Kata {
 public static int[] mergeArrays(int[] first, int[] second) {
        int aLen = first.length;
        int bLen = second.length;
        int[] result = new int[aLen + bLen];

        System.arraycopy(first, 0, result, 0, aLen);
        System.arraycopy(second, 0, result, aLen, bLen);

        result =  java.util.stream.IntStream.of(result).distinct().toArray();

        Arrays.sort(result);

        return result;
    }
}

//https://www.codewars.com/kata/573f5c61e7752709df0005d2/train/java