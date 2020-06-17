public class Kata
{
 public static int[] squareOrSquareRoot(int[] array)
    {
        for(int i = 0; i < array.length; i++){
            double temp = Math.sqrt(array[i]);
            if(temp % 1 == 0){
                array[i] = (int) temp;
            } else {
                array[i] = array[i] * array[i];
            }
        }
        return array;
    }
}

//https://www.codewars.com/kata/57f6ad55cca6e045d2000627/train/java