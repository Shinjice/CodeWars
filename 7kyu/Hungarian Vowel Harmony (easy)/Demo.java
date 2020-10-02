public class Kata {
    public static String dative(String word) {
        String[] temp = word.split("");
        for(int i = word.length() -1; i >= 0; i--){
            if(temp[i].equals("e") ||
                   temp[i].equals("é") ||
                   temp[i].equals("i") ||
                   temp[i].equals("í") ||
                   temp[i].equals("ö") ||
                   temp[i].equals("ő") ||
                   temp[i].equals("ü") ||
                   temp[i].equals("ű")){
                        return word + "nek";
                   }
            if(temp[i].equals("a") ||
                    temp[i].equals("á") ||
                    temp[i].equals("o") ||
                    temp[i].equals("ó") ||
                    temp[i].equals("u") ||
                    temp[i].equals("ú")) {
                        return word + "nak";
                    }
        }
        return word;
      }
}

//https://www.codewars.com/kata/57fd696e26b06857eb0011e7/train/java