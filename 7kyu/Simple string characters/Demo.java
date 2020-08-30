
public class Kata {

    public static int[] Solve(String word) {
        int[] temp = new int[4];
        for(int i = 0; i<word.length(); i++){
            if(Character.isUpperCase(word.charAt(i))){
                temp[0]++;
            }
            else if(Character.isLowerCase(word.charAt(i))){
                temp[1]++;
            }
            else if(Character.isDigit(word.charAt(i))){
                temp[2]++;
            } else {
                temp[3]++;
            }
        }
        return temp; 
    }
}

//https://www.codewars.com/kata/5a29a0898f27f2d9c9000058/train/java