public class Kata {
    public static String reverseLetter(final String str) {
        String lettersOnly = str.replaceAll("[^a-zA-Z]", "");
        StringBuilder reverse = new StringBuilder(lettersOnly);
        reverse.reverse();
        return reverse.toString();
    }
}

//https://www.codewars.com/kata/58b8c94b7df3f116eb00005b/train/java