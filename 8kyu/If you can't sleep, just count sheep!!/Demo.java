class Kata {
  public static String countingSheep(int num) {
    String temp = "";
    for (int i = 1; i <= num; i++) {
      temp = temp + i + " sheep...";
    }
    return temp;
  }
}

//https://www.codewars.com/kata/5b077ebdaf15be5c7f000077/train/java