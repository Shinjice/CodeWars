public class MonkeyCounter
{
  public static int[] monkeyCount(final int n){
    int[]temp=new int[n];
    for(int i = 0; i < temp.length; i++){
      temp[i] = i + 1;
    }
    return temp;
  }
}

//https://www.codewars.com/kata/56f69d9f9400f508fb000ba7/train/java