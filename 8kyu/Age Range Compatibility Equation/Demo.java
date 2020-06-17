public class Kata{
  public static String datingRange(int age) {
    return (age<=14)?(int)(age - 0.10 * age) + "-" + (int)(age + 0.10 * age) : age/2+7 + "-" + 2*(age-7);
  }
}

//https://www.codewars.com/kata/5803956ddb07c5c74200144e/train/java