import java.util.Arrays;

public class Kata {
  public static String highAndLow(String numbers) {
    String[] temp = numbers.split(" ");
    int minValue = Integer.parseInt(temp[0]);
    int maxValue = Integer.parseInt(temp[0]);
    for(int i=1;i < temp.length;i++){
      if(Integer.parseInt(temp[i]) > maxValue){
        maxValue = Integer.parseInt(temp[i]);
      }
    }
    for(int i=1;i<temp.length;i++) {
      if (Integer.parseInt(temp[i]) < minValue) {
         minValue = Integer.parseInt(temp[i]);
      }
    }
    return "" + maxValue + " " + minValue;
  }
}

//https://www.codewars.com/kata/554b4ac871d6813a03000035/train/java