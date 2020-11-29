public class isogram {
    public static boolean  isIsogram(String str) {
        return str.toLowerCase().chars().distinct().count() == str.length();
    } 
}

//https://www.codewars.com/kata/54ba84be607a92aa900000f1/train/java