public class Kata{
public static long stairsIn20(int[][] stairs){
        long temp = 0;

        for (int i = 0; i<stairs.length; i++) {
            for (int j = 0; j < stairs[i].length; j++) {
                temp += stairs[i][j];
            } 
        }
        return temp*20;
    }
}

//https://www.codewars.com/kata/56fc55cd1f5a93d68a001d4e/train/java