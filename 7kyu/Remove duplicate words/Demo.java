import java.util.Arrays;
import java.util.stream.Collectors;

class Solution{
    public static String removeDuplicateWords(String s){
        String[] temp = s.split(" ");
        return Arrays.stream(temp).distinct().collect(Collectors.joining(" "));
    }
}

//https://www.codewars.com/kata/5b39e3772ae7545f650000fc/train/java