import java.util.Arrays;

public class ZywOo {
    public static int sumOfDifferences(int[] arr) {
        Arrays.sort(arr);
        int result = 0;
        for (int i = arr.length - 1; i > 0; i--) result += arr[i] - arr[i-1];
        return result;
    }


}

//https://www.codewars.com/kata/5b73fe9fb3d9776fbf00009e/train/java