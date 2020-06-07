public class Sid {
    public static String howMuchILoveYou(int nb_petals) {
      String[] sentences = {"I love you","a little","a lot","passionately","madly","not at all"};
      return sentences[(nb_petals - 1)%6];
    }
}

//https://www.codewars.com/kata/57f24e6a18e9fad8eb000296/train/java