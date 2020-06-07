import java.util.Arrays;
public class SortAndStar {
    public static String twoSort(String[] s) {
        Arrays.sort(s);
        String temp = "";
        for(int i = 0; i < s[0].length(); i++ ){
            temp += s[0].charAt(i);
            if(i<s[0].length()-1){
                temp += "***";
            }
        }
        return temp;
    }
}

//https://www.codewars.com/kata/57cfdf34902f6ba3d300001e/train/java