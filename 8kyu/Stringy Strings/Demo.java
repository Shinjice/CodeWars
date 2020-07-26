public class Kata {
   public static String stringy(int size) {
        String temp = "";
        for(int i = 0; i < size; i++){

            if(i%2==0){
                temp +="1";
            } else {
                temp +="0";
            }
        }
        return temp;
    }
}

//https://www.codewars.com/kata/563b74ddd19a3ad462000054/train/java