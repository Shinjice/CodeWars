import java.util.Arrays;

public class DescendingOrder {
  public static int sortDesc(final int num) {
        String[] temp = String.valueOf(num).split("");
        Arrays.sort(temp);
        StringBuilder reverse = new StringBuilder();
        for(int i = temp.length -1; i >= 0; i--)
        {
            reverse.append(temp[i]);
        }
        return Integer.valueOf(reverse.toString());
    }
}

//https://www.codewars.com/kata/5467e4d82edf8bbf40000155/train/java