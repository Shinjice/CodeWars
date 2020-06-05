public class Kata {
  public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
    int sum = 0; 
    for(int i = 0; i < classPoints.length; i++)
    {
      sum += classPoints[i];
    }
    int average = sum / classPoints.length; 
    if(yourPoints > average)
    {
      return true;
    }
    return false;
  }
}

//https://www.codewars.com/kata/5601409514fc93442500010b/train/java