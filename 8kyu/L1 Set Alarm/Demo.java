public class Alarm {
  public static boolean setAlarm(boolean employed, boolean vacation) {
    return  (employed==true&&vacation==true) ? false: 
            (employed==false&&vacation==true) ? false :
            (employed==false&&vacation==false) ? false :
            true;
  }
}

//https://www.codewars.com/kata/568dcc3c7f12767a62000038/train/java