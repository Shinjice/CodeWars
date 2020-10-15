public class Troll {
     public static String disemvowel(String str) {
        return str.replace("i","").replace("I","")
                .replace("o","").replace("O","")
                .replace("a","").replace("A","")
                .replace("e","").replace("E","")
                .replace("u","").replace("U","");
    }
}

//https://www.codewars.com/kata/52fba66badcd10859f00097e/train/java