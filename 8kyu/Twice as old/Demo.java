public class TwiceAsOld{
  public static int TwiceAsOld(int dadYears, int sonYears){
       if((dadYears/2) < sonYears){
         return sonYears*2 - dadYears;
       }
       if(sonYears == 0) {
         return dadYears;
       }
       return dadYears - sonYears*2;
  }
}

//https://www.codewars.com/kata/5b853229cfde412a470000d0/train/java