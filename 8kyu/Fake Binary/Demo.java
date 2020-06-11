public class FakeBinary {
 public static String fakeBin(String numberString) {
        String temp = "";
        for(int i = 0; i < numberString.length(); i++){
            if(Character.getNumericValue(numberString.charAt(i))<5){
                temp += "0";
            }
            if(Integer.parseInt(String.valueOf(numberString.charAt(i)))>=5){
                temp += "1";
            }
        }
        return temp;
    }
}

//used two different if statements, but does the same.

//https://www.codewars.com/kata/57eae65a4321032ce000002d/train/java