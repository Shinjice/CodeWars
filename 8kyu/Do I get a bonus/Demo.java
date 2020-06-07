public class Kata{
  public static String bonusTime(final int salary, final boolean bonus) {
    return "\u00A3" + (bonus ? 10 : 1) * salary;
  }
}

//https://www.codewars.com/kata/56f6ad906b88de513f000d96/train/java