public class Kata{
    public static int[] countPositivesSumNegatives(int[] input){
        if(input == null){
            return new int []{};
        }
        int pos = 0;
        int neg = 0;
        for (int i = 0; i < input.length; i ++){
          if(input[i] > 0){
            pos++;
        }
          if(input[i] < 0){
            neg += input[i];
          }
        }
        if((pos==0 && neg==0) || input == null){
        return new int []{};
        }
        int[] temp = {pos, neg};
        return temp; 
    }
}

//https://www.codewars.com/kata/576bb71bbbcf0951d5000044/train/java