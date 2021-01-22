import static java.util.stream.Collectors.joining;
import static java.util.stream.Stream.of;

class Solution{
    public static String solve(String a, String b){
        return of((a + b).split("")).filter(c -> a.contains(c) ^ b.contains(c)).collect(joining());
    }
}

//https://www.codewars.com/kata/5a262cfb8f27f217f700000b/train/java